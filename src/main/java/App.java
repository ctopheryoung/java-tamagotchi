import java.util.HashMap;
import java.util.ArrayList;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";


        get("/", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();
          model.put("template", "templates/index.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/tamagotchis", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();

          Tamagotchi myTamagotchi = request.session().attribute("tamagotchi");
          String name;
          if(myTamagotchi == null) {
            name = request.queryParams("name");
            myTamagotchi = new Tamagotchi(name);
            request.session().attribute("tamagotchi", myTamagotchi);
          } else {
            name = myTamagotchi.getName();
          }

          String action = request.queryParams("action");
          if (action != null){
            if (action.equals("feed")) {
              myTamagotchi.feed();
            } else if (action.equals("play")) {
              myTamagotchi.play();
            } else if (action.equals("nap")) {
              myTamagotchi.nap();
            } else if (action.equals("sleep")) {
              myTamagotchi.sleep();
            }
          }

          model.put("myTamagotchi", myTamagotchi);
          model.put("template", "templates/success.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

    }
}

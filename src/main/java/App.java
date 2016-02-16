import java.util.HashMap;
import java.util.ArrayList;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        // 
        // get("/", (request, response) -> {
        //   HashMap<String, Object> model = new HashMap<String, Object>();
        //   model.put("template", "templates/index.vtl");
        //   model.put("places", request.session().attribute("places"));
        //   return new ModelAndView(model, layout);
        // }, new VelocityTemplateEngine());
        //
        // post("/places", (request, response) -> {
        //   HashMap<String, Object> model = new HashMap<String, Object>();
        //
        //   ArrayList<Places> places = request.session().attribute("places");
        //
        //   if (places == null) {
        //     places = new ArrayList<Places>();
        //     request.session().attribute("places", places);
        //   }
        //
        //   String place = request.queryParams("place");
        //   int year = Integer.parseInt(request.queryParams("year"));
        //   Places newPlace = new Places(place, year);
        //
        //   places.add(newPlace);
        //
        //   model.put("template", "templates/success.vtl");
        //   return new ModelAndView(model, layout);
        // }, new VelocityTemplateEngine());

    }
}

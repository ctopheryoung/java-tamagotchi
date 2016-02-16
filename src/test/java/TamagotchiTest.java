import org.junit.*;
import static org.junit.Assert.*;

public class TamagotchiTest {

  @Test
  public void tamagotchi_instantiatesCorrectly() {
    Tamagotchi myPet = new Tamagotchi("steve");
    assertEquals("steve", myPet.getName());
    assertEquals(1, myPet.getWeight());
    assertEquals(3, myPet.getHunger());
    assertEquals(3, myPet.getHappiness());
    assertEquals(3, myPet.getSleepiness());
    assertEquals("alive", myPet.getStatus());
  }
}

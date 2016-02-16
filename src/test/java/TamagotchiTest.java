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
    assertEquals(0, myPet.getMinutesOld());
  }

  @Test
  public void feed_hungerDecresesByOneAndWeightIncresesOne_true() {
    Tamagotchi myPet = new Tamagotchi("steve");
    myPet.feed();
    assertEquals(2, myPet.getHunger());
    assertEquals(2, myPet.getWeight());
    assertEquals(5, myPet.getMinutesOld());
  }

  @Test
  public void play_happinessAndSleepinessIncreaseByOne_true() {
    Tamagotchi myPet = new Tamagotchi("steve");
    myPet.play();
    assertEquals(4, myPet.getHappiness());
    assertEquals(4, myPet.getSleepiness());
    assertEquals(4, myPet.getHunger());
    assertEquals(15, myPet.getMinutesOld());
  }

  @Test
  public void nap_sleepinessDecreasesOneHungerIncreasesOne_true() {
    Tamagotchi myPet = new Tamagotchi("steve");
    myPet.nap();
    assertEquals(2, myPet.getSleepiness());
    assertEquals(4, myPet.getHunger());
    assertEquals(60, myPet.getMinutesOld());
  }
}

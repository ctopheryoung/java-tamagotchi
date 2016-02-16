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

  @Test
  public void sleep_shouldSetTirednessToZeroafterSleepingandAdd2toHunger() {
    Tamagotchi myPet = new Tamagotchi("steve");
    myPet.sleep();
    assertEquals(0, myPet.getSleepiness());
    assertEquals(5, myPet.getHunger());
    assertEquals(480, myPet.getMinutesOld());
  }

  @Test
  public void checkStatus_checksIfHungry() {
    Tamagotchi myPet = new Tamagotchi("steve");
    myPet.setHunger(6);
    assertEquals("hungry", myPet.checkStatus());
  }

  @Test
  public void checkStatus_checksIfSleepy() {
    Tamagotchi myPet = new Tamagotchi("steve");
    myPet.setSleepiness(6);
    assertEquals("sleepy", myPet.checkStatus());
  }

  @Test
  public void checkStatus_checksIfHungryAndTired_hungry_and_tired() {
    Tamagotchi myPet = new Tamagotchi("steve");
    myPet.setHunger(6);
    myPet.setSleepiness(6);
    assertEquals("hungry and sleepy", myPet.checkStatus());
  }

  @Test
  public void checkStatus_checksIfDeadFromHunger_dead() {
    Tamagotchi myPet = new Tamagotchi("steve");
    myPet.setHunger(7);
    assertEquals("dead", myPet.checkStatus());
  }

  @Test
  public void checkStatus_checksIfDeadFromExaustion_dead() {
    Tamagotchi myPet = new Tamagotchi("steve");
    myPet.setSleepiness(7);
    assertEquals("dead", myPet.checkStatus());
  }
}

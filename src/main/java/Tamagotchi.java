public class Tamagotchi {
  private String mName;
  private int mWeight = 1;
  private int mHunger = 3;
  private int mHappiness = 3;
  private int mSleepiness = 3;
  private String mStatus = "alive";

  public Tamagotchi (String name) {
    mName = name;
  }

  public String getName() {
    return mName;
  }


}

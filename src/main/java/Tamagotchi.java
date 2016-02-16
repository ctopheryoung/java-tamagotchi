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

  public int getWeight() {
    return mWeight;
  }

  public int getHunger() {
    return mHunger;
  }

  public int getHappiness() {
    return mHappiness;
  }

  public int getSleepiness() {
    return mSleepiness;
  }

  public String getStatus() {
    return mStatus;
  }

  public void feed() {
    mWeight++;
    mHunger--;
  }


}

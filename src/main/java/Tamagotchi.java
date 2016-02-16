public class Tamagotchi {
  private String mName;
  private int mWeight = 1;
  private int mHunger = 3;
  private int mHappiness = 3;
  private int mSleepiness = 3;
  private String mStatus = "alive";
  private int mMinutesOld = 0;

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

  public int getMinutesOld() {
    return mMinutesOld;
  }

  public void feed() {
    mWeight++;
    mHunger--;
    mMinutesOld+=5;
  }

  public void play() {
    mHappiness++;
    mHunger++;
    mSleepiness++;
    mMinutesOld+=15;
  }

  public void nap() {
    mSleepiness--;
    mHunger++;
    mMinutesOld+=60;
  }

  public void sleep() {
    mSleepiness = 0;
    mHunger += 2;
    mMinutesOld+= 480;
  }
}

public class Tamagotchi {
  private String mName;
  private int mWeight = 1;
  private int mHunger = 3;
  private int mHappiness = 3;
  private int mSleepiness = 3;
  private String mStatus = "okay";
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

  public void setWeight(int newWeight) {
    mWeight = newWeight;
  }

  public int getHunger() {
    return mHunger;
  }

  public void setHunger(int newHunger) {
    mHunger = newHunger;
  }

  public int getHappiness() {
    return mHappiness;
  }

  public void setHappiness(int newHappiness) {
    mHappiness = newHappiness;
  }

  public int getSleepiness() {
    return mSleepiness;
  }

  public void setSleepiness(int newSleepiness) {
    mSleepiness = newSleepiness;
  }

  public String getStatus() {
    return mStatus;
  }

  public void setStatus(String newStatus) {
    mStatus = newStatus;
  }

  public int getMinutesOld() {
    return mMinutesOld;
  }

  public void feed() {
    mWeight++;
    mHunger--;
    mMinutesOld+=5;
    checkStatus();
  }

  public void play() {
    mHappiness++;
    mHunger++;
    mSleepiness++;
    mMinutesOld+=15;
    checkStatus();
  }

  public void nap() {
    mSleepiness--;
    mHunger++;
    mMinutesOld+=60;
    checkStatus();
  }

  public void sleep() {
    mSleepiness = 0;
    mHunger += 2;
    mMinutesOld+= 480;
    checkStatus();
  }

  public String checkStatus() {
    if ((mHunger > 6) || (mSleepiness > 6)) {
      mStatus = "dead";
    }
    else if ((mHunger > 4) && (mSleepiness > 4)) {
      mStatus = "hungry and sleepy";
    }
    else if (mHunger > 4) {
      mStatus = "hungry";
    }
    else if (mSleepiness > 4) {
      mStatus = "sleepy";
    } else {
      mStatus = "okay";
    }
    return mStatus;
  }

}

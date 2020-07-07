package petGameFinal;

abstract class Pet {
  String name;
  int health;
  int love, age;
  int experience = 0;

  public void print() {
    System.out.println(
      "Hi my name is " +
      this.name +
      " my healgth is " +
      this.health +
      " intemence owner is " +
      this.love +
      ". I am " +
      this.age +
      " years old ." +
      "My experience is " +
      experience
    );
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public  int getExperience() {
    return experience;
  }

  public void setExperience(int experience) {
    this.experience = experience;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.getHealth();
    if (health < 0 || health > 100) {
      System.out.println("Please Set the valu between 0 to 100 !!\n");
      return;
    }
    this.health = health;
  }

  public int getLove() {
    return love;
  }

  public void setLove(int love) {
    this.getLove();
    if (love < 0 || love > 100) {
      System.out.println(
        "You should set love's value in the range [0,100]!!\n"
      );
      return;
    }
    this.love = love;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.getAge();
    if (age < 0) {
      System.out.println("we haven't this pet!!\n");
      return;
    }
    this.age = age;
  }

  public abstract void eat();

  public abstract void play();

  public abstract void train();

  public abstract void game();
}

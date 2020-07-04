package petGameFinal;

abstract class Pet {
    String name;
    int health;
    int love;
  
    public void print() {
      System.out.println(
        "Hi my name is " +
        this.name +
        " my healgth is " +
        this.health +
        " intemence owner is " +
        this.love
      );
    }
    
  
    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
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
      if(love<0 || love>100){
          System.out.println("You should set love's value in the range [0,100]!!\n");
          return;
      }
      this.love = love;
    }
    public abstract void eat();
    public abstract void play();
}
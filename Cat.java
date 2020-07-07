package petGameFinal;
//extend super class
public class Cat extends Pet {
//use abstract 
  public void eat() {
    System.out.println("I eat mouse!");
  }

  public void play() {
    System.out.println("I can jump..");
  }

  public void train() {
    System.out.println("security");
  }

  public void game() {
    System.out.println("I play flaying disk game .");
  }

  private String look;
//get look
  public String getLook() {
    return look;
  }
//set look
  public void setLook(String look) {
    this.look = look;
  }
}

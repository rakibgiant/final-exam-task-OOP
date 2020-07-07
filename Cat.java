package petGameFinal;

public class Cat extends Pet {

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

  public String getLook() {
    return look;
  }

  public void setLook(String look) {
    this.look = look;
  }
}

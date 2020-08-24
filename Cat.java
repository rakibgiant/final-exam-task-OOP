package petGameFinal;

public class Cat extends Pet {

  public void feed() {
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
  public void sleep(){
    System.out.println("I finished sleep. weak up after a beautiful sleep. ");

  }

  private String look;

  public String getLook() {
    return look;
  }

  public void setLook(String look) {
    this.look = look;
  }
  @Override
  public void print() {
    super.print();
    System.out.println("I am a " + this.look);
  }  
}

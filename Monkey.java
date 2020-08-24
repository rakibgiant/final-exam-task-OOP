package petGameFinal;

public class Monkey extends Pet {

  public void feed() {
    System.out.println("I eat Banana");
  }

  public void play() {
    System.out.println("I can dance!!");
  }

  public void train() {
    System.out.println("clamb");
  }

  public void game() {
    System.out.println("I play flaying disk game .");
  }

  private String sex;

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }
  public void sleep(){
    System.out.println("I finished sleep. weak up after a beautiful sleep. ");

  }
  @Override
  public void print() {
    super.print();
    System.out.println("I am a " + this.sex);
  }
}

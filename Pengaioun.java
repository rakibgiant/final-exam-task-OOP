package petGameFinal;

public class Pengaioun extends Pet {

  public void eat() {
    System.out.println("I eat fish!!");
  }

  public void play() {
    System.out.println("I can swime..");
  }

  private String sex;

  public String getSex() {
    return sex;
  }

  public void train() {
    System.out.println("catch fish");
  }

  public void game() {
    System.out.println("I play flaying disk game .");
  }

  public void setSex(String sex) {
    this.sex = sex;
  }
  public void sleep(){
    System.out.println("I finished sleep. weak up after a beautiful sleep. ");

  }

  @Override
  public void print() {
    // TODO Auto-generated method stub
    super.print();
    System.out.println("I am a " + this.sex);
  }
}

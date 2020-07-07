package petGameFinal;

public class Dog extends Pet {

  public void eat() {
    System.out.println("I eat a dog food.");
  }

  public void play() {
    System.out.println("I play with ball");
  }

  public void train() {
    System.out.println("Hunt");
  }

  public void game() {
    System.out.println("I play flaying disk game .");
  }

  private String breed;

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  @Override
  public void print() {
    super.print();
    System.out.println("I am a " + this.breed);
  }
}

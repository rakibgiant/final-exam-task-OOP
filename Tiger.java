package petGameFinal;

public class Tiger extends Pet {
    public void eat() {
        System.out.println("I eat a meat.");
      }
    
      public void play() {
        System.out.println("I Can Roar.");
      }
    
      public void train() {
        System.out.println("jump throw fire ring");
      }
    
      public void game() {
        System.out.println("I play jump throw fir Rring game .");
      }
    
      private String sex;
    
      public String getSex() {
        return sex;
      }
    
      public void setSex(String sex) {
        this.sex = sex;
      }
    
      @Override
      public void print() {
        super.print();
        System.out.println("I am a " + this.sex);
      }  
}
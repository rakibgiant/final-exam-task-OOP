package petGameFinal;

public class Dolphin extends Pet {
    public void eat() {
        System.out.println("I eat Fish.");
      }
    
      public void play() {
        System.out.println("I play ring");
      }
    
      public void train() {
        System.out.println("entertenment");
      }
    
      public void game() {
        System.out.println("I play jumpth throu ring game .");
      }
      public void sleep(){
        System.out.println("I finished sleep. weak up after a beautiful sleep. ");
    
      }
      private String type;
    
      public String getType() {
        return type;
      }
    
      public void setType(String type) {
        this.type = type;
      }
    
      @Override
      public void print() {
        super.print();
        System.out.println("I am a " + this.type);
      } 
}
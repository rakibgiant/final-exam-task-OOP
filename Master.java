package petGameFinal;

public class Master {
   private String mastername;
    public String getName() {
        return mastername;
      }
    
      public void setName(String mastername) {
        this.mastername = mastername;
      }
      public void feed(Pet pet){
        System.out.print("The pet said, ");
        pet.eat();
        pet.play();
   }
}

package petGameFinal;

public class Cat extends Pet{
    public void eat(){
        System.out.println("I eat mouse!");
    }
    public void play(){
        System.out.println("I can jump..");
    }
    private String look;
    public String getLook(){
        return look;
    }
    public void setLook(String look) {
        this.look = look;
    }
}
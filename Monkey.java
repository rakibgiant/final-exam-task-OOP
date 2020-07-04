package petGameFinal;

public class Monkey extends Pet {
    public void eat(){
        System.out.println("I eat Banana");
    }
    public void play(){
        System.out.println("I can dance!!");
    }
    private String sex;
    public String getSex(){
        return sex;
    } 
    public void setSex(String sex) {
        this.sex = sex;
    } 
    @Override
    public void print() {
        // TODO Auto-generated method stub
        super.print();
        System.out.println("I am a "+this.sex);
    }
}
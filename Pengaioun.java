package petGameFinal;

public class Pengaioun extends Pet{
    public void eat(){
        System.out.println("I eat fish!!");
    }
    public void play(){
        System.out.println("I can swime..");
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
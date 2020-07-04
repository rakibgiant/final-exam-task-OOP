package petGameFinal;

import java.util.Scanner;

public class PetFinalTest {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Dog pet2 = new Dog();
    Pengaioun pet1 = new Pengaioun();
    Cat pet3 = new Cat();
    Monkey pet4 = new Monkey();
    Master master = new Master();
    System.out.println("\t\t\tWelcome to MY Hablu pet store.");
    System.out.print("Please Entre the Master name: ");
    String mastername = input.nextLine();
    master.setName(mastername);
    // 1、 Enter pet name
    System.out.print("Please enter the name of the pet u wanna adopt：");
    String name = input.next();
    // 2、 select the type of pet
    System.out.print(
      "Please select the type of pet u wannna adopt :((1) dog (2) penguin (3)Cat (4) Monkey ):"
    );
    switch (input.nextInt()) {
      case 1:
        //If it's a dog, choose a dog breed
        System.out.print(
          "Please select a dog breed :((1) smart poodle " +
          " (2) cool bulldog):"
        );
        String breed = null;
        if (input.nextInt() == 1) {
          breed = "smart poodle";
        } else {
          breed = "Cool bulldog";
        }
        System.out.println("Please set the health condition valu of pet: ");
        int health = input.nextInt();
        pet2.setHealth(health);
        System.out.println("Please set the valu of love to pet : ");
        int love = input.nextInt();
        pet2.setLove(love);

        //  assign values
        pet2.setName(name);
        pet2.setBreed(breed);
        // Print dog's information
        pet2.print();
        System.out.println("Please Feed Ur pet!!! ");
        System.out.println("(y) for feed (n) for later");
        char chiose = input.next().charAt(0);
        if(chiose=='y'){
            master.feed(pet2);
            pet2.setHealth(health+3);
            pet2.print();
        }else{
            System.out.println("Pet is Hungry!");
        }
        break;
      case 2:
        // 2.select the sex of penguin
        System.out.print(
          "Please choose the sex of the penguin:（1、Boy 2、Girl）:"
        );
        String sex = null;
        if (input.nextInt() == 1) {
          sex = "Boy";
        } else {
          sex = "Girl";
        }
        pet1.setSex(sex);
        System.out.println("Please set the health condition valu of pet: ");
        health = input.nextInt();
        pet1.setHealth(health);
        System.out.println("Please set the valu of love to pet : ");
        love = input.nextInt();
        pet1.setLove(love);
        pet1.setName(name);
        pet1.print();
        System.out.println("Please Feed Ur pet!!! ");
        System.out.println("(y) for feed (n) for later");
         chiose = input.next().charAt(0);
        if(chiose=='y'){
            master.feed(pet4);
            pet1.setHealth(health+5);
            pet1.print();
        }else{
            System.out.println("Pet is Hungry!");
        }
        break;
      case 3:
        System.out.print(
          "Please select a cat look :((1) Cute Cat Pussy " +
          " (2) Augly Cat Tom):"
        );
        String look = null;
        if (input.nextInt() == 1) {
          look = "Cute Cat Pussy";
        } else {
          look = "Augly Cat Tom ";
        }
        System.out.println("Please set the health condition valu of pet: ");
        health = input.nextInt();
        pet3.setHealth(health);
        System.out.println("Please set the valu of love to pet : ");
        love = input.nextInt();
        pet3.setLove(love);

        //  assign values
        pet3.setName(name);
        pet3.setLook(look);
        // Print cat's information
        pet3.print();
        System.out.println("Please Feed Ur pet!!! ");
        System.out.println("(y) for feed (n) for later");
         chiose = input.next().charAt(0);
        if(chiose=='y'){
            master.feed(pet3);
            pet3.setHealth(health+4);
            pet3.print();
        }else{
            System.out.println("Pet is Hungry!");
        }
        break;
      case 4:
        // 2.select the sex of monkey
        System.out.println("Please set the sex of Monkey 1. boy \t2.Girl");
        sex = null;
        if (input.nextInt() == 1) {
          sex = "Boy";
        } else {
          sex = "Girl";
        }
        pet4.setSex(sex);
        System.out.println("Please set the health condition valu of pet: ");
        health = input.nextInt();
        pet4.setHealth(health);
        System.out.println("Please set the valu of love to pet : ");
        love = input.nextInt();
        pet4.setLove(love);
        pet4.setName(name);
        pet4.print();
        System.out.println("Please Feed Ur pet!!! ");
        System.out.println("(y) for feed (n) for later");
         chiose = input.next().charAt(0);
        if(chiose=='y'){
            master.feed(pet4);
            pet4.setHealth(health+6);
            pet4.print();
        }else{
            System.out.println("Pet is Hungry!");
        }
    }
    input.close();
  }
}

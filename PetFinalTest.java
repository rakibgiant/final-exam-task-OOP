package petGameFinal;

import java.util.Scanner;

public class PetFinalTest {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Pet pt = new Pet();
    int experience=0;
    Dog pet2 = new Dog();
    Pengaioun pet1 = new Pengaioun();
    Cat pet3 = new Cat();
    Monkey pet4 = new Monkey();
    Dolphin pet5 = new Dolphin();
    Tiger pet6 = new Tiger();
    Master master = new Master();
    System.out.println("\t\t\tWelcome to MY Hablu pet store.");
    System.out.print("Please Entre the Master name: ");
    String mastername = input.nextLine();
    master.setName(mastername);
    // 1、 Enter pet name
    System.out.print("Please enter the name of the pet u wanna adopt：");
    String name = input.next();
    System.out.println("Please enter the age of pet: ");
    int age = input.nextInt();
    pet1.setAge(age);
    pet2.setAge(age);
    pet3.setAge(age);
    pet4.setAge(age);
    pet5.setAge(age);
    pet6.setAge(age);

    // 2、 select the type of pet
    System.out.print(
      "Please select the type of pet u wannna adopt :((1) dog\n(2) penguin\n(3)Cat\n(4) Monkey\n(5)Dolphin\n(6)Tiger):"
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
        System.out.println("Congress this Dog is adopted by " + mastername);
        pet2.print();
        System.out.println("Do u wanna feed ur pet !!! ");
        System.out.println("(y) for feed (n) for later");
        char chiose = input.next().charAt(0);
        if (chiose == 'y') {
          master.feed(pet2);
          pet2.setHealth(health + 3);
          pet2.print();
        }
        System.out.println("Do u wanna play with your pet now or train now?");
        System.out.println("Prass 1 for play 2 for train");
        int cose = input.nextInt();
        if (cose == 1) {
          master.game(pet2);
          pet2.setHealth(health - 5);
          pet2.setLove(love + 5);
          System.out.println("Now,\n");
          pet2.print();
        } else {
          master.train(pet2);
          pet2.setHealth(health - 10);
          pet2.setExperience(experience+1);
          pet2.setLove(love + 7);
          System.out.println("Now,\n");
          pet2.print();
        }
        if (pet2.health <= 10) {
          System.out.println("Pet is Hungry!");
          System.out.println("U must have to feed ur pet.");
        }
        System.out.println("Do u wanna feed ur pet !!! ");
        System.out.println("(y) for feed (n) for later");
        char chios = input.next().charAt(0);
        if (chios == 'y') {
          master.feed(pet2);
          pet2.setHealth(health + 3);
          pet2.print();
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
        System.out.println("Congress this penguin is adopted by " + mastername);
        pet1.print();
        System.out.println("Please Feed Ur pet!!! ");
        System.out.println("(y) for feed (n) for later");
        chiose = input.next().charAt(0);
        if (chiose == 'y') {
          master.feed(pet1);
          pet1.setHealth(health + 5);
          pet1.print();
        }
        System.out.println("Do u wanna play with your pet now or train now?");
        System.out.println("Prass 1 for play 2 for train");
        cose = input.nextInt();
        if (cose == 1) {
          master.game(pet1);
          pet1.setHealth(health - 3);
          pet1.setLove(love + 6);
          System.out.println("Now,\n");
          pet1.print();
        } else {
          master.train(pet1);
          pet1.setHealth(health - 8);
          pet1.setExperience(experience + 1);
          pet1.setLove(love + 5);
          System.out.println("Now,\n");
          pet1.print();
        }
        if (pet1.health <= 10) {
          System.out.println("Pet is Hungry!");
          System.out.println("U must have to feed ur pet.");
        }
        System.out.println("Do u wanna feed ur pet !!! ");
        System.out.println("(y) for feed (n) for later");
        chios = input.next().charAt(0);
        if (chiose == 'y') {
          master.feed(pet1);
          pet1.setHealth(health + 5);
          pet1.print();
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
        System.out.println("Congress this cat is adopted by " + mastername);
        // Print cat's information
        pet3.print();
        System.out.println("Please Feed Ur pet!!! ");
        System.out.println("(y) for feed (n) for later");
        chiose = input.next().charAt(0);
        if (chiose == 'y') {
          master.feed(pet3);
          pet3.setHealth(health + 4);
          pet3.print();
        }
        System.out.println("Do u wanna play with your pet now or train now?");
        System.out.println("Prass 1 for play 2 for train");
        cose = input.nextInt();
        if (cose == 1) {
          master.game(pet3);
          pet3.setHealth(health - 7);
          pet3.setLove(love + 4);
          System.out.println("Now,\n");
          pet3.print();
        } else {
          master.train(pet3);
          pet3.setHealth(health - 8);
          pet3.setExperience(experience + 1);
          pet3.setLove(love + 7);
          System.out.println("Now,\n");
          pet3.print();
        }
        if (pet3.health <= 10) {
          System.out.println("Pet is Hungry!");
          System.out.println("U must have to feed ur pet.");
        }
        System.out.println("Do u wanna feed ur pet !!! ");
        System.out.println("(y) for feed (n) for later");
        chios = input.next().charAt(0);
        if (chiose == 'y') {
          master.feed(pet3);
          pet3.setHealth(health + 4);
          pet3.print();
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
        System.out.println("Congress this monkey is adopted by " + mastername);
        pet4.print();
        System.out.println("Please Feed Ur pet!!! ");
        System.out.println("(y) for feed (n) for later");
        chiose = input.next().charAt(0);
        if (chiose == 'y') {
          master.feed(pet4);
          pet4.setHealth(health + 6);
          pet4.print();
        }
        System.out.println("Do u wanna play with your pet now or train now?");
        System.out.println("Prass 1 for play 2 for train");
        cose = input.nextInt();
        if (cose == 1) {
          master.game(pet4);
          pet4.setHealth(health - 5);
          pet4.setLove(love + 5);
          System.out.println("Now,\n");
          pet4.print();
        } else {
          master.train(pet2);
          pet4.setHealth(health - 10);
          pet4.setExperience(experience + 1);
          pet4.setLove(love + 7);
          System.out.println("Now,\n");
          pet4.print();
        }
        if (pet4.health <= 10) {
          System.out.println("Pet is Hungry!");
          System.out.println("U must have to feed ur pet.");
        }
        System.out.println("Do u wanna feed ur pet !!! ");
        System.out.println("(y) for feed (n) for later");
        chios = input.next().charAt(0);
        if (chiose == 'y') {
          master.feed(pet4);
          pet4.setHealth(health + 3);
          pet4.print();
        }
        break;
        case 5:
        System.out.print(
          "Please choose the type of the dolphin:（1、pilot whale 2、false killer whale）:"
        );
        String type = null;
        if (input.nextInt() == 1) {
          type = "pilot whale";
        } else {
          type = "false killer whale";
        }
        pet5.setType(type);
        System.out.println("Please set the health condition valu of pet: ");
        health = input.nextInt();
        pet5.setHealth(health);
        System.out.println("Please set the valu of love to pet : ");
        love = input.nextInt();
        pet5.setLove(love);
        pet5.setName(name);
        System.out.println("Congress this Dolphi is adopted by " + mastername);
        pet5.print();
        System.out.println("Please Feed Ur pet!!! ");
        System.out.println("(y) for feed (n) for later");
        chiose = input.next().charAt(0);
        if (chiose == 'y') {
          master.feed(pet5);
          pet5.setHealth(health + 15);
          pet5.print();
        }
        System.out.println("Do u wanna play with your pet now or train now?");
        System.out.println("Prass 1 for play 2 for train");
        cose = input.nextInt();
        if (cose == 1) {
          master.game(pet5);
          pet5.setHealth(health - 13);
          pet5.setLove(love + 6);
          System.out.println("Now,\n");
          pet5.print();
        } else {
          master.train(pet5);
          pet5.setHealth(health - 18);
          pet5.setExperience(experience + 1);
          pet5.setLove(love + 15);
          System.out.println("Now,\n");
          pet5.print();
        }
        if (pet5.health <= 10) {
          System.out.println("Pet is Hungry!");
          System.out.println("U must have to feed ur pet.");
        }
        System.out.println("Do u wanna feed ur pet !!! ");
        System.out.println("(y) for feed (n) for later");
        chios = input.next().charAt(0);
        if (chiose == 'y') {
          master.feed(pet5);
          pet5.setHealth(health + 5);
          pet5.print();
        }
        break;
        case 6:
        System.out.print(
          "Please choose the sex of the tiger:（1、Tiger 2、Tigerss）:"
        );
         sex = null;
        if (input.nextInt() == 1) {
          sex = "Tiger";
        } else {
          sex = "Tigerss";
        }
        pet6.setSex(sex);
        System.out.println("Please set the health condition valu of pet: ");
        health = input.nextInt();
        pet6.setHealth(health);
        System.out.println("Please set the valu of love to pet : ");
        love = input.nextInt();
        pet6.setLove(love);
        pet6.setName(name);
        System.out.println("Congress this tiger is adopted by " + mastername);
        pet6.print();
        System.out.println("Please Feed Ur pet!!! ");
        System.out.println("(y) for feed (n) for later");
        chiose = input.next().charAt(0);
        if (chiose == 'y') {
          master.feed(pet6);
          pet6.setHealth(health + 15);
          pet6.print();
        }
        System.out.println("Do u wanna play with your pet now or train now?");
        System.out.println("Prass 1 for play 2 for train");
        cose = input.nextInt();
        if (cose == 1) {
          master.game(pet6);
          pet6.setHealth(health - 18);
          pet6.setLove(love + 6);
          System.out.println("Now,\n");
          pet6.print();
        } else {
          master.train(pet6);
          pet6.setHealth(health - 19);
          pet6.setExperience(experience +1);
          pet6.setLove(love + 5);
          System.out.println("Now,\n");
          pet6.print();
        }
        if (pet6.health <= 20) {
          System.out.println("Pet is Hungry!");
          System.out.println("U must have to feed ur pet.");
        }
        System.out.println("Do u wanna feed ur pet !!! ");
        System.out.println("(y) for feed (n) for later");
        chios = input.next().charAt(0);
        if (chiose == 'y') {
          master.feed(pet6);
          pet6.setHealth(health + 15);
          pet6.print();
        }
        
    }
    input.close();
  }
}

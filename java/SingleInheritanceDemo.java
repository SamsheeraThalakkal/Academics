import java.util.Scanner;

class Animal {
    private String cls;
    private String order;
    private String genus;
    private String locomotion;

    public Animal(Scanner sc) {
        System.out.println("Enter class");
        cls = sc.nextLine();
        System.out.println("Enter order");
        order = sc.nextLine();
        System.out.println("Enter genus");
        genus = sc.nextLine();
        System.out.println("Enter type of locomotion");
        locomotion = sc.nextLine();
    }

    public String toString() {
        return "\nClass: " + cls +
                "\nOrder: " + order +
                "\nGenus: " + genus +
                "\nLocomotion:" + locomotion + "\n";
    }

}

class Dog extends Animal {
    String species;
    String name;
    String color;
    String owner;

    public Dog(Scanner sc) {
        super(sc);
        System.out.println("Enter species");
        species = sc.nextLine();

        System.out.println("Enter name");
        name = sc.nextLine();

        System.out.println("Enter color");
        color = sc.nextLine();

        System.out.println("Enter owner");
        owner = sc.nextLine();

    }

    public String toString() {
        return "Dog Information:\n******************\n" + super.toString() +
                "\nColor: " + color +
                "\nSpecies: " + species +
                "\nName: " + name +
                "\nOwner: " + owner + "\n";
    }
}

class Cat extends Animal {
    String species;
    String name;
    String color;
    String owner;
    int taillength;

    public Cat(Scanner sc) {
        super(sc);
        System.out.println("Enter species");
        species = sc.nextLine();

        System.out.println("Enter name");
        name = sc.nextLine();

        System.out.println("Enter color");
        color = sc.nextLine();

        System.out.println("Enter owner");
        owner = sc.nextLine();

        System.out.println("Enter taillength");
        taillength = sc.nextInt();

    }

    public String toString() {
        return "Cat Information\n****************\n" + super.toString() +
                "\ncolor: " + color +
                "\nSpecies: " + species +
                "\nname: " + name +
                "\nTaillength: " + taillength + "cm" +
                "\nOwner: " + owner + "\n";
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n------Dog Details------");
        Dog d = new Dog(sc);
        System.out.println("\n------Cat Details------");
        Cat c = new Cat(sc);
        System.out.println(d);
        System.out.println(c);
        sc.close();
    }
}

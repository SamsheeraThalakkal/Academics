import java.util.Scanner;

interface Comparable {
    public double volume();

    public int compareByVolume(Comparable other);
}

class Cuboid implements Comparable {
    double length, width, height;

    public Cuboid(Scanner sc) {
        System.out.println("Enter length,width and height of cuboid");
        length = sc.nextDouble();
        width = sc.nextDouble();
        height = sc.nextDouble();
    }

    public double volume() {
        return length * width * height;
    }

    public int compareByVolume(Comparable other) {
        if (this.volume() > other.volume()) {
            return 1;
        } else if (this.volume() < other.volume()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Cylinder implements Comparable {
    double radius, height;

    public Cylinder(Scanner sc) {
        System.out.println("Enter radius and height of Cylinder");
        radius = sc.nextDouble();
        height = sc.nextDouble();
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public int compareByVolume(Comparable other) {
        if (this.volume() > other.volume()) {
            return 1;
        } else if (this.volume() < other.volume()) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuboid cu = new Cuboid(sc);
        Cylinder c = new Cylinder(sc);
        int res = cu.compareByVolume(c);
        if (res == 1) {
            System.out.println("Cuboid has more volume(" + cu.volume() + ")");
        } else if (res == -1) {
            System.out.println("Cylinder has more volume(" + c.volume() + ")");
        } else {
            System.out.println("Both have same volume(" + cu.volume() + ")");
        }
        sc.close();
    }
}

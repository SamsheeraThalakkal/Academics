import java.util.Scanner;

interface Printable {
    void display();

    void show();
}

interface Computable {
    public double area();

    public double perimeter();

    public double volume();
}

interface Drawable {
    public void draw();
}

class Rectangle implements Printable, Computable, Drawable {
    double length, width;

    public Rectangle(Scanner sc) {
        System.out.println("Enter length");
        length = sc.nextInt();

        System.out.println("Enter width");
        width = sc.nextInt();
    }

    public void show() {
        System.out.println("length= " + length + "\nWidth= " + width);
    }

    public void display() {
        System.out.println("\nRectangle Properties\n********************\n");
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public double volume() {
        return -1;
    }

    public void draw() {
        System.out.println("Drawing rectanle....");
    }

    @Override
    public String toString() {
        return "\nArea= " + area() +
                "\nperimeter= " + perimeter() + "\n";
    }
}

class Sphere implements Printable, Computable, Drawable {
    double radius;

    public Sphere(Scanner sc) {
        System.out.println("Enter radius of sphere");
        radius = sc.nextInt();
    }

    public void show() {
        System.out.println("Radius= " + radius);
    }

    public void display() {
        System.out.println("\nSphere Properties\n********************\n");
    }

    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    public double perimeter() {
        return 0;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public void draw() {
        System.out.println("Drawing Shpere....");
    }

    @Override
    public String toString() {
        return "\nArea= " + String.format("%.3f", area()) +
                "\nVolume= " + String.format("%.3f", volume()) + "\n";
    }
}

public class InterfaceDemo {
    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle(sc);
        Sphere s = new Sphere(sc);
        r.display();
        r.show();
        System.out.println(r);
        r.draw();

        s.display();
        s.show();
        System.out.println(s);
        s.draw();
        sc.close();
    }
}

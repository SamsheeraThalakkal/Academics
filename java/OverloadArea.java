import java.util.Scanner;

class Demo {
    void area(int l, int b) {
        System.out.println("Area of Rectangle: " + (l * b));
    }

    void area(int a) {
        System.out.println("Area of Square: " + (a * a));
    }

    void area(float b, float h) {
        System.out.println("Area of Triangle: " + (.05 * h * b));
    }

    void area(double r) {
        System.out.println("Area of Circle: " + (Math.PI * r * r));
    }
}

public class OverloadArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo d = new Demo();
        System.out.println("enter length of rectangle");
        int l = sc.nextInt();
        System.out.println("enter breadth of rectangle");
        int b = sc.nextInt();
        d.area(l, b);

        System.out.println("enter side of square");
        int side = sc.nextInt();
        d.area(side);

        System.out.println("enter base of triangle");
        float base = sc.nextFloat();
        System.out.println("enter height of triangle");
        float height = sc.nextFloat();
        d.area(base, height);

        System.out.println("enter radius of circle");
        double radius = sc.nextDouble();
        d.area(radius);

        sc.close();
    }
}

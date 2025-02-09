import java.util.Scanner;

class Shapes {
    public void area(int a, int b) {
        System.out.println(a * b);
    }

    public void area(int s) {
        System.out.println(s * s);

    }

    public void area(double r) {
        System.out.println(3.141 * r * r);
    }

    public void area(double b, double h) {
        System.out.println((b * h) / 2);
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenth of rectangle");
        int a = sc.nextInt();
        System.out.println("Enter breadth of rectangle");
        int b = sc.nextInt();
        System.out.println("enter side of square");
        int s = sc.nextInt();
        System.out.println("Enter radius of circle");
        double r = sc.nextDouble();
        System.out.println("Enter base of triangle");
        double b1 = sc.nextDouble();
        System.out.println("enter heught of triangle");
        double h = sc.nextDouble();
        Shapes sh = new Shapes();
        sh.area(a, b);
        sh.area(s);
        sh.area(r);
        sh.area(b1, h);
        sc.close();
    }
}

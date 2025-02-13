import java.util.Scanner;

class Demo {
    void volume(int a) {
        System.out.println("Volume of cube: " + (a * a * a));
    }

    void volume(int l, int b, int h) {
        System.out.println("Volume of cuboid: " + (l * b * h));
    }

    void volume(double r) {
        System.out.println("Volume of sphere: " + ((4.0 / 3.0) * (Math.PI * r * r * r)));
    }

    void volume(double r, double h) {
        System.out.println("Volume of cylinder: " + (Math.PI * r * r * h));
    }

    void volume(int r, double h) {
        System.out.println("Volume of cone: " + ((1.0 / 3.0) * (Math.PI * r * r * h)));
    }
}

public class OverloadVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo d = new Demo();
        System.out.println("Enter side of cube");
        int side = sc.nextInt();
        d.volume(side);

        System.out.println("enter length,breadth and height of cuboid");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        d.volume(l, b, h);

        System.out.println("enter radius  of sphere");
        double sr = sc.nextDouble();
        d.volume(sr);

        System.out.println("enter radius and height of cylinder");
        double rad = sc.nextDouble();
        double ht = sc.nextDouble();
        d.volume(rad, ht);

        System.out.println("enter radius and height of cone");
        int crad = sc.nextInt();
        double cht = sc.nextDouble();
        d.volume(crad, cht);
        sc.close();
    }
}

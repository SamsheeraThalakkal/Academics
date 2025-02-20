
import geometry.shapes3d.Cuboid;
import geometry.shapes3d.Sphere;
import java.util.Scanner;

public class PDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuboid c = new Cuboid(sc);
        Sphere s = new Sphere(sc);
        System.out.println("Area of rectangle:" + c.area() + "\nperimetr:" + c.perimeter() + "\nvolume of cuboid:" + c.volume());
        System.out.println("Area of circle:" + s.area() + "\nperimetr:" + s.perimeter() + "\nvolume of sphere:" + s.volume());
    }
}

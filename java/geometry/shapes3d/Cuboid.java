package geometry.shapes3d;

import java.util.Scanner;
import geometry.shapes2d.Rectangle;

public class Cuboid extends Rectangle {

    public double h;

    public Cuboid(Scanner sc) {
        super(sc);
        System.out.println("enter height of cuboid");
        h = sc.nextInt();

    }

    public double volume() {
        return area() * h;
    }
}

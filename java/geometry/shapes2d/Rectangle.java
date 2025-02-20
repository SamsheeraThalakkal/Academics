package geometry.shapes2d;

import java.util.Scanner;
import geometry.interfaces.*;

public class Rectangle implements CalcArea, CalcPerimeter {

    public double l, w;

    public Rectangle(Scanner sc) {
        System.out.println("enter length of rectangle");
        l = sc.nextInt();
        System.out.println("enter width of rectangle");
        w = sc.nextInt();
    }

    @Override
    public double area() {
        return l * w;
    }

    @Override
    public double perimeter() {
        return 2 * (l + w);
    }
}

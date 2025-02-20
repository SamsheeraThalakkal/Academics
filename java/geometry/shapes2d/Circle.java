package geometry.shapes2d;

import java.util.Scanner;
import geometry.interfaces.*;

public class Circle implements CalcArea, CalcPerimeter {

    public double r;

    public Circle(Scanner sc) {
        System.out.println("enter radius of circle");
        r = sc.nextInt();
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}

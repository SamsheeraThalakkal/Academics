package geometry.shapes3d;

import java.util.Scanner;
import geometry.shapes2d.Circle;

public class Sphere extends Circle {

    public Sphere(Scanner sc) {
        super(sc);
    }

    public double volume() {
        return (4.0 / 3) * area() * r;

    }
}

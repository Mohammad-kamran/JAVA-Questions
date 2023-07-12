package Conditionals_loops;

import java.awt.geom.Area;
import java.util.Scanner;

//Area of Circle
public class AOC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Radius of the circle ::");
        double R = in.nextDouble();
        System.out.print(" Area of Circle = "+ Area(R));
    }

    public static double Area(double R) {
        return 3.14159265359 * R * R;
    }
}
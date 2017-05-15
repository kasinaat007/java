package org.main;
import org.object.round.*;

public class Solution {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle","red",true,3.0);
        System.out.printf("Area of Circle = %.2f sq.units\n", circle.area());
        Cylinder cylinder = new Cylinder("Cylinder", "yellow", false, 3.0, 2.0);
        System.out.printf("Area of Cylinder  = %.2f sq.units" ,cylinder.area());
    }
}
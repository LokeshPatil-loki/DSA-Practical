package DAY_01.area_of_circle;
import Utils.Input;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        int radius = input.readInt("Enter a radius for circle: ");
        System.out.println("Area of circle: " + Circle.area(radius));

    }
}

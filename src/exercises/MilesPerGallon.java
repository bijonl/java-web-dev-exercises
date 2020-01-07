package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input;
        double miles;
        double gallons;
        double mpg;

        input = new Scanner(System.in);
        System.out.println("How many miles? ");
        miles = input.nextDouble();
        System.out.println("How many gallons?");
        gallons = input.nextDouble();
        input.close();

        mpg = miles/gallons;
        System.out.println("MPG: " + mpg);

    }
}

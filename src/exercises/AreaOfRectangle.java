package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner input;
        int length;
        int width;
        int area;

        input = new Scanner (System.in);
        System.out.println("What is the length?");
        length = input.nextInt();
        input = new Scanner (System.in);
        System.out.println("What is the width?");
        width = input.nextInt();
        input.close();
        area = width * length;
        System.out.println("The area of the rectangle is " + area);



    }
}

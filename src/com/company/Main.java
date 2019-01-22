package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      Calculator calc = new Calculator();

      Scanner scan = new Scanner (System.in);


      System.out.println("What kind of shape would you like to get the area of? \n Type triangle or rectangle.");

      String userShape = scan.nextLine();

      if (!userShape.equalsIgnoreCase("triangle") || !userShape.equalsIgnoreCase("rectangle")){

          System.out.println("Not a valid option, enter either TRIANGLE or RECTANGLE");
          userShape = scan.nextLine();
      }

      System.out.println("Enter the shape's height");
      double userHeight = scan.nextDouble();

        System.out.println("Enter the shape's Length");
        double userLength = scan.nextDouble();


        calc.calculateArea(userShape, userHeight, userLength);

        // these were just for testing
//      calc.calculateArea("Triangle", 5.5, 6.5);
//      calc.calculateArea("Rectangle", 5, 10);




    }
}

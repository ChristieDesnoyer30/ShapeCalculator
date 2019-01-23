package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean userContinue = true;

      Calculator calc = new Calculator();

      Scanner scan = new Scanner (System.in);


      do {

          System.out.println("What kind of shape would you like to get the area of? \n Type triangle or rectangle.");

          String userShape = scan.next();


          System.out.println("Enter the shape's height");
          double userHeight = scan.nextDouble();

          System.out.println("Enter the shape's Length");
          double userLength = scan.nextDouble();


          calc.calculateArea(userShape, userHeight, userLength);

          System.out.println("Would you like to perform another calculation? Press 1 for yes and 2 for no.");

          int userChoice = scan.nextInt();


        userContinue=  isUserContinuing(userChoice);


      } while (userContinue);

      System.out.println("Thank you for calculating shapes!");



        // these were just for testing
//      calc.calculateArea("Triangle", 5.5, 6.5);
//      calc.calculateArea("Rectangle", 5, 10);

    }

    private static boolean isUserContinuing(int userChoice) {

        boolean userContinue;

        if (userChoice == 1) {

            userContinue = true;


        } else {

            userContinue = false;
        }
        return userContinue;
    }


}

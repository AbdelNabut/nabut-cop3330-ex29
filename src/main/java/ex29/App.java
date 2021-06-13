/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ex29;
import java.util.Scanner;

public class App 
{

    public static void main( String[] args )
    {
        String userInput = null;
        boolean inputValid = false;
        int rateOfReturn, years;
        Scanner input = new Scanner(System.in);
        while(!inputValid) {
            System.out.print("What is the rate of return? ");
            userInput = input.next();
            if (!InputValidator.isNumeric(userInput))
                System.out.println("Sorry. That's not a valid input.");
            else if (!InputValidator.isNonZero(userInput))
                System.out.println("Sorry. That's not a valid input.");
            else {
                inputValid = true;
            }
        }
        rateOfReturn = Integer.parseInt(userInput);
        years = 72 / rateOfReturn;
        System.out.println("It will take " + years + " years to double your initial investment.");



    }
}

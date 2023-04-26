package weekThree.activity3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {


        // this is an instance of the scanner class --> it is an object
        Scanner Console =  new Scanner(System.in);
        //declare a variable
        int number;
        String Parity;

        // prompts user
        System.out.println("Enter a number");

        number = Integer.parseInt(Console.nextLine());
        if(number % 2 == 0) {
            Parity = "Even";
        }else
        {
            Parity = "odd";

        }
        System.out.printf("The number is %s", Parity);
        Console.close();
    }
}

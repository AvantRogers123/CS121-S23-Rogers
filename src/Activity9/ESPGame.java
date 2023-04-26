package Activity9;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Scanner Console= new Scanner(System.in);
        Random random= new Random();

        int number;
        String Color;
        String guess;

        int correct = 0;

        for(int i = 1; i <= 10; i++){
            number = random.nextInt(5);
            if (number ==0){
                Color = "Red";


            } else if (number ==1) {
                Color = "Green";


            } else if (number== 2) {
                Color = "Blue";

            } else if (number == 3){
                Color = "Orange";
            }
            else{
                Color = "Yellow";
            }
            System.out.printf("%d. What color has the computer chosen?\n",i);
            guess = Console.nextLine();
            System.out.printf("> the computer chose %s\n",Color);
            if (guess.equals(Color)){
                correct++;
            }
        }

        System.out.printf("You got %d out of 10 correct\n",correct);


    }
}

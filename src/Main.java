import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create new scanner
        Scanner in = new Scanner(System.in);
        //create random object
        Random rand = new Random();
        //declaration variables
        int val = rand.nextInt(10)+1; //val is 1 to 10
        int guess = 0;
        int count = 0;
        int guesses = 0;
        //output question
        System.out.println("Guess what number I have (1-10)?");
        guess = in.nextInt();
        guesses ++;
        if(val > guess) {
            System.out.println("Lower try again.");
        } else if(val < guess) {
            System.out.println("Higher try again.");
        } else if (val == guess) {
            System.out.println("You're right, the number is " + val);
            System.out.println("You guessed " + guesses + "times");
        }
    }
}

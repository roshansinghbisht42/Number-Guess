import java.util.*;
public class guessNum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\t-----------------------------------\n");
        System.out.print("\t\tRandom Number Guess\n");
        System.out.print("\t-----------------------------------\n\n\n");
        int number = 87;
        int attempt = 3;
        while(attempt>0){

            System.out.print("\tEnter your guess: ");
            int guess = scanner.nextInt();
            if (guess==number){
                System.out.print("Congratulation, your guess is correct.\n\n");
                break;
            }

            if(guess!=number){
                --attempt;
                System.out.print("\t\nYou have " + attempt + " attempts left to guess the number.\n");
                System.out.print("\tYour guess is incorrect.\n\n");
            }
        }
        if(attempt == 0){
            System.out.print("The correct guess was: " + number + "\n");
        }
        System.out.print("\tThanks for playing");
        scanner.close();
    }
}

import java.util.*;
public class guessNum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\t------------------------------------------\n");
        System.out.print("\t\tRandom Number Guess\n");
        System.out.println("\tNOTE: The number is in the range of 1-100");
        System.out.print("\t------------------------------------------\n\n\n");
        int attempt = 3;
        System.out.print("You have 3 chances to guess the number\n");
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        while(attempt>0){

            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess==number){
                System.out.print("Congratulation, your guess is correct.\n\n");
                break;
            }

            else{
                System.out.print("Your guess is incorrect.\n");
                attempt--;
            
            if(guess < number){
                System.out.print("Hint: Guess " + guess + " is low.\n");
            }
            else {
                System.out.print("Hint: Guess " + guess + " is high.\n");
            }
            if(attempt > 0){
                System.out.print("You have " + attempt + " left.\n\n");
            }
        }
    }
        if(attempt == 0){
            System.out.println("You're out of attempts.");
            System.out.print("The correct guess was: " + number + "\n");
        }

        System.out.print("\t\nThanks for playing");
        scanner.close();
    }
}

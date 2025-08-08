// Random Number Guess 
import java.util.*;

public class guessNum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("------------------------------------------\n");
        System.out.print("Random Number Guess\n");
        System.out.println("NOTE: The number is in the range of 1-100");
        System.out.print("------------------------------------------\n\n\n");
        System.out.println("NOTE: You have 3 rounds and in each round the number will change.");
        
        System.out.println("--------------------------\t");
        System.out.println("Points Chart\n");
        System.out.println("1. If you guess the number in your 1st chance you will get 5 points");
        System.out.println("2. If you guess the number in your 2nd chance you will get 3 points");
        System.out.println("3. if you guess the number in your 3rd chance you will get 1 point");
        System.out.println("--------------------------\t");
       
        System.out.print("You have 3 chances to guess the number\n");
        
        //points variable 
        int totalPoints = 0;
        System.out.print("Let's start the game!\n\n");

        for (int round = 1; round <= 3; round++){
        
            //generates a random number between 1 and 100
        Random random = new Random();
        int number = random.nextInt(100) + 1;

            System.out.println("\nRound " + round + ":");
            int guessCount = 0;
            int attempt = 3;

            while(attempt>0){

            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            guessCount++;

            if (guess==number){
                System.out.print("Congratulation, your guess is correct.\n\n");
                
                //assign points based on the guess count
            if(guessCount == 1){
                totalPoints += 5;
            }
            else if(guessCount == 2){
                totalPoints += 3;
            }
            else if(guessCount == 3){
                totalPoints += 1;
            }
            
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
    }

        System.out.println("Game Over!");
        System.out.println("Total Points: " + totalPoints);
        System.out.print("\t\nThanks for playing");
        scanner.close();
    }
}

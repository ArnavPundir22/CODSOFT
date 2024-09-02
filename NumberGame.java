import java.util.Random;
import java.util.Scanner;


public class NumberGame{

    // Initializing the Functions we want to add to the program.
    public static int minRange = 1;                   // the minimum number is 1
    public static int maxRange = 100;                 // the maximum number us 100
    public static int maxAttempts = 7;                // there will be 7 Attempts in each Round
    public static int maxRounds = 5;                  // there will be 5 rounds in this game
    public static int Gamescore = 0;                  // initializing the Game Score as 0



    public static void main(String[] args) {
        Random Ran = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome Buddy to the Number Gussing Game !!!!\n");
        System.out.print("Enter your Name :");
        String Name = input.nextLine();
        // Greeting and Giving the details of the program
        System.out.printf("Hey %s there will be %d rounds in this game.\nTotal attempts to guess the number in each round will be %d\n",
                Name,maxRounds,maxAttempts);



        // putting the loop for the increment in rounds
        for(int i = 1;i<=maxRounds;i++){
            int randomNumber = Ran.nextInt(minRange,maxRange);     // Generating a random number from random library
            int Attempts = 0; // counting the number of attempts that starts with 0

            // instructing the user to guess the number
            System.out.printf("\n\n      Rouund %d :\n  Guess the Number between %d and %d in %d Attempts\n\n",i,minRange,maxRange,
                    maxAttempts);
            while(Attempts<maxAttempts){
                System.out.print("Enter Your Guessed Number : ");
                int guessNumber = input.nextInt();
                Attempts++;    // this increments the Attempts by 1


                if(guessNumber==randomNumber){
                    int score = maxAttempts-Attempts;
                    Gamescore+=score;
                    System.out.printf("Congratulations!!!!! Guessed the Number correct.\nAttemps :- %d \nGame Score :- %d",Attempts,
                            Gamescore);
                    break;      // Here the condition will stop
                }
                else if(guessNumber>randomNumber){
                    System.out.printf("The Number is less than %d.\n   Attempts Left : %d\n",guessNumber,maxAttempts-Attempts);
                } else {
                    System.out.printf("The Number is greater than %d.\n   Attempts Left : %d\n",guessNumber,maxAttempts-Attempts);
                }
                // After completing all the rounds The results will be displayed
                if(Attempts==maxAttempts){
                    System.out.printf("\nRound = %d\n",i);
                    System.out.print("Attempts = 0\n");
                    System.out.printf("The Number was %d\n\n",randomNumber);

                    System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = =\n");
                    System.out.printf("                   Game Over!!!!\nTotal Score : %d\n\n",Gamescore);
                    System.out.print("            .......Come Back Soon.......\n");
                    System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = =");
                }
            }
        }input.close();
    }
}
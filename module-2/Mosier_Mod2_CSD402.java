/*
*Megan Mosier
*Assignment 2 - Rock-Paper-Scissors
*CSD-402
*06.14.2026
*/

import java.util.Random;
import java.util.Scanner;

public class Mosier_Mod2_CSD402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate computer's choice (1=Rock, 2=Paper, 3=Scissors)
        int computerChoice = random.nextInt(3) + 1;

        //Display menu and prompt user
        System.out.println("=================================");
        System.out.println("      ROCK - PAPER - SCISSORS    ");
        System.out.println("=================================");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.println("---------------------------------");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int userChoice = scanner.nextInt();

        // Validate input
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid input.  Please enter 1, 2, or 3.");
            scanner.close();
            return;
        }
        // Convert numbers to names
        String[] choices = {"", "Rock", "Paper", "Scissors"};
        String userName = choices[userChoice];
        String computerName = choices[computerChoice];

        // Display selections
        System.out.println("=================================");
        System.out.println("  Your choice:     " + userName);
        System.out.println("  Computer choice: " + computerName);
        System.out.println("---------------------------------");

        // Determine results
        if(userChoice == computerChoice) {
            System.out.println(" Result: It's a TIE!");
        } else if (
            (userChoice == 1 && computerChoice ==3) || //Rock beats Scissors
            (userChoice == 2 && computerChoice ==1) || //Paper beats Rock
            (userChoice == 3 && computerChoice ==2)    //Scissors beats Paper
        ) {
            System.out.println("   Result: YOU WIN!");   
        } else {
            System.out.println("   Result:  COMPUTER WINS!");
        }

        System.out.println("=================================");
        scanner.close();
    }
}
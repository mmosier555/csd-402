/**
 * *Megan Mosier
 * CSD-402
 * Module 1.3
 */


import java.util.Scanner;

public class WaterHeating {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt user for inputs
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        // Calculate energy using Q = waterMass * (finalTemperature - initialTemperature) * 4184
        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.println("\n--- Results ---");
        System.out.println("Water mass:          " + waterMass + " kg");
        System.out.println("Initial temperature: " + initialTemperature + " °C");
        System.out.println("Final temperature:   " + finalTemperature + " °C");
        System.out.printf("Energy required:     %.2f Joules%n", Q);

        input.close();
    }
}
package org.example;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean guessIsCorrect = false;

    public static void main(String[] args) {

        int correctNumberGuess = getRandomNumber(1, 100);

        do {
            int guessFromUser;
            System.out.print("Guess a number between 1 - 100: ");
            try {
                guessFromUser = scanner.nextInt();
            } catch (Exception ex) {
                System.out.println(ex);
                break;
            }
            compareNumbers(guessFromUser, correctNumberGuess);
        } while (!guessIsCorrect);
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void compareNumbers(int guess, int comparedNumber) {
        if (guess > comparedNumber)
             System.out.printf("The number %d is too large.%n", guess);
        else if (guess < comparedNumber)
            System.out.printf("The number %d is too small.%n", guess);
        else {
            System.out.printf("The number %d is correct!%n", guess);
            guessIsCorrect = true;
        }
    }
}
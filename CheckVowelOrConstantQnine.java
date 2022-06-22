package DayFiveJavaAssignment;

import java.util.Scanner;

public class CheckVowelOrConstantQnine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet");
        String alphabet = sc.nextLine();

        if (alphabet.equals("a")) {
            System.out.println("It is a vowels");
        } else if (alphabet.equals("e")) {
            System.out.println("It is a vowel");
        } else if (alphabet.equals("i")) {
            System.out.println("It is a vowel");
        } else if (alphabet.equals("o")) {
            System.out.println("It is a vowel");
        } else if (alphabet.equals("u")) {
            System.out.println("It is a vowel");
        } else if (alphabet.equals("A")) {
            System.out.println("It is a vowels");
        } else if (alphabet.equals("E")) {
            System.out.println("It is a vowel");
        } else if (alphabet.equals("I")) {
            System.out.println("It is a vowel");
        } else if (alphabet.equals("O")) {
            System.out.println("It is a vowel");
        } else if (alphabet.equals("U")) {
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is a constant");
        }
    }
}

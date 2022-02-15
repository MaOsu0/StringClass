package Lekcja2;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        String sentense = readTextFromUser();
        sentense = changeTextToUpperOrLowerCase(sentense);
        printSentenseAfterChange(sentense);
    }

    private static void printSentenseAfterChange(String sentense) {
        System.out.println("tekst po zmianie: ");
        System.out.println(sentense);
    }

    private static String readTextFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź dowolny tekst:");
        String sentense = sc.nextLine();
        return sentense;
    }

    private static String changeTextToUpperOrLowerCase(String sentense) {
        char firstCharacter = sentense.charAt(0);
        if (Character.isUpperCase(firstCharacter)) {
            sentense = sentense.toUpperCase();
        } else if (Character.isLowerCase(firstCharacter)) {
            sentense = sentense.toLowerCase();
        }
        return sentense;
    }
}

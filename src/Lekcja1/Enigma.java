package Lekcja1;

import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        Scanner sc = new Scanner(System.in);


        System.out.println("podaj liczbę wyrazów");
        int numbers = sc.nextInt();
        sc.nextLine();
        if (numbers > 0) {
            for (int i = 0; i <= numbers - 1; i++) {
                System.out.println("podaj słowo:");
                String word = sc.nextLine();
                int wordLenght = word.length();
                builder.append(word.charAt(wordLenght - 1));
            }
        } else {
            System.out.println("podaj wartość większą od 0");
        }
        sc.close();
        System.out.println("słowo z ostatnich liter to: " + builder);


    }
}

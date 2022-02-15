package Lekcja;

import java.util.Arrays;
import java.util.Scanner;

public class StringsTest {
    public static void main(String[] args) {
//        String s1 = "Ania";
//        String s2 = "Ania";
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//
//        String s3 = new String("Ania");
//        String s4 = new String("Ania");
//        System.out.println(s3 == s4);
//        System.out.println(s3.equals(s4));
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Podaj napis 1: ");
//        String str1 = sc.nextLine();
//        System.out.println("Podaj napis 2: ");
//        String str2 = sc.nextLine();
//
//        System.out.println("str1 == str2" + (str1 == str2));
//        System.out.println("str1.equals(str2)" + (str1.equals(str2)));
//        String hello = "Hello ";
//        hello = hello + "World";
//
//        long start = System.nanoTime();
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < 1000; i++) {
//            builder.append(i);
//            builder.append(" ");
//        }
//        String numbers = builder.toString();
//        long time1 = System.nanoTime() - start;
//        System.out.println(time1);
//
//        start = System.nanoTime();
//        String numbers2 = "";
//        for (int i = 0; i < 1000; i++) {
//            numbers2 = numbers2 + i + " ";
//        }
//
//        long time2 = System.nanoTime() - start;
//        System.out.println(time2);
//        System.out.println(numbers);
//        System.out.println(numbers2);
//        System.out.println("time2/time 1" + time2/time1);
        String words = "  Jeden dwa trzy cztery pięc sześć siedem ";

        String sub1 = words.substring(2, 7);
        String sub2 = words.replaceAll("dwa", "hehe");
        String sub3 = words.trim();
        char charat = words.charAt(2);

        System.out.println(words);
        System.out.println("sub1: " + sub1);
        System.out.println(sub2);
        System.out.println(sub3);
        System.out.println(charat);

        System.out.println(words.toUpperCase());
        System.out.println(words.toLowerCase());
        System.out.println(words.length());
        String[] split = sub3.split(" ");
        System.out.println(split.length);
        System.out.println(Arrays.toString(split));

    }
}

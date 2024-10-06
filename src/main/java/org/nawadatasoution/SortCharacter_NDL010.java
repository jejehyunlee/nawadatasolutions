package org.nawadatasoution;

import java.util.Scanner;

public class SortCharacter_NDL010 {
    public static void main(String[] args) {

        Scanner inputan = new Scanner(System.in);
        System.out.print("Input one line of words (S) :");
        String data = inputan.nextLine();
        String vowels = "";
        String consonants = "";

        String vowelChars = "aeiou";

        for (int i = 0; i < data.length(); i++) {
            char currentChar = data.charAt(i);

            if (Character.isLetter(currentChar)) {
                if (vowelChars.contains(String.valueOf(currentChar).toLowerCase())) {
                    vowels += currentChar;
                } else {
                    consonants += currentChar;
                }
            }
        }

        System.out.println("Vowel Characters : ");
        System.out.println(vowels.toLowerCase());
        System.out.println("Consonant Characters : ");
        System.out.println(consonants.toLowerCase());

    }
}

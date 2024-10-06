package org.nawadatasoution;

import java.util.Arrays;
import java.util.Scanner;

public class PSBB_NDL011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of families: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Input the number of members in the family (separated by a space): ");
        String input = scanner.nextLine().trim();

        String[] membersInput = input.split("\\s+");

        if (membersInput.length != n) {
            System.out.println("Input must be equal with count of family");
            return;
        }

        int[] familyMembers = new int[n];
        for (int i = 0; i < n; i++) {
            familyMembers[i] = Integer.parseInt(membersInput[i]);
        }


        Arrays.sort(familyMembers);

        int buses = 0;
        int i = 0, j = n - 1;

        while (i <= j) {
            if (familyMembers[i] + familyMembers[j] <= 4) {
                i++;
            }
            j--;
            buses++;
        }

        System.out.println("Minimum bus required is: " + buses);
    }

}

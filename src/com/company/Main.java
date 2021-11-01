package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continueProgram = true;

        do {
            System.out.println("Ievadiet vārdu un uzvārdu: ");
            String entry = scan.nextLine();
            entry = entry.trim().replaceAll("\\s+", " ");
            String arr[] = entry.split(" ");

            if (arr.length == 1)
            {
                System.out.println("Ievadīts tikai vārds.");
                continue;
            }

            String name = "";
            String lastName = "";

            for (int i = 0; i < arr.length; i++) {
                name = arr[0];

                if( i >= 1 )
                {
                    if( !lastName.isEmpty() )
                    {
                        lastName += "\s";
                    }
                    lastName += arr[i].toUpperCase();
                }
            }

            char nameFirstLetter = name.charAt(0);
            String nameFirstLetterUpper = String.valueOf(nameFirstLetter).toUpperCase();
            name = name.toLowerCase().substring(1, name.length());
            String changedName = nameFirstLetterUpper + name;

            // here comes the result
            System.out.println("\'" + changedName + "\'");
            System.out.println(lastName);

            continueProgram = false;

        }
        while(continueProgram == true);

    }
}

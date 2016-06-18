/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kata.anagram;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Tapio
 */
public class Main {

    public static void main(String[] args) {
        Anagram a = new Anagram(new FileHelper());
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Exit by typing: !exit");
        while (true) {
            System.out.println("Enter a word: ");
            String baseCase = scanner.nextLine().toString();
            
            if (baseCase.equals("!exit")) {
                break;
            }

            try {
                System.out.println("Find one or two word combinations? Enter: 1 or 2");
                int combination = scanner.nextInt();
                scanner.nextLine();

                if (combination == 1 || combination == 2) {
                    a.findAnagrams(baseCase, combination);
                } else {
                    System.out.println("Enter a number 1 or 2");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: you probably tried to enter a string or something else, try a number");
            }
        }

    }

}

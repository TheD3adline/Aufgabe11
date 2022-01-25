package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numHigh;
        int numLow;
        int function, loop;
        boolean reset = true;
        Scanner sc = new Scanner(System.in);

        do {
            numHigh = 1000;
            numLow = 1;
            System.out.println("Dieses Spiel soll eine Zahl festellen die der Benutzer sich denkt");
            System.out.println("Denken Sie bitte an eine Zahl zwischen " + numLow + " und " + numHigh);
            System.out.println("Ist Ihre Zahl die " + (numHigh / 2) + " oder ist sie groesser (>) oder kleiner (<) als Ihre Zahl?");
            System.out.println("Meine Zahl ist... ");
            System.out.println("...die " + (numHigh / 2) + ", 1 druecken!");
            System.out.println("...kleiner (<) als die " + (numHigh / 2) + ", 2 druecken!");
            System.out.println("...groesser (>) als die " + (numHigh / 2) + ", 3 druecken!");
            function = sc.nextInt();

        } while(reset);
    }
}

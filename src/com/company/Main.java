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
            System.out.println("Ihre Zahl ist... ");
            System.out.println("...die " + (numHigh / 2) + ", 1 druecken!");
            System.out.println("...kleiner (<) als die " + (numHigh / 2) + ", 2 druecken!");
            System.out.println("...groesser (>) als die " + (numHigh / 2) + ", 3 druecken!");
            function = sc.nextInt();
            switch (function) {
                case 1:
                    System.out.println("Ich habe es geschafft Ihre Zahl, die " + (numHigh / 2) + " zu finden!");
                    System.out.println("Wollen Sie noch einmal spielen?");
                    System.out.println("1. JA (RESET)");
                    System.out.println("0. NEIN (EXIT)");
                    loop = sc.nextInt();
                    if(loop == 0) {
                        reset = false;
                        System.out.println("Programm wird beendet!");
                    }
                    else if(loop == 1) {
                        reset = true;
                        System.out.println("NEUSTART!");
                    }
                    else {
                        System.out.println("ERROR: Falsche Eingabe, Programm abgebrochen!");
                        reset = false;
                    }
                    break;
                case 2:
                    System.out.println("Ihre Zahl ist kleiner als " + (numHigh / 2));
            }

        } while(reset);
    }
}

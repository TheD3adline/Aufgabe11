package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numHigh = 1000;
        int numMid = 500;
        int numLow = 1;
        int tries = 1;
        int function, loop;
        boolean reset = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dieses Spiel soll eine Zahl festellen die der Benutzer sich denkt");
        System.out.println("Denken Sie bitte an eine Zahl zwischen " + numLow + " und " + numHigh);

        do {
            System.out.println("Ist Ihre Zahl die " + numMid + " oder ist Ihre Zahl groesser (>) oder kleiner (<) als " + numMid + " ?");
            System.out.println("Meine Zahl ist... ");
            System.out.println("...tatsaechlich die " + numMid + ", 1 druecken!");
            System.out.println("...kleiner (<) als " + numMid + ", 2 druecken!");
            System.out.println("...groesser (>) als " + numMid + ", 3 druecken!");
            function = sc.nextInt();
            switch (function) {
                case 1:
                    System.out.println("Ich habe es geschafft Ihre Zahl, " + numMid + " zu finden und habe dazu " + tries + " Versuche gebraucht!");
                    System.out.println("Wollen Sie noch einmal spielen?");
                    System.out.println("1. JA (RESET)");
                    System.out.println("0. NEIN (EXIT)");
                    loop = sc.nextInt();
                    if (loop == 0) {
                        reset = false;
                        System.out.println("Programm wird beendet!");
                    } else if (loop == 1) {
                        System.out.println("NEUSTART!");
                        numHigh = 1000;
                        numMid = 500;
                        numLow = 1;
                        tries = 1;
                        System.out.println("Dieses Spiel soll eine Zahl festellen die der Benutzer sich denkt");
                        System.out.println("Denken Sie bitte an eine Zahl zwischen " + numLow + " und " + numHigh);
                    } else {
                        System.out.println("ERROR: Falsche Eingabe, Programm abgebrochen!");
                        reset = false;
                    }
                    break;
                case 2:
                    numHigh = numMid;
                    numMid -= lower(numLow, numHigh);
                    tries++;
                    break;
                case 3:
                    numLow = numMid;
                    numMid += higher(numLow, numHigh);
                    tries++;
                    break;
                default:
                    System.out.println("Error: Falsche Eingabe, Programm abgebrochen!");
                    reset = false;
            }

        } while(reset);

    }

    public static int lower(int x, int y) {
        if (x == 1) {
            return y / 2;
        } else {
            return (y - x) / 2;
        }
    }

    public static int higher(int x, int y) {
        return (y - x) / 2;
    }

}

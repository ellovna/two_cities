package com.solvdproject;

import java.util.Scanner;

public class ConsoleInputReader {
    private Scanner scanner;

    public ConsoleInputReader(){
        scanner = new Scanner(System.in);
    }
    public String readString(){
        return scanner.nextLine();
    }

    public int readInt(){
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public double readDouble() {
        double value = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        return value;
    }

    // We can add more methods for reading other types of inputs if we need additional ones.

    public void close(){
        scanner.close();
    }
}

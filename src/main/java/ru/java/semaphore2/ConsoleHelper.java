package ru.java.semaphore2;

public class ConsoleHelper {

    public static void writeInConsole(String message) {
        System.out.print(message);
    }

    public static void writeInConsoleWithBl(String message) {
        writeInConsole(message);
        writeInConsole("\n");
    }
}

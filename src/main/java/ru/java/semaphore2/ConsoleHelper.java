package ru.java.semaphore2;

/**
 * Created by Admin on 15.05.2016.
 */
public class ConsoleHelper {

    public static void writeInConsole(String message) {
        System.out.print(message);
    }

    public static void writeInConsoleWithBl(String message) {
        writeInConsole(message);
        writeInConsole("\n");
    }
}

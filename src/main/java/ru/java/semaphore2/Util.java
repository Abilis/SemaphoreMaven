package ru.java.semaphore2;

import java.io.Closeable;
import java.io.IOException;

public class Util {
    /**
     * @param resourse
     *
     * Метод пытается закрыть ресурс. Если не удается - исключение игнорируется.
     */
    public static void closeQuietly(Closeable resourse) {
        if (resourse != null) {
            try {
                resourse.close();
            } catch (IOException ignore) {
                /*NOP*/
            }
        }
    }
}
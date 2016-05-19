package ru.java.semaphore2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Semaphore {

    private BufferedReader reader;

    float amountMinute;
    float amountMinuteNormal;

    String semaphoreColor;
    private static final String GREETING_MESSAGE1 = "Первые 2 минуты горит зеленый цвет светофора, затем 3 минуты - " +
            "желтый, затем 5 минут - красный";
    private static final String GREETING_MESSAGE2 = "Введите количество минут, и программа рассчитает цвет светофора" +
            " на этот момент. Можно вводить дробные значения";

    public void init() {
        bufferedReaderInit();
        ConsoleHelper.writeInConsoleWithBl(GREETING_MESSAGE1);
        ConsoleHelper.writeInConsoleWithBl(GREETING_MESSAGE2);
        amountMinuteInit();
        calculateAmountMinuteNormal();
        calculateSemaphoreColor();
        ConsoleHelper.writeInConsoleWithBl("В минуту " + amountMinute + " горит " + semaphoreColor + " цвет");
        Util.closeQuietly(reader);
    }

    private void bufferedReaderInit() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    private void amountMinuteInit() {

        while (true) {
            try {
                String strAmountMinute = reader.readLine();
                amountMinute = Float.parseFloat(strAmountMinute);
                if (amountMinute < 1.0f) {
                    throw new IOException("Количество минут не может быть меньше 1!");
                }
                return;
            } catch (IOException e1) {
                ConsoleHelper.writeInConsoleWithBl("Ошибка ввода: " + e1.getMessage());
            } catch (NumberFormatException e2) {
                ConsoleHelper.writeInConsoleWithBl("Не удалось распознать число. Попробуйте еще раз");
            }
        }
    }

    /**
     * Метод рассчитывает прошедшее нормированное число минут, т.к. все события повторяются с периодичностью в 10 минут
     */
    void calculateAmountMinuteNormal() {
        amountMinuteNormal = amountMinute - 1;  //вычитаем 1, т.к. удобнее оперировать интервалом [0; 10)
        amountMinuteNormal = amountMinuteNormal % 10;
    }

    void calculateSemaphoreColor() {
        if (amountMinuteNormal < 2.00f) {
            semaphoreColor = "зеленый";
        } else if (amountMinuteNormal < 5.00f) {
            semaphoreColor = "желтый";
        } else {
            semaphoreColor = "красный";
        }
    }
}
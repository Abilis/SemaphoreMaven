package ru.java.semaphore2;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by Admin on 15.05.2016.
 */
public class SemaphoreTest {

    private Semaphore semaphore = new Semaphore();

    @Test
    public void calculateSemaphoreColorBeginFirstMinute() {
        semaphore.amountMinute = 1.0f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("зеленый"));
    }

    @Test
    public void calculateSemaphoreColorEndFirstMinute() {
        semaphore.amountMinute = 1.99f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("зеленый"));
    }

    @Test
    public void calculateSemaphoreColorBeginSecondMinute() {
        semaphore.amountMinute = 2.0f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("зеленый"));
    }

    @Test
    public void calculateSemaphoreColorEndSecondMinute() {
        semaphore.amountMinute = 2.99f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("зеленый"));
    }

    @Test
    public void calculateSemaphoreColorBeginThirdMinute() {
        semaphore.amountMinute = 3.0f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("желтый"));
    }

    @Test
    public void calculateSemaphoreColorEndThirdMinute() {
        semaphore.amountMinute = 3.99f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("желтый"));
    }

    @Test
    public void calculateSemaphoreColorBeginFourthMinute() {
        semaphore.amountMinute = 4.0f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("желтый"));
    }

    @Test
    public void calculateSemaphoreColorEndFourthMinute() {
        semaphore.amountMinute = 4.99f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("желтый"));
    }

    @Test
    public void calculateSemaphoreColorBeginFivethMinute() {
        semaphore.amountMinute = 5.0f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("желтый"));
    }

    @Test
    public void calculateSemaphoreColorEndFivethMinute() {
        semaphore.amountMinute = 5.99f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("желтый"));
    }

    @Test
    public void calculateSemaphoreColorBeginSixthMinute() {
        semaphore.amountMinute = 6.0f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("красный"));
    }

    @Test
    public void calculateSemaphoreColorEndSixMinute() {
        semaphore.amountMinute = 6.99f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("красный"));
    }

    @Test
    public void calculateSemaphoreColorBeginSevenMinute() {
        semaphore.amountMinute = 7.0f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("красный"));
    }

    @Test
    public void calculateSemaphoreColorMiddleEightMinute() {
        semaphore.amountMinute = 8.5f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("красный"));
    }

    @Test
    public void calculateSemaphoreColorEndNineMinute() {
        semaphore.amountMinute = 9.99f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("красный"));
    }

    @Test
    public void calculateSemaphoreColorBeginTenMinute() {
        semaphore.amountMinute = 10.0f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("красный"));
    }

    @Test
    public void calculateSemaphoreColorEndTenMinute() {
        semaphore.amountMinute = 10.99f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("красный"));
    }

    @Test
    public void calculateSemaphoreColorBeginElevenMinute() {
        semaphore.amountMinute = 11.0f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("зеленый"));
    }

    @Test
    public void calculateSemaphoreColorEndElevenMinute() {
        semaphore.amountMinute = 11.99f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("зеленый"));
    }

    @Test
    public void calculateSemaphoreColorBeginTwelveMinute() {
        semaphore.amountMinute = 12.0f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("зеленый"));
    }

    @Test
    public void calculateSemaphoreColorEndTwelveMinute() {
        semaphore.amountMinute = 12.99f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("зеленый"));
    }

    @Test
    public void calculateSemaphoreColorBeginThirdteenMinute() {
        semaphore.amountMinute = 13.0f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("желтый"));
    }

    @Test
    public void calculateSemaphoreColorMiddleFortyFourMinute() {
        semaphore.amountMinute = 44.5f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("желтый"));
    }

    @Test
    public void calculateSemaphoreColorMiddleFiftyfirstMinute() {
        semaphore.amountMinute = 51.5f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("зеленый"));
    }

    @Test
    public void calculateSemaphoreColorEndSixtySecondMinute() {
        semaphore.amountMinute = 62.99f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("зеленый"));
    }

    @Test
    public void calculateSemaphoreColorBeginSixtyThirdMinute() {
        semaphore.amountMinute = 63.0f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("желтый"));
    }

    @Test
    public void calculateSemaphoreColorEndSeventyMinute() {
        semaphore.amountMinute = 70.99f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("красный"));
    }

    @Test
    public void calculateSemaphoreColorBeginSixtyMinute() {
        semaphore.amountMinute = 60.0f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("красный"));
    }

    @Test
    public void calculateSemaphoreColorBeginOneHundredMinute() {
        semaphore.amountMinute = 120.0f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("красный"));
    }

    @Test
    public void calculateSemaphoreColorEndThreeHundredThirdyTwoMinute() {
        semaphore.amountMinute = 332.99f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("зеленый"));
    }

    @Test
    public void calculateSemaphoreColorBeginSeventyThreeMinute() {
        semaphore.amountMinute = 73.0f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("желтый"));
    }

    @Test
    public void calculateSemaphoreColorEndNinetyFiveMinute() {
        semaphore.amountMinute = 95.99f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("желтый"));
    }

    @Test
    public void calculateSemaphoreColorEndOneHundredNineteenMinute() {
        semaphore.amountMinute = 119.99f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("красный"));
    }

    @Test
    public void calculateSemaphoreColorBeginOneHundredForteenMinute() {
        semaphore.amountMinute = 114.0f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("желтый"));
    }

    @Test
    public void calculateSemaphoreColorEndThirtyNineMinute() {
        semaphore.amountMinute = 39.99f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("красный"));
    }

    @Test
    public void calculateSemaphoreColorEndTwentyTwoMinute() {
        semaphore.amountMinute = 22.99f;
        semaphore.calculateAmountMinuteNormal();
        semaphore.calculateSemaphoreColor();
        Assert.assertThat(semaphore.semaphoreColor, is("зеленый"));
    }
}
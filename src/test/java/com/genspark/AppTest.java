package com.genspark;

import com.genspark.Converters.IndianNumbersToWords;
import com.genspark.NumbersMap.IndianMagnitudes;
import com.genspark.NumbersMap.LongScaleBritishMagnitudes;
import com.genspark.NumbersMap.LongScaleEuropeanMagnitudes;
import com.genspark.NumbersMap.ModernMagnitudes;
import com.genspark.Converters.NumbersToWords;
import com.genspark.Converters.WesternNumbersToWords;
import org.junit.Test;

import java.util.ArrayList;

public class AppTest {

    @Test
    public void testMain() {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("-1");
        numbers.add("-2");
        numbers.add("-10");
        numbers.add("-12");
        numbers.add("-68");
        numbers.add("-100");
        numbers.add("-845654");
        numbers.add("0");
        numbers.add("-0");
        numbers.add("1");
        numbers.add("2");
        numbers.add("10");
        numbers.add("12");
        numbers.add("40");
        numbers.add("49");
        numbers.add("68");
        numbers.add("+88");
        numbers.add("100");
        numbers.add("101");
        numbers.add("110");
        numbers.add("111");
        numbers.add("535");
        numbers.add("1,000");
        numbers.add("1000");
        numbers.add("1001");
        numbers.add("6010");
        numbers.add("7011");
        numbers.add("1100");
        numbers.add("1101");
        numbers.add("1110");
        numbers.add("1111");
        numbers.add("8000");
        numbers.add("900,00");
        numbers.add("500000");
        numbers.add("990000");
        numbers.add("1234567");
        numbers.add("12,345,678");
        numbers.add("234567895");
        numbers.add("823456789012099");
        numbers.add("8234567890120991");
        numbers.add("8234567890120991234456789012099");
        NumbersToWords numbersToWords = new WesternNumbersToWords();
        numbersToWords.setMagnitudes(new ModernMagnitudes());
        NumbersToWords indianNumbersToWords = new IndianNumbersToWords();
        indianNumbersToWords.setMagnitudes(new IndianMagnitudes());
        NumbersToWords longScaleEuropean = new WesternNumbersToWords();
        longScaleEuropean.setMagnitudes(new LongScaleEuropeanMagnitudes());
        NumbersToWords longScaleBritish = new WesternNumbersToWords();
        longScaleBritish.setMagnitudes(new LongScaleBritishMagnitudes());
        for (String number : numbers) {
            numbersToWords.setNumberString(number);
            System.out.printf("Modern English      %s is: %s%n", number, numbersToWords.getWords());
            indianNumbersToWords.setNumberString(number);
            System.out.printf("Indian English      %s is: %s%n", number, indianNumbersToWords.getWords());
            longScaleEuropean.setNumberString(number);
            System.out.printf("Long Scale European %s is: %s%n", number, longScaleEuropean.getWords());
            longScaleBritish.setNumberString(number);
            System.out.printf("Long Scale British  %s is: %s%n", number, longScaleBritish.getWords());
        }
    }
}
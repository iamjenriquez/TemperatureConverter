package com.vogella.temperatureconverter;

/**
 * Created by Julius on 11/9/2015.
 */
public class ConvertUtil {

    /**
     * Converts to Celsius
     */
    public static float convertFahrenheitToCelsius(float fahrenheit) {
        return ((fahrenheit - 32) * 5/9);
    }

    /**
     * Converts to Fahrenheit
     */
    public static float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }
}

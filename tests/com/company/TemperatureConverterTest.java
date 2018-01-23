package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void testFahrenheitToCelsius() {
        String converting_from = "F";
        String converting_to = "C";
        TemperatureConverter testConverter = new TemperatureConverter(converting_from, converting_to);
        assertEquals(0, testConverter.convert(32));
    }

    @Test
    void testFahrenheitToKelvin() {
        String converting_from = "F";
        String converting_to = "K";
        TemperatureConverter testConverter = new TemperatureConverter(converting_from, converting_to);
        assertEquals(273.15, testConverter.convert(32));
    }

    @Test
    void testFahrenheitToFarenheit() {
        String converting_from = "F";
        String converting_to = "F";
        TemperatureConverter testConverter = new TemperatureConverter(converting_from, converting_to);
        assertEquals(0, testConverter.convert(0));
    }

    @Test
    void testCelsiusToKelivn() {
        String converting_from = "C";
        String converting_to = "K";
        TemperatureConverter testConverter = new TemperatureConverter(converting_from, converting_to);
        assertEquals(273.15, testConverter.convert(0));
    }

    @Test
    void testCelsiusToFahrenheit() {
        String converting_from = "C";
        String converting_to = "F";
        TemperatureConverter testConverter = new TemperatureConverter(converting_from, converting_to);
        assertEquals(32, testConverter.convert(0));
    }

    @Test
    void testCelsiusToCelsius() {
        String converting_from = "C";
        String converting_to = "C";
        TemperatureConverter testConverter = new TemperatureConverter(converting_from, converting_to);
        assertEquals(0, testConverter.convert(0));
    }

    @Test
    void testKelvinToFahrenheit() {
        String converting_from = "K";
        String converting_to = "F";
        TemperatureConverter testConverter = new TemperatureConverter(converting_from, converting_to);
        assertEquals(32, testConverter.convert(273.15));
    }

    @Test
    void testKelvinToCelsius() {
        String converting_from = "K";
        String converting_to = "C";
        TemperatureConverter testConverter = new TemperatureConverter(converting_from, converting_to);
        assertEquals(0, testConverter.convert(273.15));
    }

    @Test
    void testKelvinToKelvin() {
        String converting_from = "K";
        String converting_to = "K";
        TemperatureConverter testConverter = new TemperatureConverter(converting_from, converting_to);
        assertEquals(0, testConverter.convert(0));
    }


}
package com.company;

public class TemperatureConverter {
    public String temperature_unit;
    public String convert_to;

    TemperatureConverter(String temp_unit, String converting_to) {
        temperature_unit = temp_unit;
        convert_to = converting_to;
    }

    public double convert(double temp) {
        if (temperature_unit.equals("C") && convert_to.equals("F")) {
            return (temp * 9 / 5) + 32;
        } else if (temperature_unit.equals("C") && convert_to.equals("K")) {
            return (temp + 273.15);
        } else if (temperature_unit.equals("F") && convert_to.equals("C")) {
            return (temp - 32) * 5 / 9;
        } else if (temperature_unit.equals("F") && convert_to.equals("K")) {
            return (temp - 32) * 5 / 9 + 273.15;
        } else if (temperature_unit.equals("K") && convert_to.equals("F")) {
            return (temp - 273.15) * 9 / 5 + 32;
        } else if (temperature_unit.equals("K") && convert_to.equals("C")) {
            return (temp - 273.15);
        }
        return temp;
    }
}

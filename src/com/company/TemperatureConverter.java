package com.company;

public class TemperatureConverter {
    public String converting_from;
    public String converting_to;

    TemperatureConverter(String converting_from, String converting_to) {
        this.converting_from = converting_from;
        this.converting_to = converting_to;
    }

    public double convert(double temp) {
        if (converting_from.equals("C") && converting_to.equals("F")) {
            return (temp * 9 / 5) + 32;
        } else if (converting_from.equals("C") && converting_to.equals("K")) {
            return (temp + 273.15);
        } else if (converting_from.equals("F") && converting_to.equals("C")) {
            return (temp - 32) * 5 / 9;
        } else if (converting_from.equals("F") && converting_to.equals("K")) {
            return (temp - 32) * 5 / 9 + 273.15;
        } else if (converting_from.equals("K") && converting_to.equals("F")) {
            return (temp - 273.15) * 9 / 5 + 32;
        } else if (converting_from.equals("K") && converting_to.equals("C")) {
            return (temp - 273.15);
        }
        return temp;
    }
}

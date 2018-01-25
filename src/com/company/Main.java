package com.company;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);

		String input;
		System.out.print("INPUT (ex: 0F to C) -> ");
		//ex: #f variable; "converting_from"
		input = user_input.next();

		//the temp of the converting from unit
		double temp = Double.valueOf(input.substring(0, input.length() - 1));

		//the unit of converting from
		Character temp_unit = Character.toUpperCase(input.charAt(input.length() -1));

		// the "to" part
		user_input.next();

		// the "converting to" unit
		String converting_to = user_input.next().toUpperCase();

		TemperatureConverter converter = new TemperatureConverter(temp_unit.toString(), converting_to.toString());
		System.out.print(converter.convert(temp));
	}
}

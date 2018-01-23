package com.company;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);

		String converting_from;
		System.out.print("Temp you're converting from [C]elsius, [F]ahrenheit, [K]elvin: ");
		converting_from = user_input.nextLine();

		String converting_to;
		System.out.print("Temp you're converting to [C]elsius, [F]ahrenheit, [K]elvin: ");
		converting_to = user_input.nextLine();

		Integer temp;
		System.out.print("Temperature: ");
		temp = user_input.nextInt();

		TemperatureConverter converter = new TemperatureConverter(converting_from, converting_to);
		System.out.print(converter.convert(temp));
	}
}

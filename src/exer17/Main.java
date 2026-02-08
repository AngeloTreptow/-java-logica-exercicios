package exer17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Temperatura em Fahrenheit \nDigite: ");
		double f = sc.nextDouble();

		double c = ((f - 32) * 5) / 9;

		System.out.printf("\nFahrenheit: %.1f\nCelsius: %.1f", f, c);

		sc.close();
	}

}

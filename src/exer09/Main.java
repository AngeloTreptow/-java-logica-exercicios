package exer09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Calculadora IMC");
		System.out.print("Digite seu Peso: ");
		double peso = sc.nextDouble();
		System.out.print("Digite sua Altura: ");
		double altura = sc.nextDouble();

		double imc = peso / Math.pow(altura, 2);

		if (imc <= 18.5) {
			System.out.printf("\nResultado IMC: %.1f - Abaixo do peso\n", imc);
		} else if (imc <= 24.9) {
			System.out.printf("\nResultado IMC: %.1f - Peso ideal (parabéns)\n", imc);
		} else if (imc <= 29.9) {
			System.out.printf("\nResultado IMC: %.1f - Levemente acima do peso\n", imc);
		} else if (imc <= 34.9) {
			System.out.printf("\nResultado IMC: %.1f - Obesidade grau I\n", imc);
		} else if (imc <= 39.9) {
			System.out.printf("\nResultado IMC: %.1f - Obesidade grau II (severa)\n", imc);
		} else {
			System.out.printf("\nResultado IMC: %.1f - Obesidade grau III (mórbida)\n", imc);
		}

		System.out.println("\nTabela Condições IMC");
		System.out.println("Abaixo de 18,5   | Abaixo do peso\r\n" 
		        + "Entre 18,6 e 24,9 | Peso ideal (parabéns)\r\n"
				+ "Entre 25,0 e 29,9 | Levemente acima do peso\r\n" 
		        + "Entre 30,0 e 34,9 | Obesidade grau I\r\n"
				+ "Entre 35,0 e 39,9 | Obesidade grau II (severa)\r\n"
				+ "Maior ou igual a 40 | Obesidade grau III (mórbida)");

		sc.close();
	}

}

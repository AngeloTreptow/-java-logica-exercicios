package exer22;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite Apenas Valores Inteiros");
		
		System.out.print("\nDigite A: ");
		int a = sc.nextInt();
		
		System.out.print("Digite B: ");
		int b = sc.nextInt();

		if (b != 0) {
			int quociente = a / b;
			int restoDiv = a % b;
			System.out.printf("\nQuociente: %d\nResto da Divisão: %d", quociente, restoDiv);
		} else {
			System.out.println("Erro, impossivel divisão por Zero!");
		}

		sc.close();
	}

}

package exer13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite seu Nome: ");
		String nome = sc.nextLine();

		System.out.print("Digite sua Idade: ");
		int idade = sc.nextInt();

		String resultado = (idade >= 18) ? "MAIOR" : "MENOR";

		System.out.println("Seu nome é " + nome + ", e você é " + resultado + " de Idade!");

		sc.close();
	}

}

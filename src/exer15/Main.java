package exer15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o Ano Atual\n");

		System.out.print("Digite o Ano: ");
		int anoAtual = sc.nextInt();
		System.out.print("Digite o Mês: ");
		int mesAtual = sc.nextInt();
		System.out.print("Digite o Dia: ");
		int diaAtual = sc.nextInt();

		System.out.print("Digite sua Data de Nascimento\n");

		System.out.print("Digite o Ano: ");
		int anoNasc = sc.nextInt();
		System.out.print("Digite o Mês: ");
		int mesNasc = sc.nextInt();
		System.out.print("Digite o Dia: ");
		int diaNasc = sc.nextInt();

		int anos = anoAtual - anoNasc;
		int meses = mesAtual - mesNasc;
		int dias = diaAtual - diaNasc;

		if (dias < 0) {
			dias += 30;
			meses -= 1;
		}
		if (meses < 0) {
			meses += 12;
			anos -= 1;
		}

		System.out.printf("Voce ja viveu %d anos, %d meses, %d dias.", anos, meses, dias);

		sc.close();
	}

}

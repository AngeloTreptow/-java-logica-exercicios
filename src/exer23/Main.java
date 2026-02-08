package exer23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite Valor da Hora Aula: ");
		double valor = sc.nextDouble();

		System.out.print("Digite número de aulas lecionadas: ");
		int aulasDadas = sc.nextInt();

		System.out.print("Digite % de Desconto do INSS: ");
		double porcentagem = sc.nextDouble();

		if (valor >= 0 && aulasDadas >= 0 && porcentagem >= 0 && porcentagem <= 100) {
			double custoAulas = valor * aulasDadas;
			double salarioLiquido = custoAulas - (custoAulas * porcentagem / 100);
			System.out.printf("\nSalário líquido final: R$ %.2f", salarioLiquido);
		} else {
			System.out.println("\nValores Invalidos!");
		}

		sc.close();
	}

}

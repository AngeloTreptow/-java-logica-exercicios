package exer12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do Produto: ");
		double valor = sc.nextDouble();

		System.out.println("\n1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto\r\n"
				+ "2 - À Vista no cartão de crédito, recebe 10% de desconto\r\n"
				+ "3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros\r\n"
				+ "4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");

		System.out.print("\nDigite a forma de Pagamento: ");
		int opcao = sc.nextInt();

		double valorFinal;

		switch (opcao) {
		case 1: {
			valorFinal = valor - (valor * 0.15);
			break;
		}
		case 2: {
			valorFinal = valor - (valor * 0.10);
			break;
		}
		case 3: {
			valorFinal = valor;
			break;
		}
		case 4: {
			valorFinal = valor * 1.10;
			break;
		}
		default:
			System.out.println("Opcao invalida!");
			return;
		}

		System.out.printf("Valor Final a ser Pago: %.2f", valorFinal);

		sc.close();
	}

}

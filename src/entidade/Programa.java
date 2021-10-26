package entidade;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// pedidos dos alimentos
		System.out.print("Quantidade de alimento: ");
		int nAlimento = sc.nextInt();
		Pedidos[] vAlimento = new Pedidos[nAlimento];
		double somaAlimento = 0.0;
		double somaBebida = 0.0;

		for (int i = 0; i < vAlimento.length; i++) {
			sc.nextLine();
			System.out.print("Nome alimento: ");
			String nomeAlimento = sc.nextLine();

			System.out.print("Valor alimento: ");
			double valorAlimento = sc.nextDouble();
			vAlimento[i] = new Pedidos(nomeAlimento, valorAlimento);
		}

		// somando valor dos alimentos
		for (int i = 0; i < vAlimento.length; i++) {
			somaAlimento += vAlimento[i].getValorTotal();
		}

		// pedidos das bebidas
		System.out.print("Quantidade de bedidas: ");
		int nBebidas = sc.nextInt();
		Pedidos[] vBebidas = new Pedidos[nBebidas];

		for (int i = 0; i < vBebidas.length; i++) {
			sc.nextLine();
			System.out.println("Nome da bebida: ");
			String nomeBedida = sc.nextLine();

			System.out.println("Valor da bebida: ");
			double valorBebida = sc.nextDouble();

			vBebidas[i] = new Pedidos(nomeBedida, valorBebida);
		}

		// somando valor dos alimentos
		for (int i = 0; i < vBebidas.length; i++) {
			somaBebida += vBebidas[i].getValorTotal();
		}

		System.out.printf("Valor total alimento: %.2f%n", somaAlimento);
		System.out.printf("Valor total bebida: %.2f%n", somaBebida);

		sc.close();

	}

}

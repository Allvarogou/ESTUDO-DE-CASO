package swit;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		String[] vetorA = new String[20];

		int op = 0;

		do {

			System.out.println("Menu");

			System.out.println("Escolha uma das alternativas: ");

			System.out.println("======================================================");

			System.out.println("00 - Para encerrar o produto");

			System.out.println("01 - Cadastrar produto");

			System.out.println("02 - Listar produto");

			System.out.println("03 - Excluir produto");

			System.out.println("04 - Procurar produto");

			System.out.println("05 - Altere Produto");

			String opcao = leitura.nextLine();

			op = Integer.valueOf(opcao);

			switch (op) {

			case 1:

				System.out.println("Digite o produto a ser cadastrado: ");

				for (int i = 0; i < vetorA.length; i++) {

					String palavra = leitura.nextLine();

					vetorA[i] = palavra;

				}

				break;

			case 2:

				System.out.println("Produto a ser cadastrado: ");

				for (String palavra : vetorA) {

					if (palavra != null) {

						System.out.println(palavra);

					}

				}

				break;

			case 3:

				System.out.println("Digite o índice do produto as er excluido (0 a " + (vetorA.length - 1) + "): ");

				int indiceLimpar = Integer.parseInt(leitura.nextLine());

				if (indiceLimpar >= 0 && indiceLimpar < vetorA.length) {

					vetorA[indiceLimpar] = null;

					System.out.println("Produto excluido com sucesso!");

				} else {

					System.out.println("Índice inválido.");

				}

				break;

			case 4:

				System.out.println("Digite o produto a ser procurado: ");

				String palavraProcurada = leitura.nextLine();

				boolean encontrada = false;

				for (String palavra : vetorA) {

					if (palavra != null && palavra.equals(palavraProcurada)) {

						System.out.println("Produto encontrado!");

						encontrada = true;

						break;

					}

				}

				if (!encontrada) {

					System.out.println("Produto não encontrado.");

				}

				break;

			case 5:

				System.out.println("Digite o índice do produto a ser alterada (0 a " + (vetorA.length - 1) + "): ");

				int indiceAlterar = Integer.parseInt(leitura.nextLine());

				if (indiceAlterar >= 0 && indiceAlterar < vetorA.length) {

					System.out.println("Digite o novo produto: ");

					String novaPalavra = leitura.nextLine();

					vetorA[indiceAlterar] = novaPalavra;

					System.out.println("Produto alterado com sucesso!");

				} else {

					System.out.println("Índice inválido.");

				}

				break;

			default:

				System.out.println("Opção inválida. Encerrando o programa.");

				op = 0;

			}

		} while (op != 0);

	}

}
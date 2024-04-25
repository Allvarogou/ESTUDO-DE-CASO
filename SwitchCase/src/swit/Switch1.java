package swit;

import java.util.ArrayList;
import java.util.Scanner;

public class Switch1 extends Fornecedor {
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
			ArrayList<Produto> produtos = new ArrayList<>();
			String opcao = leitura.nextLine();

			op = Integer.valueOf(opcao);

			switch (op) {

			case 1:
			Produto p1 = new Produto();
			
				System.out.println("Digite o nome do produto a ser cadastrado: ");
				String nomeproduto = leitura.nextLine();
				p1.setNproduto(nomeproduto);
				
				System.out.println("Escreva o preço de venda: ");
		        String pcdv = leitura.nextLine();
		        float valorFloat2 = Float.parseFloat(pcdv);
				p1.setPVD(valorFloat2);
		        
		        
				System.out.println("Escreva o preço de custo: ");
				String pcd = leitura.nextLine();
				float valorFloat = Float.parseFloat(pcd);
				p1.setPVD(valorFloat);
				
				Produto p2 = new Produto();
				
				System.out.println("Digite o nome do produto a ser cadastrado: ");
				String nomeproduto2 = leitura.nextLine();
				p2.setNproduto(nomeproduto2);
				
				System.out.println("Escreva o preço de venda: ");
		        String pcdv2 = leitura.nextLine();
		        float valorFloat3 = Float.parseFloat(pcdv);
				p2.setPVD(valorFloat2);
		        
				System.out.println("Escreva o preço de custo: ");
				String pcd2 = leitura.nextLine();
				float valorFloat4 = Float.parseFloat(pcd);
				p2.setPVD(valorFloat);
				
				
				produtos.add(p1);
				produtos.add(p2);
				
				
				//System.out.println(getNproduto);
			
				break;

			case 2: // case 2 não esta funcionando
				
				System.out.println("Listar produtos: "); 
				for (Produto produto : produtos) {
					
				 System.out.println("Nome: " + produto.getNproduto());
                 System.out.println("Preço de custo: " + produto.getPC());
                 System.out.println("Preço de venda: " + produto.getPVD());
                 System.out.println("Fornecedor: " + produto.getFornecedor());
                 System.out.println(); 
				}
								
				break;

			case 3:
				System.out.println("Digite o indice do produto as er excluido (0 a " + (vetorA.length - 1) + "): ");
				int indiceLimpar = Integer.parseInt(leitura.nextLine());
				if (indiceLimpar >= 0 && indiceLimpar < vetorA.length) {
					vetorA[indiceLimpar] = null;
					System.out.println("Produto excluido com sucesso!");
				} else {

					System.out.println("Indice invalido.");
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
					System.out.println("Produto nao encontrado.");
				}
				break;

			case 5:
				System.out.println("Digite o Indice do produto a ser alterada (0 a " + (vetorA.length - 1) + "): ");
				int indiceAlterar = Integer.parseInt(leitura.nextLine());
				if (indiceAlterar >= 0 && indiceAlterar < vetorA.length) {
					System.out.println("Digite o novo produto: ");
					String novaPalavra = leitura.nextLine();
					vetorA[indiceAlterar] = novaPalavra;
					System.out.println("Produto alterado com sucesso!");

				} else {

					System.out.println("Indice invalido.");
				}

				break;

			default:
				System.out.println("Opçao invalida. Encerrando o programa.");

				op = 0;

			}

		} while (op != 0);

	}

}
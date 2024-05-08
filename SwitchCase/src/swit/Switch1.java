package swit; 
 
import java.util.ArrayList; 
import java.util.Scanner; 
 
public class Switch1 extends Produto { 
	public static void main(String[] args) { 
		 
		ArrayList<Produto> produtos = new ArrayList<>(); 
		
		 
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
				for (int i = 0; i < 2; i++) {
					
				
				
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
				p1.setPC(valorFloat); 
				
				produtos.add(p1);  
				}
				
				break; 
 
			case 2:
			    System.out.println("Lista de Produtos:");

			    // Verificando se a lista está vazia
			    if (produtos.isEmpty()) {
			        System.out.println("Não há produtos cadastrados.");
			    } else {
			        // Imprimindo as informações de cada produto
			        for (Produto produto : produtos) {
			            System.out.println("---------------------------------");
			            System.out.println(produto.getNproduto());
			            System.out.println("Preço de Venda: " + produto.getPVD());
			            System.out.println("Preço de Custo: " + produto.getPC());
			            System.out.println("---------------------------------");
			        }
			    }

			    break;

			case 3:
			    System.out.println("Excluir Produto:");
			    System.out.println("Digite o nome do produto a ser excluído: ");
                String nomeProdutoExcluir = leitura.nextLine();

                for (Produto produto : produtos) {
                    if (produto.getNproduto().equals(nomeProdutoExcluir)) {
                        produtos.remove(produto);
                        System.out.println("Produto excluído com sucesso!");
                        break;
                    }
                }
			    break;

 
			case 4:
                System.out.println("Digite o nome do produto a ser procurado: ");
                String nomeProdutoProcurar = leitura.nextLine();

                for (Produto produto : produtos) {
                    if (produto.getNproduto().equals(nomeProdutoProcurar)) {
                        System.out.println("Produto encontrado:");
                        System.out.println("Nome: " + produto.getNproduto());
                        System.out.println("Preço de Venda: " + produto.getPVD());
                        System.out.println("Preço de Custo: " + produto.getPC());
                        break;
                    }
                }
                break;

			 case 5:
                 System.out.println("Digite o nome do produto a ser alterado: ");
                 String nomeProdutoAlterar = leitura.nextLine();

                 for (Produto produto : produtos) {
                     if (produto.getNproduto().equals(nomeProdutoAlterar)) {
                         System.out.println("Digite o novo nome do produto: ");
                         String novoNomeProduto = leitura.nextLine();
                         produto.setNproduto(novoNomeProduto);

                         System.out.println("Digite o novo preço de venda: ");
                         String novoPVD = leitura.nextLine();
                         float novoValorFloat2 = Float.parseFloat(novoPVD);
                         produto.setPVD(novoValorFloat2);

                         System.out.println("Digite o novo preço de custo: ");
                         String novoPCD = leitura.nextLine();
                         float novoValorFloat = Float.parseFloat(novoPCD);
                         produto.setPC(novoValorFloat);

                         System.out.println("Produto alterado com sucesso!");
                         break;
                     }
                 }
                 break;
			default: 
				System.out.println("Opçao invalida. Encerrando o programa."); 
 
				op = 0; 
 
			} 
 
		} while (op != 0); 
 
	} 
 
}
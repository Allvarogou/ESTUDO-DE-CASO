package swit; 
 
import java.util.ArrayList; 
import java.util.Scanner; 
 
public class Switch1 extends Fornecedor { 
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
				
				//Produto p2 = new Produto(); 
				 
				//System.out.println("Digite o nome do produto a ser cadastrado: "); 
				//String nomeproduto2 = leitura.nextLine(); 
				//p2.setNproduto(nomeproduto2); 
				 
				//System.out.println("Escreva o preço de venda: "); 
		        //String pcdv2 = leitura.nextLine(); 
		        //float valorFloat3 = Float.parseFloat(pcdv); 
		        
				//p2.setPVD(valorFloat2); 
		         
				//System.out.println("Escreva o preço de custo: "); 
				//String pcd2 = leitura.nextLine(); 
				//float valorFloat4 = Float.parseFloat(pcd); 
				//p2.setPVD(valorFloat); 
				 
				 
	
				//produtos.add(p2); 
				 
				 
				//System.out.println(getNproduto); 
			 
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
			            System.out.println("Fornecedor: " + produto.getFornecedor()); // Acessando o fornecedor
			            System.out.println("---------------------------------");
			        }
			    }

			    break;

			case 3:
			    System.out.println("Excluir Produto:");

			    // Solicitando o índice do produto a ser excluído
			    System.out.print("Digite o índice do produto a ser excluído (0 a " + (produtos.size() - 1) + "): ");
			    int indiceExcluir = Integer.parseInt(leitura.nextLine());

			    // Verificando se o índice é válido
			    if (indiceExcluir >= 0 && indiceExcluir < produtos.size()) {
			        produtos.remove(indiceExcluir);
			        System.out.println("Produto excluído com sucesso!");
			    } else {
			        System.out.println("Índice inválido. Nenhum produto foi excluído.");
			    }

			    break;

 
			case 4:
			    System.out.println("Procurar Produto:");

			    // Solicitando o nome do produto a ser procurado
			    System.out.print("Digite o nome do produto a ser procurado: ");
			    String nomeProcurado = leitura.nextLine();

			    // Variável para controle da busca
			    boolean produtoEncontrado = false;

			    // Iterando pela lista de produtos
			    for (Produto produto : produtos) {
			        if (produto.getNproduto().equalsIgnoreCase(nomeProcurado)) {
			            System.out.println("---------------------------------");
			            System.out.println("Nome: " + produto.getNproduto());
			            System.out.println("Preço de Venda: " + produto.getPVD());
			            System.out.println("Preço de Custo: " + produto.getPC());
			            System.out.println("Fornecedor: " + produto.getFornecedor().getNome());
			            System.out.println("---------------------------------");
			            produtoEncontrado = true;
			            break; // Encontrou o produto, pode parar a iteração
			        }
			    }

			    if (!produtoEncontrado) {
			        System.out.println("Produto não encontrado.");
			    }

			    break;

			case 5:
			    System.out.println("Alterar Produto:");

			    // Solicitando o índice do produto a ser alterado
			    System.out.print("Digite o índice do produto a ser alterado (0 a " + (produtos.size() - 1) + "): ");
			    int indiceAlterar = Integer.parseInt(leitura.nextLine());

			    // Verificando se o índice é válido
			    if (indiceAlterar >= 0 && indiceAlterar < produtos.size()) {
			        // Objeto do produto a ser alterado
			        Produto produtoAlterar = produtos.get(indiceAlterar);

			        // Solicitando o novo nome do produto
			        System.out.print("Digite o novo nome do produto: ");
			        produtoAlterar.setNproduto(leitura.nextLine());

			        // Solicitando o novo preço de venda
			        System.out.print("Digite o novo preço de venda: ");
			        String pcdv1 = leitura.nextLine();
			        produtoAlterar.setPVD(Float.parseFloat(pcdv1));

			        // Solicitando o novo preço de custo
			        System.out.print("Digite o novo preço de custo: ");
			        String pcd1 = leitura.nextLine();
			        produtoAlterar.setPC(Float.parseFloat(pcd1));

			        // Mensagem de sucesso
			        System.out.println("Produto alterado com sucesso!");
			    } else {
			        System.out.println("Índice inválido. Nenhum produto foi alterado.");
			    }

			    break;
 
			default: 
				System.out.println("Opçao invalida. Encerrando o programa."); 
 
				op = 0; 
 
			} 
 
		} while (op != 0); 
 
	} 
 
}
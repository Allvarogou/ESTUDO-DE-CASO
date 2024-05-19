package visao;

import java.util.Scanner;
import controle.ProdutoController;
import modelo.Produto;

public class Switch1 {
    public static void main(String[] args) {
        ProdutoController controller = new ProdutoController();
        Scanner leitura = new Scanner(System.in);
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
                    System.out.println("Digite o nome do produto a ser cadastrado: ");
                    String nomeProduto = leitura.nextLine();
                    System.out.println("Escreva o preço de venda: ");
                    float pvd = Float.parseFloat(leitura.nextLine());
                    System.out.println("Escreva o preço de custo: ");
                    float pc = Float.parseFloat(leitura.nextLine());
                    int id = controller.adicionarProduto(nomeProduto, pvd, pc);
                    System.out.println("Produto cadastrado com ID: " + id);
                    break;

                case 2:
                    System.out.println("Lista de Produtos:");
                    controller.listarProdutos();
                    break;

                case 3:
                    System.out.println("Excluir Produto:");
                    System.out.println("Digite o ID do produto a ser excluído: ");
                    int idExcluir = Integer.parseInt(leitura.nextLine());
                    if (controller.excluirProduto(idExcluir)) {
                        System.out.println("Produto excluído com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Digite o ID do produto a ser procurado: ");
                    int idProcurar = Integer.parseInt(leitura.nextLine());
                    Produto produtoEncontrado = controller.procurarProduto(idProcurar);
                    if (produtoEncontrado != null) {
                        System.out.println("Produto encontrado:");
                        System.out.println("ID: " + produtoEncontrado.getId());
                        System.out.println("Nome: " + produtoEncontrado.getNproduto());
                        System.out.println("Preço de Venda: " + produtoEncontrado.getPVD());
                        System.out.println("Preço de Custo: " + produtoEncontrado.getPC());
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Digite o ID do produto a ser alterado: ");
                    int idAlterar = Integer.parseInt(leitura.nextLine());
                    System.out.println("Digite o novo nome do produto: ");
                    String novoNomeProduto = leitura.nextLine();
                    System.out.println("Digite o novo preço de venda: ");
                    float novoPVD = Float.parseFloat(leitura.nextLine());
                    System.out.println("Digite o novo preço de custo: ");
                    float novoPCD = Float.parseFloat(leitura.nextLine());
                    if (controller.alterarProduto(idAlterar, novoNomeProduto, novoPVD, novoPCD)) {
                        System.out.println("Produto alterado com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Encerrando o programa.");
                    op = 0;
            }
        } while (op != 0);
        leitura.close();
    }
}

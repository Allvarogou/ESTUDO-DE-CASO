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
            System.out.println("01 - Cadastrar palavra");
            System.out.println("02 - Listar palavras"); 
            System.out.println("03 - Limpar palavra"); 
            System.out.println("04 - Procurar palavra"); 
            System.out.println("05 - Altere a palavra"); 
            System.out.println("Digite outra coisa para encerrar ");

            String opcao = leitura.nextLine();
            op = Integer.valueOf(opcao);

            switch (op) {
                case 1:
                    System.out.println("Digite a palavra a ser cadastrada: ");
                    for (int i = 0; i < vetorA.length; i++) {
                        String palavra = leitura.nextLine();
                        vetorA[i] = palavra;
                    }
                    break;

                case 2:
                    System.out.println("Palavras cadastradas:");
                    for (String palavra : vetorA) {
                        if (palavra != null) {
                            System.out.println(palavra);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite o índice da palavra a ser limpa (0 a " + (vetorA.length - 1) + "): ");
                    int indiceLimpar = Integer.parseInt(leitura.nextLine());
                    if (indiceLimpar >= 0 && indiceLimpar < vetorA.length) {
                        vetorA[indiceLimpar] = null;
                        System.out.println("Palavra limpa com sucesso!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    System.out.println("Digite a palavra a ser procurada: ");
                    String palavraProcurada = leitura.nextLine();
                    boolean encontrada = false;
                    for (String palavra : vetorA) {
                        if (palavra != null && palavra.equals(palavraProcurada)) {
                            System.out.println("Palavra encontrada!");
                            encontrada = true;
                            break;
                        }
                    }
                    if (!encontrada) {
                        System.out.println("Palavra não encontrada.");
                    }
                    break;

                case 5:
                    System.out.println("Digite o índice da palavra a ser alterada (0 a " + (vetorA.length - 1) + "): ");
                    int indiceAlterar = Integer.parseInt(leitura.nextLine());
                    if (indiceAlterar >= 0 && indiceAlterar < vetorA.length) {
                        System.out.println("Digite a nova palavra: ");
                        String novaPalavra = leitura.nextLine();
                        vetorA[indiceAlterar] = novaPalavra;
                        System.out.println("Palavra alterada com sucesso!");
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

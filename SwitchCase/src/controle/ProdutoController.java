package controle;

import modelo.Produto;

public class ProdutoController {
    private ProdutoDAO dao;

    public ProdutoController() {
        this.dao = ProdutoDAO.getInstance();
    }

    public int adicionarProduto(String nome, float pvd, float pc) {
        Produto produto = new Produto();
        produto.setNproduto(nome);
        produto.setPVD(pvd);
        produto.setPC(pc);
        return dao.inserir(produto);
    }

    public void listarProdutos() {
        for (Produto produto : dao.listar()) {
            System.out.println("---------------------------------");
            System.out.println("ID: " + produto.getId());
            System.out.println("Nome: " + produto.getNproduto());
            System.out.println("Preço de Venda: " + produto.getPVD());
            System.out.println("Preço de Custo: " + produto.getPC());
            System.out.println("---------------------------------");
        }
    }

    public boolean excluirProduto(int id) {
        return dao.excluir(id);
    }

    public Produto procurarProduto(int id) {
        return dao.procurar(id);
    }

    public boolean alterarProduto(int id, String novoNome, float novoPvd, float novoPc) {
        Produto produto = dao.procurar(id);
        if (produto != null) {
            produto.setNproduto(novoNome);
            produto.setPVD(novoPvd);
            produto.setPC(novoPc);
            return true;
        }
        return false;
    }
}

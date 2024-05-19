package controle;

import java.util.ArrayList;
import modelo.Produto;

public class ProdutoDAO {
    private static ProdutoDAO instance;
    private ArrayList<Produto> estoque;
    private int geradorId;

    private ProdutoDAO() {
        this.estoque = new ArrayList<>();
        this.geradorId = 0;
    }

    public static ProdutoDAO getInstance() {
        if (instance == null) {
            instance = new ProdutoDAO();
        }
        return instance;
    }

    public int inserir(Produto produto) {
        if (produto != null) {
            produto.setId(geradorId);
            geradorId++;
            estoque.add(produto);
        }
        return produto.getId();
    }

    public ArrayList<Produto> listar() {
        return this.estoque;
    }

    public boolean excluir(int id) {
        for (Produto produto : estoque) {
            if (produto.getId() == id) {
                estoque.remove(produto);
                return true;
            }
        }
        return false;
    }

    public Produto procurar(int id) {
        for (Produto produto : estoque) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
}

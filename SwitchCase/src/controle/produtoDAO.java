package controle;

import java.util.ArrayList;

import modelo.Produto;

public class produtoDAO {
	
	private ArrayList<Produto> estoque  ;
	private int geradorId;
	
	public produtoDAO() {
		this.estoque = new ArrayList<>();
		this.geradorId = 0;
	}
	
	public int inserir(Produto produto) {
		
		if(produto!=null) {
			produto.setId(geradorId);
			geradorId = geradorId + 1; //incrementar 
			estoque.add(produto);
		}
		
		return produto.getId;
	}
	
	public ArrayList<Produto> listar() {
		return this.estoque;
	}
}

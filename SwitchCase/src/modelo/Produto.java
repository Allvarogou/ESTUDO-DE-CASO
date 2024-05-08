package modelo;

public class Produto extends Fornecedor{ 
 
	private String Nproduto; // Nome do produto 
	private Float PVD; // Preço de venda 
	private Float PC; // Preço de custo 
	private Fornecedor fornecedor; 
	private int id;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNproduto() { 
		return Nproduto; 
	} 
	public void setNproduto(String nproduto) { 
		Nproduto = nproduto; 
	} 
	public Float getPVD() { 
		return PVD; 
	} 
	public void setPVD(Float pVD) { 
		PVD = pVD; 
	} 
	public Float getPC() { 
		return PC; 
	} 
	public void setPC(Float pC) { 
		PC = pC; 
	} 
	public Fornecedor getFornecedor() { 
		return fornecedor; 
	} 
	public void setFornecedor(Fornecedor fornecedor) { 
		this.fornecedor = fornecedor; 
	} 
	 
 
 
}
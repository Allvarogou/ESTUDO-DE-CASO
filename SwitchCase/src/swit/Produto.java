package swit;

public class Produto {

	private String Nproduto; // Nome do produto
	private Float PVD; // Preço de venda
	private Float PC; // Preço de custo
	private Fornecedor fornecedor;
	
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
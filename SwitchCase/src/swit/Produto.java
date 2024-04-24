package swit;

public class Produto {

	private String Nproduto; // Nome do produto
	private String PVD; // Preço de venda
	private String PC; // Preço de custo
	private Fornecedor fornecedor;

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getNproduto() {
		return Nproduto;
	}

	public void setNproduto(String nproduto) {
		Nproduto = nproduto;
	}

	public String getPVD() {
		return PVD;
	}

	public void setPVD(String pVD) {
		PVD = pVD;
	}

	public String getPC() {
		return PC;
	}

	public void setPC(String pC) {
		PC = pC;
	}

}
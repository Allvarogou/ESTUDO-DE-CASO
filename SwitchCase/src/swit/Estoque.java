package classes;

public class Estoque {
	private String Cat; // Categoria
	private String ID; // ID
	private String CodBarra; // Codigo de barra
	private Integer Estoque; // Quantidade em estoque

	public String getCat() {
		return Cat;
	}

	public void setCat(String cat) {
		Cat = cat;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getCodBarra() {
		return CodBarra;
	}

	public void setCodBarra(String codBarra) {
		CodBarra = codBarra;
	}

	public Integer getEstoque() {
		return Estoque;
	}

	public void setEstoque(Integer estoque) {
		Estoque = estoque;
	}

}

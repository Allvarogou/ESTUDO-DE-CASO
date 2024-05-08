package swit;

import java.util.ArrayList;

public class Fornecedor {

	private String nome;
	private int id;
	private String marca; 
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public static void main(String[] args) {
		
		ArrayList<Fornecedor> forn = new ArrayList<>();
		
		Fornecedor f1 = new Fornecedor();
		f1.setNome("F1 LTA");
		f1.setId(001);
		f1.setMarca("OUS");
		
		forn.add(f1);
		
		
		
	}

}

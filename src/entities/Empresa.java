package entities;

public class Empresa extends Endereco {
	private String nome;
	protected String id;
	private Endereco endereco;

	public Empresa() {
		super();
	}
	

	public Empresa(String id) {
		this.id = id;
	}


	public Empresa(String nome, String id, String cidade, String bairro, String rua, int numero) {
		super(cidade, bairro, rua, numero);
		this.nome = nome;
		this.id = id;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	
	public String toString() {
		return "Empresa [nome=" + nome + ", id=" + id + ", endereco=" + endereco + "]";
	}

	

	

}

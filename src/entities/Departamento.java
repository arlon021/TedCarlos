package entities;

public class Departamento extends Empresa {

	private String codigo;
	private String nome;
	private String empresaId = id;


	public Departamento() {
		super();
	}

	public Departamento(String codigo, String nome, String id) {
		super(id);
		this.codigo = codigo;
		this.nome = nome;

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Departamento [codigo=" + codigo + ", nome=" + nome + ", empresa=" + empresaId + "]";
	}

}

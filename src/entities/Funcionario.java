package entities;

public class Funcionario extends Endereco {

	private String id;
	private String nome;
	private Double salario;
	private String cidade = getCidade();
	private String bairro = getBairro();
	private String rua = getRua();
	private Integer numero = getNumero();
	private Departamento departamento;

	public Funcionario() {
		super();
	}

	public Funcionario(String id, String nome, Double salario, String cidade, String bairro, String rua, int numero) {
		super(cidade, bairro, rua, numero);
		this.id = id;
		this.nome = nome;
		this.salario = salario;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", salario=" + salario + ", cidade=" + cidade + ", bairro="
				+ bairro + ", rua=" + rua + ", numero=" + numero + "]";
	}

	
	

	

}

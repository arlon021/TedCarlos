package entities;

public class Endereco {
	private String id;
	private String cidade;
	private String bairro;
	private String rua;
	private Integer numero;

	public Endereco() {

	}

	public Endereco(String cidade, String bairro, String rua, int numero) {
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String toString() {
		return "Endereco [id=" + id + ", cidade=" + cidade + ", bairro=" + bairro + ", rua=" + rua + ", numero="
				+ numero + "]";
	}
}

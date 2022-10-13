package Classes;

public class Candidato {

	private String nome;
	private String partido;
	private String sigla;
	private Integer numero;
	
	
	public Candidato() {
		
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getPartido() {
		return partido;
	}


	public void setPartido(String partido) {
		this.partido = partido;
	}


	public String getSigla() {
		return sigla;
	}


	public void setSigla(String sigla) {
		this.sigla = sigla;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	
	public Candidato(String nome, String sigla,  String partido, Integer numero) {	
		this.nome = nome;
		this.sigla = sigla;
		this.partido = partido;
		this.numero = numero;
		
	}

	@Override
	public String toString() {
		return "Candidato [nome=" + nome + ", partido=" + partido + ", sigla=" + sigla + ", numero=" + numero + "]";
	}
	
		
}

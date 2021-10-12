package ProjetoJava;

public class Cadastro {
	
	private String primeiroNome;
	private String segundoNome;
	private String ultimoNome;
	private String regiao;
	private int telefone;
	
	public Cadastro (String primeiroNome, String segundoNome, String ultimoNome, String regiao, int telefone)
	{
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		this.ultimoNome = ultimoNome;
		this.regiao = regiao;
		this.telefone = telefone;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	

}

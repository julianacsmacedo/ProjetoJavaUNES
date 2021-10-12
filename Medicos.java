package ProjetoJava;

public class Medicos extends Cadastro{
	
	private String crm;
	private int especialidade;
	
	public Medicos (String primeiroNome, String segundoNome, String ultimoNome, int regiao, int telefone, String crm, 
			int especialidade)
	{
		super (primeiroNome, segundoNome, ultimoNome, regiao, telefone);
		this.crm = crm;
		this.especialidade = especialidade;
	}
	
	public void listaMedicos() //Lista pré-determinada
	{
		if(especialidade == 1 &&  getRegiao() == 1)
		{
			System.out.println("Dr. André Mendes \nClínico Geral \nCentro \nContato: 4658-3922 \nCRM: 773946483");
		}
		if(especialidade == 1 && getRegiao() == 2)
		{
			System.out.println("Dr. Silvana Bezerra \nGinecologista \nCentro \nContato: 4658-3922 \nCRM: 773946483");
		}
	}

	
	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public int getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(int especialidade) {
		this.especialidade = especialidade;
	}
	

}

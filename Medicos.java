package ProjetoJava;

//import java.util.ArrayList;
//import java.util.List;

public class Medicos extends Cadastro{
	
	private String crm;
	private int especialidade;
			
	public Medicos (String nome, String sobrenome, int regiao, int especialidade, String crm, 
			String telefone)
	{
		super (nome, sobrenome, regiao, telefone);
		this.crm = crm;
		this.especialidade = especialidade;
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
	
	public void listaMedicos() //Lista pré-determinada
	{
		if(especialidade == 1 &&  getRegiao() == 1)
		{
			System.out.println("\nDr. André Mendes \nClínico Geral \nCentro \nContato: 4658-3922 \nCRM: 773946/SP");
			System.out.println("\n********************");
			System.out.println("\nDr. Alex Freire de Carvalho \nClínico Geral \nCentro \nContato: 3423-3223 \nCRM: 233443/SP");
			System.out.println("\n********************");
			System.out.println("\nDr. Diego Garcia \nClínico Geral \nCentro \nContato: 3234-4343 \nCRM: 345675/SP");
		}
		else if(especialidade == 1 && getRegiao() == 2)
		{
			System.out.println("\nDra. Silvana Bezerra \nClínico Geral \nZona Norte \nContato: 4658-3922 \nCRM: 773432/SP");
			System.out.println("\n********************");
			System.out.println("\nDr. Tulio Garcia \nClínico Geral \nZona Norte \nContato: 4323-4323 \nCRM: 323234/SP");
		}
		else if(especialidade == 1 && getRegiao() == 3)
		{
			System.out.println("\nDra. Tais Matos \nClínico Geral \nZona Sul \nContato: 9999-3922 \nCRM: 982946/SP");
			System.out.println("\n********************");
			System.out.println("\nDr. Gregori Matos \nClínico Geral \nZona Sul \nContato: 4323-3232 \nCRM: 43233/SP");
		}
		else if(especialidade == 1 && getRegiao() == 4)
		{
			System.out.println("\nDr. Luis Guerreiro \nClínico Geral \nZona Leste \nContato: 9999-3922 \nCRM: 82928/SP");
			System.out.println("\n********************");
			System.out.println("\nDr. Paulo Cesar Silva \nClínico Geral \nZona Leste \nContato: 9465-3232 \nCRM: 34453/SP");
			System.out.println("\n********************");
			System.out.println("\nDr. Lucas Bernardino \nClínico Geral \nZona Leste \nContato: 5676-5452 \nCRM: 43453/SP");
		}
		else if(especialidade == 1 && getRegiao() == 5)
		{
			System.out.println("\nDr. Luis Guerreiro \nClínico Geral \nZona Oeste \nContato: 9999-3922 \nCRM: 82928/SP");
			System.out.println("\n********************");
			System.out.println("\nDr. Vitor Siqueira \nClínico Geral \nZona Oeste \nContato: 5432-8766 \nCRM: 43532/SP");
			System.out.println("\n********************");
			System.out.println("\nDr. Pedro versoni \nClínico Geral \nZona Oeste \nContato: 3234-6676 \nCRM: 54323/SP");
		}
		else if(especialidade == 1 && getRegiao() == 6)
		{
			System.out.println("\nDr. Luis Guerreiro \nClínico Geral \nRegião Metropolitana \nContato: 9999-3922 \nCRM: 82928/SP");
			System.out.println("\n********************");
			System.out.println("\nDra. Virgina Fonseca \nRegião Metropolitana \nContato: 8453-7654 \nCRM: 46783/SP");
		}
		else if(especialidade == 2 && getRegiao() == 1)
		{
			System.out.println("\nDr. Lucas Felipe Romano \nGinecologista \nCentro \nContato: 4002-8922 \nCRM: 32456/SP");
			System.out.println("\n********************");
			System.out.println("\nDr. Pedro Sales de Almeida \nGinecologista \nCentro \nContato: 3455-7654 \nCRM: 32456/SP");
		}
		else if(especialidade == 2 && getRegiao() == 2)
		{
		    System.out.println("\nDr. Luiz Carlos Dorgan \nGinecologista \nZona Norte \nContato: 9433-4456 \nCRM: 52314/SP");
		    System.out.println("\n********************");
		    System.out.println("\nDra. Clarice Morgan \nGinecologista \nZona Norte \nContato: 4345-7654 \nCRM: 43566/SP");
		}
		else if(especialidade == 2 && getRegiao() == 3)
		{
			System.out.println("\nDra. Julia Barbi Melim \nGinecologista \nZona Sul \nContato: 8765-4254 \nCRM: 57689/SP");
			System.out.println("\n********************");
			System.out.println("\nDr. Pedro Alvarez \nGinecologista \nZona Sul \nContato: 3432-4354 \nCRM: 43567/SP");
		}
		else if(especialidade == 2 && getRegiao() == 4)
		{
			System.out.println("\nDra. Mara Diegoli \nGinecologista \nZona Leste \nContato: 4567-3234 \nCRM: 23456/SP");
			System.out.println("\n********************");
			System.out.println("\nDra. Carla Sabrina \nGinecologista \nZona Leste \nContato: 5437-3544 \nCRM: 27565/SP");
			System.out.println("\n********************");
			System.out.println("\nDra. Pedro Almeida \nGinecologista \nZona Leste \nContato: 4565-4334 \nCRM: 64565/SP");
		}
		else if(especialidade == 2 && getRegiao() == 5)
		{
			System.out.println("Dr. Marcio Kazuo Okada \nGinecologista \nZona Oeste \nContato: 5321-3652 \nCRM: 43565/SP");
			System.out.println("\n********************");
			System.out.println("Dr. Miguel Shimada \nGinecologista \nZona Oeste \nContato: 4343-3233 \nCRM: 454343/SP");
		}
		else if(especialidade == 2 && getRegiao() == 6)
		{
			System.out.println("\nDr. Rogerio Moreno \nGinecologista \nRegião Metropolitana \nContato: 4323-3546 \nCRM: 43455/SP");
			System.out.println("\n********************");
			System.out.println("\nDra. Melissa Hissami \nGinecologista \nRegião Metropolitana \nContato: 4565-3232 \nCRM: 43245/SP");
			System.out.println("\n********************");
			System.out.println("Dr. Matheus Nini \nGinecologista \nRegião Metropolitana \nContato: 4453-3446 \nCRM: 34555/SP");
		}
		if(especialidade == 3 &&  getRegiao() == 1)
        {
            System.out.println("\nDr. Paulo Ebert Esteves \nUrologista \nCentro \nContato: 3875-4344 \nCRM: 43436/SP");
            System.out.println("\n********************");
            System.out.println("\nDr. Endric Hassegawa \nUrologista \nCentro \nContato: 4758-8392 \nCRM: 43436/SP");
        }
        else if(especialidade == 3 && getRegiao() == 2)
        {
            System.out.println("\nDr. Paulo Maron \nUrologista \nZona Norte \nContato: 3243-4323 \nCRM: 35564/SP");
            System.out.println("\n********************");
            System.out.println("\nDr. Antonio Cardoso Pinto \nUrologista \nZona Norte \nContato: 7283-9732 \nCRM: 35464/SP");
            System.out.println("\n********************");
            System.out.println("\nDr. Wagner Rondolfo \nUrologista \nZona Norte \nContato: 34657-9923 \nCRM: 43567/SP");
        }
        else if(especialidade == 3 && getRegiao() == 3)
        {
            System.out.println("\nDr. Marcelo Linhares \nUrologista \nZona Sul \nContato: 2345-3245 \nCRM: 97654/SP");
            System.out.println("\n********************");
            System.out.println("\nDr. Pedro Cardoso \nUrologista \nZona Sul \nContato: 5362-8373 \nCRM: 839264/BA");
            System.out.println("\n********************");
            System.out.println("\nDr. Maria Abadia \nUrologista \nZona Sul \nContato: 5555-7282 \nCRM: 92645/SP");
        }
        else if(especialidade == 3 && getRegiao() == 4)
        {
            System.out.println("\nDr. Fábio José Nascimento \nUrologista \nZona Leste \nContato: 4323-7676 \nCRM: 67543/SP");
            System.out.println("\n********************");
            System.out.println("\nDr. Caetano Barroso Martins \nUrologista \nZona Leste \nContato: 5274-8883 \nCRM: 82740/MT");
        }
        else if(especialidade == 3 && getRegiao() == 5)
        {
            System.out.println("\nDr. João Arthur Brunhara \nUrologista \nZona Oeste \nContato: 3443-5434 \nCRM: 65432/SP");
            System.out.println("\n********************");
            System.out.println("\nDr. Augustinho Carrara \nUrologista \nZona Oeste \nContato: 2873-6292 \nCRM: 87924/SP");
            System.out.println("\n********************");
            System.out.println("\nDr. Arthur Albuquerque \nUrologista \nZona Oeste \nContato: 2444-9183 \nCRM: 92073/SP");
        }
        else if(especialidade == 3 && getRegiao() == 6)
        {
            System.out.println("\nDr. Anis Taha \nUrologista \nRegião Metropolitana \nContato: 4343-4832 \nCRM: 98755/SP");
            System.out.println("\n********************");
            System.out.println("\nDr. Joel Carvalho  \nUrologista \nRegião Metropolitana \nContato: 4728-2982 \nCRM: 82983/SP");
            System.out.println("\n********************");
            System.out.println("\nDr. Flavia Barbosa Ferreira \nUrologista \nRegião Metropolitana \nContato: 5768-2093 \nCRM: 82837/SP");
        }
		else if(especialidade == 4 &&  getRegiao() == 1)
        {
            System.out.println("\nDr. Pablo Cartaxo \nCardiologista \nCentro \nContato: 3786-3829 \nCRM: 82946/SP");
            System.out.println("\n********************");
            System.out.println("\nDr. Alavro paiva Oliveira \nCardiologista \nCentro \nContato: 8293-9372 \nCRM: 829274/SP");
            System.out.println("\n********************");
            System.out.println("\nDra. Caroline E. Nagano \nCardiologista \nCentro \nContato: 7292-7362 \nCRM: 910222/SP");
        }
        else if(especialidade == 4 && getRegiao() == 2)
        {
            System.out.println("\nDra. Marina Bond \nCardiologista \nZona Norte \nContato: 4786-9888 \nCRM: 827344/SP");
        }
        else if(especialidade == 4 && getRegiao() == 3)
        {
            System.out.println("\nDra. Olivia Palito \nCardiologista \nZona Sul \nContato: 9999-3922 \nCRM: 982946/SP");
            System.out.println("\n********************");
            System.out.println("\nDra. Margareth Silva \nCardiologista \nZona Sul \nContato: 5678-2932 \nCRM: 927372/SP");
        }
        else if(especialidade == 4 && getRegiao() == 4)
        {
            System.out.println("\nDr. Luis Santos \nCardiologista \nZona Leste \nContato: 4187-7392 \nCRM: 323232/SP");
            System.out.println("\n********************");
            System.out.println("\nDr. Malton Cavalier \nCardiologista \nZona Leste \nContato: 4566-0021 \nCRM: 820273/MG");
            System.out.println("\n********************");
            System.out.println("\nDr. Diogo Noronha \nCardiologista \nZona Leste \nContato: 2923-2582 \nCRM: 98238/SP");
        }
        else if(especialidade == 4 && getRegiao() == 5)
        {
            System.out.println("\nDra. Marina Bond \nCardiologista \nZona Oeste \nContato: 6473-8372 \nCRM: 920743/SP");
            System.out.println("\n********************");
            System.out.println("\nDr. Henry Abensur \nCardiologista \nZona Oeste \nContato: 9999-3922 \nCRM: 929823/PA");
        }
        else if(especialidade == 4 && getRegiao() == 6)
        {
            System.out.println("\nDra. Luiza Andrade \nCardiologista \nRegião Metropolitana \nContato: 7292-9273 \nCRM: 82832/SP");
        }
	}
	
	public void switchRegiao(int op)
	{
		switch(op)
		{
		case 1:
			info();
			listaMedicos();
			break;
		case 2:
			info();
			listaMedicos();
			break;
		case 3:
			info();
			listaMedicos();
			break;
		case 4:
			info();
			listaMedicos();
			break;
		case 5:
			info();
			listaMedicos();
			break;
		case 6:
			info();
			listaMedicos();
			break;
		default:
			System.out.println("Escolha uma opção válida!!!");
		}
	}
}
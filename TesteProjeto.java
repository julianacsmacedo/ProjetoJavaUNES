package ProjetoJava;

import java.util.Scanner;

public class TesteProjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente pac = new Paciente(null, null, 0, null, null, null, null);
		Medicos med = new Medicos(null, null, 0, 0, null, null);
				
		String nome,sobrenome,cpf,dataNascimento,telefone,gmail, crm;
		int op, ep, escolha;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\t##     ## ##    ## ########  ######\r\n"
				+ "\t##     ## ###   ## ##       ##    ##\r\n"
				+ "\t##     ## ####  ## ##       ##\r\n"
				+ "\t##     ## ## ## ## ######    ######\r\n"
				+ "\t##     ## ##  #### ##             ##\r\n"
				+ "\tdis##     ## ##   ### ##       ##    ##\r\n"
				+ "\t #######  ##    ## ########  ######\r\n");
		
		System.out.println("***********************************************************************");
		System.out.println("*                      SEJA BEM VINDE!!                               *");
		System.out.println("***********************************************************************");
		System.out.println("\n----------------- ENTRE COM SEUS DADOS PARA CADASTRO -----------------");
		
		System.out.println("\nSelecione a opção em que se aplica: ");
		System.out.println("\n1- Paciente \n2- Médico");
		escolha = leia.nextInt();
		
		if(escolha == 1)
		{
			//Entrada de dados
			System.out.println("\nDigite seu nome social: ");
			nome = leia.next();
			pac.setNome(nome);
			System.out.println("Digite seu sobrenome: ");
			sobrenome = leia.next();
			pac.setSobrenome(sobrenome);
			System.out.println("Informe seu CPF: ");
			cpf = leia.next();
			while(cpf.length()!= 11) //Ajustando cpf
			{
				System.out.println("CPF Inválido!! \nPor favor digite novamente: ");
				cpf = leia.next();
				pac.setCpf(cpf.substring(0,3)+"."+cpf.substring(3,6)+"."+cpf.substring(6,9)+"-"+cpf.substring(9,11));
			}
			pac.setCpf(cpf.substring(0,3)+"."+cpf.substring(3,6)+"."+cpf.substring(6,9)+"-"+cpf.substring(9,11));
			System.out.println("Informe a Data de Nascimento (dd/mm/aa): ");
			dataNascimento= leia.next();
			pac.setDataNascimento(dataNascimento);
			System.out.println("Digite seu Telefone: ");
			telefone = leia.next();
			pac.setTelefone(telefone);
			System.out.println("Digite seu email para contato: ");
			gmail = leia.next();
			pac.setGmail(gmail);

			System.out.println("\n****** Cadastro Finalizado! ******\n"
					+ "\nNome: "+pac.getNome()+" "+pac.getSobrenome()
					+ "\nCPF cadastrado: "+pac.getCpf()
					+ "\nData de Nascimento: "+pac.getDataNascimento()
					+ "\nTelefone: "+pac.getTelefone()+
					"\nEmail de Cadastro: "+pac.getGmail());
			
			System.out.println("\n============================================================");
			System.out.println("\n   SEJA BEM VINDE À UNES (Unidade Especializada à Saúde)!"
					+ " \n\n  Aqui você pode encontrar consultas com médicos especialistas"
					+ "\ne que prezam,principalmente, pelo atendimento humanizado.");
			System.out.println("\n============================================================");		
			
			
			do 
			{	//Escolha de especilidade
				System.out.println("\n====        MENU DE ESPECIALIDADES        ====");
				pac.menuEspecialidade();
				System.out.println("\nEscolha a especialidade que deseja consultar: ");
				ep = leia.nextInt();
				med.setEspecialidade(ep);
				
				while (ep <1 || ep> 4)
				{
					System.err.println("\nOPÇÃO INVÁLIDA!!");
					System.out.println("Por favor, escolha uma opção válida!");
					System.out.println("\n====        MENU DE ESPECIALIDADES        ====");
					pac.menuEspecialidade();
					System.out.println("\nEscolha a especialidade que deseja consultar: ");
					ep = leia.nextInt();
					med.setEspecialidade(ep);
				}
				
					switch(ep)
					{
					//Escolha de Região
					case 1:
						med.menuRegiao();
						op = leia.nextInt();
						med.setRegiao(op);
						med.switchRegiao(op);
						break;
					case 2:
						med.menuRegiao();
						op = leia.nextInt();
						med.setRegiao(op);
						med.switchRegiao(op);
						break;
					case 3:
						med.menuRegiao();
						op = leia.nextInt();
						med.setRegiao(op);
						med.switchRegiao(op);
						break;
					case 4:
						med.menuRegiao();
						op = leia.nextInt();
						med.setRegiao(op);
						med.switchRegiao(op);
						break;
					}
					//Retorno ao MENU
					System.out.println("\n\nDeseja consultar novamente? ");
					System.out.println("1-SIM \t0-NÃO");
					ep = leia.nextInt();
				
			}while(ep!=0);
		}
		else 
		{
			//Entrada de dados
			System.out.println("\n\nDigite seu nome: ");
			nome = leia.next();
			med.setNome(nome);
			System.out.println("\nDigite seu sobrenome: ");
			sobrenome = leia.next();
			med.setSobrenome(sobrenome);
					
			System.out.println("\n=====================================================================");
			System.out.println("\n\tOlá, " + nome + " " + sobrenome + "!!!");
			
			//Inicio Cadastro do Médico
			System.out.println("\nIniciando Cadastro no Sistema...\n");
			System.out.println("\nInsira seu CRM: ");
			crm = leia.next();
			med.setCrm(crm);
			System.out.println("\n====        ESPECIALIDADES      ====");
			med.menuEspecialidade();
			System.out.println("\nSelecione a especialidade em que trabalha: ");
			ep = leia.nextInt();
			med.setEspecialidade(ep);
			med.menuRegiao();
			System.out.println("\nSelecione a região em que trabalha: ");
			op = leia.nextInt();
			med.setEspecialidade(op);
			System.out.println("\n--- CADASTRO REALIZADO COM SUCESSO! ---\n\n\n");

		}
		
		
		
		System.out.println("***********************************************************************");
		System.out.println("*                          OBRIGADE!!                                 *");
		System.out.println("***********************************************************************");

	}

}

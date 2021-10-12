package ProjetoJava;

import java.util.Scanner;

public class TesteProjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente pac = new Paciente(" ", " ", " ", 0, 0, " ", 000);
		Medicos med = new Medicos(" ", " ", " ", 0, 0, " ", 0);
				
		String n1,n2,n3;
		int op, ep;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("=======================================================================");
		System.out.println("=                       SEJA BEM VINDE!!                              =");
		System.out.println("=  Entre com seus dados e verifique o melhor local para ser atendide  =");
		System.out.println("=======================================================================");
		 
		//Entrada de dados
		System.out.println("\n\nDigite seu primeiro nome: ");
		n1 = leia.next();
		pac.setPrimeiroNome(n1);
		System.out.println("\nDigite seu segundo nome: ");
		n2 = leia.next();
		pac.setPrimeiroNome(n2);
		System.out.println("\nDigite seu último nome: ");
		n3 = leia.next();
		pac.setPrimeiroNome(n3);
		
		System.out.println("\n=====================================================================");
		System.out.println("\n\tOlá, " + n1 + " " + n2 + " " + n3 + "!!!");
		
		//Escolha de especilidade
		System.out.println("\n====        MENU DE ESPECIALIDADES        ====");
		System.out.println("\nEscolha a especialidade que deseja consultar: ");
		System.out.println("\n1- Clínico Geral");
		System.out.println("\n2- Ginecologista");
		System.out.println("\n3- Urologista");
		System.out.println("\n4- Cardiologista");
		ep = leia.nextInt();
		med.setEspecialidade(ep);
		
		switch(ep)
		{
		case 1:
			System.out.println("\n====        MENU DE REGIÕES       ====");
			System.out.println("\nEscolha a região onde mora: ");
			System.out.println("\n1- Centro");
			System.out.println("\n2- Zona Norte");
			System.out.println("\n3- Zona Sul");
			System.out.println("\n4- Zona Leste");
			System.out.println("\n5- Zona Oeste");
			System.out.println("\n6- Região Metropolitana");
			op = leia.nextInt();
			med.setRegiao(op);
			switch(op)
			{
			case 1:
				System.out.println("\n\n====    Médicos Disponíveis     ====");
				med.listaMedicos();
			case 2:
				System.out.println("\n\n====    Médicos Disponíveis     ====");
				med.listaMedicos();
			}
		case 2:
		}

	}

}

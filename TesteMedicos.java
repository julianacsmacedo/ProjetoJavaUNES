package ProjetoJava;

import java.util.Scanner;

public class TesteMedicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Medicos med = new Medicos(null, null, 0, 0, null, null);
				
		String n1, n2, crm, tel;
		int op, ep;
		
		Scanner leia = new Scanner(System.in);
			
		System.out.println("=======================================================================");
		System.out.println("=                       SEJA BEM VINDE!!                              =");
		System.out.println("=======================================================================");
		 
		//Entrada de dados
		System.out.println("\n\nDigite seu nome: ");
		n1 = leia.next();
		med.setNome(n1);
		System.out.println("\nDigite seu sobrenome: ");
		n2 = leia.next();
		med.setSobrenome(n2);
				
		System.out.println("\n=====================================================================");
		System.out.println("\n\tOlá, " + n1 + " " + n2 + "!!!");
		
		//Inicio Cadastro do Médico
		System.out.println("\nIniciando Cadastro no Sistema...\n");
		System.out.println("\nInsira telefone de contato: ");
		tel = leia.next();
		med.setTelefone(tel);
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

  	}

}

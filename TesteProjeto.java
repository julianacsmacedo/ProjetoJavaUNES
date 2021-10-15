package ProjetoJava;

import java.util.Scanner;

public class TesteProjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente pac = new Paciente(null, null, 0, null, null, 0);
		Medicos med = new Medicos(null, null, 0, 0, null, null);
		
		//ArrayList<List> listamed= new ArrayList<List>();  
		//  listamed  = med.retornaCliente();   
		//   for(List list :listamed){  
		//        System.out.println("Cliente: "+listamed.getId() + " " + listamed.getNome() + " " + listamed.getCpf());  
		// }  
				
		String n1,n2;
		int op, ep;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("=======================================================================");
		System.out.println("=                       SEJA BEM VINDE!!                              =");
		System.out.println("=  Entre com seus dados e verifique o melhor local para ser atendide  =");
		System.out.println("=======================================================================");
		 
		//Entrada de dados
		System.out.println("\n\nDigite seu nome social: ");
		n1 = leia.next();
		pac.setNome(n1);
		System.out.println("\nDigite seu sobrenome: ");
		n2 = leia.next();
		pac.setNome(n2);
				
		System.out.println("\n=====================================================================");
		System.out.println("\n\tOlá, " + n1 + " " + n2 + "!!!");
		
		//Escolha de especilidade
		System.out.println("\n====        MENU DE ESPECIALIDADES        ====");
		pac.menuEspecialidade();
		System.out.println("\nEscolha a especialidade que deseja consultar: ");
		ep = leia.nextInt();
		med.setEspecialidade(ep);
		
		switch(ep)
		{
		case 1:
			med.menuRegiao();
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
			case 3:
				System.out.println("\n\n====    Médicos Disponíveis     ====");
				med.listaMedicos();
			case 4:
				System.out.println("\n\n====    Médicos Disponíveis     ====");
				med.listaMedicos();
			case 5:
				System.out.println("\n\n====    Médicos Disponíveis     ====");
				med.listaMedicos();
			case 6:
				System.out.println("\n\n====    Médicos Disponíveis     ====");
				med.listaMedicos();
			}
		case 2:
		}

	}

}

package Trabalho_mini;

import java.util.Scanner;

public class cinema_teste {
	public static void main (String args[]) 
	{
		
		Scanner Entrada = new Scanner(System.in);
		
		cinema cliente = new cinema();
		
		
		
		System.out.println("CINE GENERATION BRASIL");
		System.out.println("_______________________");
		cliente.setCliente();
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Por favor informar se o ingresso é meia entrada ou inteira");
		System.out.println("1 ----------- Meia entrada\n2 ----------- Inteira ");
		int num = Entrada.nextInt();
		switch(num) {
			
		case 1:
			System.out.println("1 - Reserva realizada com sucesso!");
		case 2:
			System.out.println("2 - Reserva realizada com sucesso!");
			
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("Selecionar os assentos disponíveis: ");
			System.out.println();
			System.out.println("1 - A1\t  2 - A2\t - 3 - A3\t ");
			
			int num1 = Entrada.nextInt();
			switch(num1) 
			{
			case 1:
				System.out.println("1 - Assento A1 reservado com sucesso" );
				break;
			case 2:
				System.out.println("2 - Assento A2 reservado com sucesso" );
				break;
			case 3:
				System.out.println("3 - Assento A3 reservado com sucesso" );
				default:
			}
			
			
			
		}
		
		
		
			
		
		/*System.out.println("Olá Seja bem vindo(a), Qual é o seu nome?");
		
		
		System.out.println("Meia Entrada Sim/Não?");
		 
		System.out.println("Qual filme deseja assistir? ");
		
		System.out.println("Horários disponíveis ");
		
		System.out.println("Assento ");
		*/
		

		

		cliente.estadoAtual();	
	}
	

}

//Scanner cliente1 = new Scanner(System.in);

//System.out.println("Olá Seja bem vindo(a), Qual é o seu nome?");
//	cliente1.nextLine();
	
//cliente1.
package Exercicio_Treino;

import java.util.Scanner;

public class Exercicio_3 {
	
	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, cont025 = 0, cont50=0, cont75=0, cont100=0;
		
		do
		{
			System.out.println("Por favor entre com um valor");
			num = ler.nextInt();
			if(num > 0 && num  <= 25) 
			
				cont025++;
			if(num > 25 && num <50) 
				
				cont50++;
			if(num > 50 && num <75) 
				
				cont75++;
			
			if(num > 75 && num <100) 
				
				cont100++;
				
		}
		while(num != -1);
		
		if(num == -1) 
		{
			System.out.println("Fim de execu��o");
		}
		System.out.println("A quantidade de n�meros digitados do 0 ao 25: "+cont025);
		System.out.println();
		System.out.println();
		System.out.println("A quantidade de n�meros digitados do 26 ao 50: "+cont50);
		System.out.println();
		System.out.println();		
		System.out.println("A quantidade de n�meros digitados do 51 ao 75: "+cont75);
		System.out.println();
		System.out.println();
		System.out.println("A quantidade de n�meros digitados do 76 ao 100: "+cont75);
		
	}

}

package Array;

import java.util.Scanner;

public class Exercicio_3 {
	public static void main (String args[])
	{
		int vetor[] = new int[6],somapar=0,quantimpar=0;
		Scanner ler = new Scanner(System.in);
		
		for(int x=0 ; x < 6; x++) 
		{
			System.out.println("Digite o valor ");
			vetor[x] = ler.nextInt();
			if(vetor[x]%2==0) 
			{
			 System.out.println("O valor par: "+vetor[x]);
			 somapar = somapar+vetor[x];
			}
			else 
			{
			 System.out.println("Valor impar: "+vetor[x]);
			 quantimpar++;
			}
				
		}
		System.out.println("Somatório de números pares: "+somapar);
		System.out.println("Somatório de números impares: "+quantimpar);
	}

}

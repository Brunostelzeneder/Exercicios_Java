package For_while;
// Crie um programa que leia um n�mero do teclado at� que encontre um
//n�mero igual a zero. No final, mostre a soma dos n�meros
//digitados.(DO...WHILE)
import java.util.Scanner;

public class Exercicio_3 {
	
	public static void main (String args[]) {
		
		Scanner ler = new Scanner (System.in);
		
		int x,sooma=0;
		
				
		do
		{
			System.out.println("Entre com um valor");
			x = ler.nextInt();
			if(x > 1) 
			sooma = sooma + x;
			
		 			
		}
				 
			while(x != 0);
		if(x==0)
		{
		System.out.println("Fim da linha de execu��o: ");
		}
		System.out.println("A soma total dos valores digitados � de: "+sooma);	
		
		

	}


}

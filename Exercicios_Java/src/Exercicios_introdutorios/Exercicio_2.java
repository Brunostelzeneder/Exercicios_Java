package Exercicios_introdutorios;
import java.util.Scanner;

public class Exercicio_2 {


	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int idade;
		
		System.out.printf("\n Digite aqui a sua idade ");
		idade = ler.nextInt();
		
		
			
		
	if (idade >= 10 && idade < 14)
	{
		System.out.printf("\n Voc� ainda est� na inf�ncia");
	}
		
		
			
		
	else if (idade >= 15 && idade < 17)
		{
			System.out.printf("\n Voc� est� na juventude");
		}
		
	else if (idade >= 18)
		{
			System.out.printf("\n Voc� est� na vida adulta");
		}
	
}
}

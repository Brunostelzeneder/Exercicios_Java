package Exercicios_introdutorios;
import java.util.Scanner;

public class Exercicio_3 {
	/* Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
			�mpar exiba o n�mero elevado ao quadrado .*/
			
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int numero,raizquadrada;
		System.out.println("Ol�, digite o primeiro valor");
		numero = ler.nextInt();
		
		if(numero%2==0)
		{
			System.out.println("\n O n�mero inserido � par. ");
			raizquadrada = (int) Math.pow(numero, 2);
			System.out.println("\n O n�mero elevado ao quadrado �: "+raizquadrada);
			
		}
		else
		{
			System.out.println("\n O n�mreo � impar.");
			raizquadrada = (int) Math.sqrt(numero);
			System.out.println("\n A raiz quadrada � de: "+raizquadrada);
			
		}
		
	}

}

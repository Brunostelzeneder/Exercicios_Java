package Exercicios_introdutorios;
import java.util.Scanner;

public class Exercicio_3 {
	/* Faça um programa em que permita a entrada de um número qualquer e exiba se este
	número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
			ímpar exiba o número elevado ao quadrado .*/
			
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int numero,raizquadrada;
		System.out.println("Olá, digite o primeiro valor");
		numero = ler.nextInt();
		
		if(numero%2==0)
		{
			System.out.println("\n O número inserido é par. ");
			raizquadrada = (int) Math.pow(numero, 2);
			System.out.println("\n O número elevado ao quadrado é: "+raizquadrada);
			
		}
		else
		{
			System.out.println("\n O númreo é impar.");
			raizquadrada = (int) Math.sqrt(numero);
			System.out.println("\n A raiz quadrada é de: "+raizquadrada);
			
		}
		
	}

}

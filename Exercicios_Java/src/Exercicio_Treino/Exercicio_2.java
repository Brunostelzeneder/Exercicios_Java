package Exercicio_Treino;

import java.util.Scanner;


public class Exercicio_2 {

	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		float peso, altura;
		float imc;
		
		
		System.out.println("Por favor, digite o seu peso: ");
		peso = ler.nextFloat();
		
		System.out.println("Por favor, digite a sua altura: ");
		altura = ler.nextFloat();
		
		imc = peso /(altura * altura);
		
		if(imc < 18.5) 
			{
			System.out.println("Você está na abaixo do peso:");	
			}
		else if(imc > 18.5 && imc < 25) 
			{
			System.out.println("Você está na medida ideal: ");	
			}
		else if(imc > 25 && imc < 30) 
			{
			System.out.println("Você está acima do peso: ");	
			}
		else if(imc > 30) 
		{
		System.out.println("Você está obeso com imc: ");		
		}
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("Obrigado por utilizar o software de medidas");
	}
}

package Array;

import java.util.Scanner;

public class Exercicio_2 {
/*
3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
*/
	public static void main(String[] args) {
		
		int linhas = 3;
		int colunas = 3;
		int matriz[][] = new int[linhas][colunas],cont10=0,contLinha10=0;git 

//GERAR MATRIZ AUTOMATICAMENTE
		for(int l=0;l<linhas;l++)
		{
			for(int c=0;c<colunas;c++)
			{
				matriz[l][c] = (int)(Math.random()*20);
			}
		}
		
//IMPRIMIR MATRIZ
		System.out.println("\n\tMATRIZ ("+linhas+" X "+colunas+"):\n");
		for(int l=0;l<linhas;l++)
		{
			for(int c=0;c<colunas;c++)
			{
				System.out.printf("\t %d",matriz[l][c]);
			}
			System.out.println("\n");
		}
		
		
		
		for(int l=0;l<linhas;l++)
		{
			int maiorlinha =0;
			for(int c=0;c<colunas;c++)
			{
				if(matriz[l][c]>10)
				{
					contLinha10++;
					maiorlinha++;
				}
			}
			
			System.out.println("Linha"+l+": "+maiorlinha);
		}
		
		
//VALORES MAIORES QUE 10
		
		/*System.out.println("\nValores maiores que 10 da matriz:\n");
		for(int l=0;l<linhas;l++)
		{
			for(int c=0;c<colunas;c++)
			{
				if(matriz[l][c]>10)
				{
					System.out.println("Posi��o ["+(l+1)+"]["+(c+1)+"]: "+matriz[l][c]);
					cont10++;
				}
			}
		}
		System.out.println("\nA quantidade de valores acima de 10 �: "+cont10);
		*/
		
	}
}

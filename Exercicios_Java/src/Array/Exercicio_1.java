package Array;

import java.util.Scanner;

public class Exercicio_1 {
	public static void main (String args[]) {
		Scanner x = new Scanner(System.in);
		
		int [] a = {1, 0, 5, -2, -5, 7};
		int soma;
		
		
								
			soma = a[0] + a[1] + a[5];
			
			System.out.println("As posi��es dos valores               0:["+a[0]+"]\t1:["+a[1]+"]\t2:["+a[2]+"]\t3:["+a[3]+"]\t4:["+a[4]+"]\t5:["+a[5]+"]\t6:["+a[5]+"]");
			
			a[4] = 100;
			
			
				
			
			
			System.out.println("As posi��es dos valores modificados   0:["+a[0]+"]\t1:["+a[1]+"]\t2:["+a[2]+"]\t3:["+a[3]+"]\t4:["+a[4]+"]\t5:["+a[5]+"]\t6:["+a[5]+"]");
			System.out.println("A soma das posi��es [A0] [A1] [A5]: "+soma);
			System.out.println("Valores atribuidos em cada linha \n0:["+a[0]+"]\n1:["+a[1]+"]\n2:["+a[2]+"]\n3:["+a[3]+"]\n4:["+a[4]+"]\n5:["+a[5]+"]\n6:["+a[5]+"]");

			}
			
			
	}



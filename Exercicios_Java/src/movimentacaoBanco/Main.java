package movimentacaoBanco;

import java.util.Scanner;

public class Main {
	
	public static void main (String args[]) 
	{
		
		Scanner ler = new Scanner(System.in);
		
		conta_banco p1 = new conta_banco();
		p1.setNumConta(1111);
		p1.setDono("Bruno");
		p1.abrirConta("CC");
		p1.depositar(100);
		p1.sacar(150);
		p1.fecharConta();
		
		System.out.println("___________________________");
		
		System.out.println(" MERCADO GENERATION PAGO  ");
		System.out.println("___________________________");
		p1.estadoAtual();
	
		
		
		conta_banco p2 = new conta_banco();
		p2.setNumConta(2323);
		p2.setDono("Roberto");
		p2.abrirConta("CP");
		p2.estadoAtual();
		
		
		System.out.println("Qual o valor a ser depositado?");
		
		 
		
		
		
	}
	

	
	
	

}

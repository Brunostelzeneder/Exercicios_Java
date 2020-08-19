package movimentacaoBanco;

public class aula05 {
	
	public static void main (String args[]) 
	{
		conta_banco p1 = new conta_banco();
		p1.setNumConta(1111);
		p1.setDono("Bruno");
		p1.abrirConta("CC");
		p1.depositar(250);
		p1.sacar(25);
		
		
		conta_banco p2 = new conta_banco();
		p2.setNumConta(2323);
		p2.setDono("Roberto");
		p2.abrirConta("CP");
		
		
		
		
		p1.estadoAtual();
		p2.estadoAtual();
	}
	

	
	
	

}

package movimentacaoBanco;

public class aula_01 {
	public static void main (String args[]) 
	{
	
		caneta_01 c1 = new caneta_01();
		c1.modelo = "BIC Cristal";
		c1.cor = "Azul";
		//c1.ponta = 0.5f; nao esta visivel pq esta no privado  
		c1.ponta = 0.5f;
		c1.carga = 80;
		c1.rabiscar();
		c1.tampar(); 
		c1.status();
		{
			
		}
		
	}
}


		
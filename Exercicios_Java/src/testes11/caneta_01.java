package testes11;

public class caneta_01 {
	
	public String modelo;
	public String cor;
	public float ponta;
	public int carga;
	private  boolean tampada;
	
	 	 
	 public void status() 
	 {
		 System.out.println("Modelo: " + this.modelo);
		 System.out.println("Ponta: " + this.ponta);
		 System.out.println("carga: " + this.carga);
		 System.out.println("Uma caneta "+ this.cor); 
		 System.out.println("Est� tampada?"+ this.tampada);
	 }
	 
	 public void rabiscar() 
	 {
		 if (this.tampada == true)
		 {
			 System.out.println("N�o posso riscar, pois a caneta est� tampada");
		 }
		 else 
		 {
			System.out.println("Pode rabiscar a caneta est� sem tampa"); 
		 }
	 }
	 protected void tampar() 
	 {
		 this.tampada = true;
	 }
	 protected void destampar() 
	 {
		 this.tampada = false;
	 }
	 
	 

}

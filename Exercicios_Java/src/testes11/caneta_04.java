package testes11;

public class caneta_04 {
	
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	public caneta_04(String m, float p, String c) {
		super();
		this.setModelo(m);
		this.setPonta (p);
		this.setCor(c);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void status() 
	{
		 System.out.println("Modelo: " + this.modelo);
		 System.out.println("Ponta: " + this.ponta);
		 System.out.println("Uma caneta "+ this.cor); 
		 System.out.println("Está tampada?"+ this.tampada);	
	}
	
	
	
}


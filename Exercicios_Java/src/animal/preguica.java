package animal;

public class preguica extends superanimal {
	
	private String subirArvore;

	@Override
	public void som() {
		System.out.println("Não quis fazer som, foi dormir");
		
	}
	
	public void arvore() {
		System.out.println();
		
	}

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	

}

package poo_1informacoes;

public class poo_1informacoes {
	//Clase
	
	private String primeiroNome;
	private String nomedoMeio;
	private String ultimoNome;
	
	public poo_1informacoes (String primeiro, String meio, String ultimo) 
	
	{
		// Atributo
		primeiroNome=primeiro;
		ultimoNome=ultimo;
		nomedoMeio=meio;
				
	}
	// Método
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+""+nomedoMeio+""+ultimoNome;
		return nomeCompleto;
	}

}

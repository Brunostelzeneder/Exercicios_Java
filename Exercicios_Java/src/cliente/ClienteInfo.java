package cliente;

public class ClienteInfo {
	
	// Classes criadas
	private String nome;
	private String sobrenome;
	private String nomemae;
	private String sobrenomemae;
	private int idadecliente;
	
	//atributos
	
	public ClienteInfo (String nomecliente, String sobrenomecliente, String nomedamae, String sobrenomedamae, int idadedocliente) 
	
	{
		nome = nomecliente;
		sobrenome = sobrenomecliente;
		nomemae = nomedamae;
		sobrenomemae = sobrenomedamae;
		idadecliente = idadedocliente;
		
	}
	// Método 1 para o nome completo do Cliente
	
	public String getnomecompleto() 
	{
	String nomecompleto = nome+sobrenome;
	return nomecompleto;
	}
	// Método 1 para o nome completo do Cliente
	public String getnomecompletomae() 
	{
	String nomecompletomae = nomemae+sobrenomemae;
	return nomecompletomae;
	}
	public int getage() 
	{
	int age = idadecliente;
	return age;
	

}
}

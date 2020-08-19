package Polimorfismo;

public class TestePolimorfismo {
	public static void main (String args[]) 
	{
	 pessoaFisica fisica = new pessoaFisica();
	 fisica.setNome("Juliana");
	 fisica.setCpf(22548751398l);
	 
	 pessoaJuridica  juridica = new pessoaJuridica();
	 juridica.setNome("Cristiano");
	 juridica.setCnpj(1000011000065548798l);
	 
	 Pessoa1[] pessoas = new Pessoa1[2];
	 pessoas[0] = fisica;
	 pessoas[1] = juridica;
	 
	 for(Pessoa1 pessoa:pessoas)
	 {
		 System.out.println(pessoa.getNome());
	 }
	 

	 
	}

}

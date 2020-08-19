package Polimorfismo;

public class pessoaFisica extends Pessoa1 {
	
	private long cpf;

	public pessoaFisica()
	{
		
	}
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() 
	{
		return "Pessoa física " +super.getNome()+" - CPF:"+this.getCpf();
	}

}

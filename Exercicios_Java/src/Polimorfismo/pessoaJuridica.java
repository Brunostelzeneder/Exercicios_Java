package Polimorfismo;

public class pessoaJuridica extends Pessoa1 {
	private long cnpj;

	public pessoaJuridica()
	{
		
	}
	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public String getnome()
	{
		return "Pessoa jurídica " +super.getNome()+" - CNPJ:"+this.getCnpj();
	}
	
	

}

package funcionario;

public class funcionario_infos {
	
	private String nomefuncionario;
	private String matricula;
	private String departamento;
	private String salario;
	private String dataadm;
	
	public funcionario_infos (String nfuncionario, String nmatricula, String ndepartament, String nsalario, String ndataadm) 
	{
		this.nomefuncionario = nfuncionario;
		this.matricula = nmatricula;
		this.departamento = ndepartament;
		this.salario = nsalario;
		this.dataadm = ndataadm;
		
		
	}
	public String getNome()
	{
		String Nome = nomefuncionario;
		return Nome;
	}
	public String getNumeromatricula()
	{
		String Numeromatricul = matricula;
		return Numeromatricul;
	}
	public String getqualdepartamento()
	{
		String qualdepartamento = departamento;
		return qualdepartamento;
		
	}
	public String getqualsalario()
	{
		String qualsalario = salario;
		return qualsalario;
		
	}
	public String getqualdataadm()
	{
		String ualdataadm = dataadm;
		return ualdataadm;
		
	}

}

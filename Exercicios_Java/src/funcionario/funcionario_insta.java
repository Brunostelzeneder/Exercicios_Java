package funcionario;

public class funcionario_insta {
	public static void main (String args[]) 
	{
		
		System.out.println("Nome do funcion�rio: ");
		funcionario_infos nome1 = new funcionario_infos("Bruno");
		System.out.println(nome1.getNome());
		
		System.out.println("N�mero da matricula: ");
		funcionario_infos matricula1 = new funcionario_infos("122548");
		System.out.println(matricula1.getNumeromatricula());
		
		System.out.println("Departamento: ");
		funcionario_infos departamento1 = new funcionario_infos("Recursos Humanos");
		System.out.println(matricula1.getqualdepartamento());
		
		System.out.println("Sal�rio l�quido");
		funcionario_infos salario1 = new funcionario_infos("1500");
		System.out.println(salario1.getqualsalario());
		
		System.out.println("Data de admiss�o");
		funcionario_infos admi1 = new funcionario_infos("14.10.2015");
		System.out.println(admi1.getqualdataadm());
	}

}

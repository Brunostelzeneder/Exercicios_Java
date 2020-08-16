package cliente;

public class Cliente_instancias {
	public static void main (String args[])
	{
		ClienteInfo nome = new ClienteInfo("Bruno ","Stelzeneder");
		System.out.println(nome.getnomecompleto());
	
	
		ClienteInfo nomemae = new ClienteInfo("Carla ","Stelzeneder");
		System.out.println(nomemae.getnomecompletomae());
	
	
	
		ClienteInfo idade = new ClienteInfo(28);
		System.out.println(idade.getage());
	}

}

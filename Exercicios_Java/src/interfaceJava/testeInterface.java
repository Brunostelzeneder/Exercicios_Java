package interfaceJava;

public class testeInterface {
	public static void main (String args[]) 
	{
		participanteForum participante = new participanteForum();
		leitor leitor = participante;
		System.out.println("O participante está lendo: " + leitor.lendo());
		Programador programador = participante;
		String java = "Java";
		programador.pensando(java.toCharArray());
		System.out.println("E progamando: " + programador.digitando());
		
	}
}

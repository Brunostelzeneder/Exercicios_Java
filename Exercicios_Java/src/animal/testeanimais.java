package animal;

public class testeanimais {
	
	public static void main (String args[]) 
	{
		cachorro c = new cachorro();
		cavalo cc = new cavalo();
		preguica p = new preguica();
		
		
		System.out.println("Alá o cachorro ");
		c.som();
		System.out.println();
		System.out.println();
		System.out.println("Cavalo");
		cc.som();
		System.out.println();
		System.out.println();
		System.out.println("E a preguiça? ");
		p.som();
		
	}

}

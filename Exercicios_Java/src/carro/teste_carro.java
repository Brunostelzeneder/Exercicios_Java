package carro;

public class teste_carro {
	public static void main (String args[]) 
	{
	
		carro meuCarro = new carro();
		
		meuCarro.cor = "Vermelho";
		meuCarro.modelo = "Passat";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeAtual = 80;
		
		meuCarro.liga();
		
		meuCarro.acelera(20);
		
		System.out.println("Meu passat�o est� correndo a "+meuCarro.velocidadeAtual+" Quilometros por hora");
		System.out.println(meuCarro.cor);
		System.out.println(meuCarro.modelo);
		
		meuCarro.pegaMarcha();
		
		
		
	}

}

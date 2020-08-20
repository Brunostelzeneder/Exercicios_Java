package MóduloI;

import java.util.Scanner;

public class conta_banco {
	private static final String Else = null;



	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		boolean conta,cc, cp;
		int tipo;
		String nome;
		
		System.out.printf("Didite o número da sua conta: ");
		conta = ler.nextBoolean();
		System.out.printf("Sua conta é: ");
		tipo = ler.nextInt();
		System.out.printf("Digite o seu Nome Completo: ");
		nome = ler.nextLine();
		System.out.printf("Seu nome: %s",nome);
		System.out.printf("Sua conta: %d", conta);
		
		if (cc);
		{
			System.out.printf("Conta Corrente");
		}
		else if (cp);
		{
			System.out.printf("Conta Poupança");
		}
	}
	
	
	
	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	 
	
	
	// Métodos personalizados
	
	public void estadoAtual() 
	{	System.out.println("________________________________");
		System.out.println("Conta: "+ this.getNumConta());
		System.out.println("Tipo: "+ this.getTipo());
		System.out.println("Dono: "+ this.getDono());
		System.out.println("Saldo: "+ this.getSaldo());
		System.out.println("Status: "+ this.getStatus());
	}
	public void abrirConta(String t) 
	{
		this.setTipo(t);
		this.getStatus(true);
		if (t == "CC")
		{
			this.setSaldo(50);
		}
		else if (t == "CP")
		
			this.setSaldo(150);
		
		 System.out.println("Conta aberta com sucesso!");	
		}
			
	
	
	public void fecharConta() 
	{
		if (this.getSaldo() > 0)
		{
			System.out.println("Você precisa zerar a sua posição para fechar a conta");
		} else if (this.getSaldo() < 0) 
		{
		 System.out.println("Você não pode fechar a conta, ainda possui pendências em aberto");	
		}
		 else 
			 {	  
			this.getStatus(false);
			  System.out.println("Conta fechada com sucesso");
		     }
		
	}
	public void depositar(float v) 
	{
		if (this.getStatus()) 
		{
			//this.saldo = this.saldo + v; alterando diretamente nos atributos 
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito realizado com sucesso na conta de: " + this.getDono());
		} else {
			System.out.println("Impossível depositar em uma conta fechada");
		}
	}
	public void sacar(float v)
	{
		if (this.getStatus()) {
			if(this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			}else {
				System.out.println("Saldo insuficiente para saque");
			}
			
		}
		else 
		{
			System.out.println("Impossivel sacar de uma conta fechada");
		}
	}
	
	
	public void pagarMensalidade() 
	{
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		
		}else if (this.getTipo() == "CP" )
		{
			v = 20;	
		}
		if (this.getStatus())
		{
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso"+ this.getDono());
		}else 
		{
			System.out.println("Impossivel pagar uma conta fechada");
		}
	}
		
	// Métodos especiais - Construtor

	public conta_banco() 
	{
		this.saldo = 0;
		this.status = false;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void getStatus(boolean status) {
		this.status = status;
	}
	
	
	

	}
	
	
	
	
	



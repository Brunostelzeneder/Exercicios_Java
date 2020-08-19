package Trabalho_mini;

import java.util.Scanner;

public class cinema   {
	
	private double ingresso;
	private boolean meiaEntrada;
	private String assento;
	public String filme;
	public boolean estudante;
	public String cliente;
	public String horario; 
	public int op;
	Scanner ler = new Scanner(System.in);
	
	// Métodos personalizados
	
	public void estadoAtual()
	
	{
		System.out.println("___________________________________");
		System.out.println("Valor do ingresso: "+ this.getIngresso(ingresso));
		System.out.println("Meia entrada: "+ this.getEstudante());
		System.out.println("Filme: " + this.getFilme());
		System.out.println("Nome do titular: " + this.getCliente());
		System.out.println("Horário da sessão: " + this.getHorario());
	}
	


	public void comprarIngresso ()	
	{ 
			
	}
	
	public void reservaHorario ()
	{
		
	}
	
	public void assentoreservado ()
	{
		
	}
	public void meiaentradaestudante (boolean T)
	{
		
			
		
		{
			System.out.println("Sim, meia de estudante");
		}
	}

	public double getIngresso(double ingresso2) {
		return ingresso;
	}

	public double setIngresso() {
		return this.ingresso = 30.00;
	}

	public boolean getMeiaEntrada() {
		return meiaEntrada;
	}

	public boolean setMeiaEntrada(boolean meiaEntrada) {
		this.meiaEntrada = meiaEntrada;
		return estudante;
	}

	public String getAssento() {
		return assento;
	}

	public void setAssento(String assento) {
		this.assento = assento;
	}

	public String getFilme() {
		return filme;
	}

	public void setFilme(String filme) {
		this.filme = filme;
	}

	public boolean getEstudante() {
		return estudante;
	}

	public boolean setEstudante(boolean estudante) {
		return this.estudante = estudante;
	}
	public String getCliente() {
		return cliente;
	}

	public void setCliente() {
		
		System.out.println("Olá, Seja bem vindo(a)! Qual é o seu nome?");
		this.cliente = ler.nextLine();
		
		
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
}

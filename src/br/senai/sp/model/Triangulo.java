package br.senai.sp.model;

public class Triangulo {
	
	public double base;
	public double ladoB;
	public double LadoC;
	public double altura;
	public String nome;
	
	public void exibirDados(){
		System.out.println("--------------------");
		System.out.println(nome);
		System.out.println("--------------------");
		System.out.println("Base= " + base);
		System.out.println("LadoB= " + ladoB);
		System.out.println("LadoC= " + LadoC);
		System.out.println("altura= " + altura);
		System.out.println();
	}
}

	

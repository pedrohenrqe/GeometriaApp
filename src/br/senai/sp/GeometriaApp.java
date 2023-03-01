package br.senai.sp;

import br.senai.sp.model.Triangulo;

public class GeometriaApp {

	public static void main(String[] args) {
		
		System.out.println("Criando triângulos...");
		
		// Criando dois triângulos
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		
		// Definindo as propriedades dos triângulos 
		t1.altura = 14;
		t1.LadoC = 15;
		t1.ladoB = 10;
		t1.base = 20;
		t1.nome = "Triângulo 001";
		
		t2.altura = 18;
		t2.LadoC = 19;
		t2.ladoB = 12;
		t2.base = 34;
		t2.nome = "Triângulo 002";
	
		// Exibir código dos triângulos
		t1.exibirDados();
		t2.exibirDados();
		
	}

}

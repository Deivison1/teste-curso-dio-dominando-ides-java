package br.com.dio.exercicios.poo;

public class Calculadora implements OperacaoMatematica{

	@Override
	public void soma(double operacao1, double operacao2) {
		System.out.println("soma" + operacao1 / operacao2);
		
	}

	@Override
	public void subtracao(double operecao1, double operacao2) {
		System.out.println("subtracao" + operecao1 / operacao2);
		
	}

	@Override
	public void multiplicacao(double operacao1, double operacao2) {
		System.out.println("multiplicacao" + operacao1 / operacao2);
		
	}

	@Override
	public void divisao(double operacao1, double operacao2) {
		System.out.println("Divisao" + operacao1 / operacao2);
		
	}
	
}

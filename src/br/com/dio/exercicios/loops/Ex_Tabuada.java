package br.com.dio.exercicios.loops;
/*
  Desenvolva um gerador de tabuada, capaz de  gerar a tabuada de qualquer npumero inteiro entre 1 a 10.
  O usu�ro deve informar de qual numero ele deseja ver a tabauada.
  A sa�da deve ser conforme o exemplo abaixo:
  
  *Tabuada de 5;
  *
  *5 X 1 = 5
  *5 X 2 = 10
  *....
  *5 X 10 = 50
  */
import java.util.Scanner;

public class Ex_Tabuada {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Tabuada: ");
		
		int tabuada = scan.nextInt();

		System.out.println("Tabuada: " + tabuada);
		
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
			
		}
	}

}

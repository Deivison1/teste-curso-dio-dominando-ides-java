package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex_NumerosAleatorios {

	public static void main(String[] args) {
		Random random = new Random();
        
		int[] numerosAleatorios = new int [20];
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			int numeros = random.nextInt(100);
			numerosAleatorios[i] = numeros;
		}
		System.out.print(" \nAntecessor dos Numeros aleatorios ");
		for (int numeros : numerosAleatorios) {
			System.out.print((numeros -1) + " ");
		} 
		System.out.print(" \nNumeros aleatorios ");
		 for (int numeros : numerosAleatorios) {
		    System.out.print(numeros + " ");
	    }
	     
	     System.out.print(" \nSuscessores dos Numeros aleatorios ");
	     for (int numeros : numerosAleatorios) {
	    	 System.out.print((numeros +1) + " ");
	     }
	}
	
	
}
        
      



  

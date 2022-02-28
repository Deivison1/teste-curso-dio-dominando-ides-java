package br.com.dio;

import java.util.Scanner;
public class Nota {

	public static void main(String[] args) {
		
		int n = 10;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma nota de 1 a 10");
        n = teclado.nextInt();
        
        
   
        if (n <= 10) {
        	System.out.println("Número valido: " + n);
        }else {
        	System.out.println("Número invalido");
          
           
       }
   }
}



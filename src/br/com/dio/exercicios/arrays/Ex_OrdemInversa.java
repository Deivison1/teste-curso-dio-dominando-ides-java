package br.com.dio.exercicios.arrays;
/*
 * Crie um vetor de 6 npumeros inteiros 
 * e mostre-os na ordem inversa*/
public class Ex_OrdemInversa {

	public static void main(String[] args) {
		
    int []vetor = {3, -5, 15, 34, 8, 2};
      
    int count = 0;
    
    System.out.print("\nVetor: ");
    
    while(count < (vetor.length)) {
     System.out.print(vetor[count] + " ");
     count++;
	}
    
    System.out.print("\nVetor na ordem ionversa: ");
    for (int i = (vetor.length - 1); i >= 0; i--) {
    	System.out.print(vetor[i] + " ");
    }
   }
}
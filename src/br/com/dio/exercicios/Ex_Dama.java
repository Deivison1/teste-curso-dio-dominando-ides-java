package br.com.dio.exercicios;

import java.util.Scanner;

public class Ex_Dama {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quatdMovimentos;
		
		int x1 = sc.nextInt();
    	int y1 = sc.nextInt();
    	int x2 = sc.nextInt();
    	int y2 = sc.nextInt();
    	
    	while(! (x1 == 0 && y1 == 0 && x2 == 0  && y2 == 0)) {
    		
    		quatdMovimentos = 0;
    		
    		if( x1 == x2 && y1 == y2) {
    			quatdMovimentos = 0;
    			
    		}else if(( x1 == x2)|| (y1 == y2) || (Math.abs(x1 - x2)) == (Math.abs(y1 - y2))) {
    			quatdMovimentos = 1;
    			
    		}else {
    			quatdMovimentos = 2;
    		}
		 
		    System.out.println("\n"  + quatdMovimentos);
		    

			 x1 = sc.nextInt();
	    	 y1 = sc.nextInt();
	    	 x2 = sc.nextInt();
	    	 y2 = sc.nextInt();
		    }
			
	}
}
	
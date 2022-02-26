package br.com.dio.operadores;

public class OperacoesLogicas {

	public static void main(String[] args) {
		
		boolean h1 = true;
		boolean h2 = false;
		boolean h3 = true;
		boolean h4 = false;
		
		System.out.println(" h1 && h2 " + (h1 && h2));
		System.out.println(" h1 && h3 " + (h1 && h3));
		
		System.out.println(" h2 && h3 " + (h2 || h3));
		System.out.println(" h2 && h4 " + (h2 || h4));
		
		System.out.println(" h1 && h3 " + (h1 ^ h3));
		System.out.println(" h4 && h1 " + (h4 ^ h1));
		
		System.out.println(h1);
		System.out.println(h2);
		
		
		int i1 = 10;
		int i2 = 5;
		float f1 = 30f;
		float f2  = 50f;
		
		System.out.println(" ((i1 * i2 ) < (f2 - f1))  && true "  + (((i1 + i2 )<( f2 - f1 )) && true));
		
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		int mediaSalario = 0;
		int salarioMensal = 0;
		
		System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));
		
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		System.out.println((salarioBaixo) && (muitosDependentes));
	}

}

package br.com.dio.condicao;

public class Decisao {

	public static void main(String[] args) {
		
		ifFlexa();
		ifsemFlexa();
		ifFerias();
		ifMenor();
		
		switchSemana();
		switchNUmero();
		switchFerias();
		

	}

	private static void switchFerias() {
	   
		String mes = "Dezembro";
		
		switch (mes) {
		
		case "Dezembro":
		case "Junlho":
		case "Janeiro":
			System.out.println("Ferias");
			break;
			
			default:
				System.out.println(" valor indefinido");
				break;
		}
		
	}

	private static void switchSemana() {
		 String dia = "Terça";
		 switch (dia) {
		 
		    case "Segunda":
		    	System.out.println(2);
		    	break;
		    	
		    case "Terça":
		    	System.out.println(3);
		    	break;
		    case "Quarta":
		    	System.out.println(4);
		    	break;
		    case "Quinta":
		    	System.out.println(5);
		    	break;
		    case "Sexta":
		    	System.out.println(6);
		    	break;
		    case "Sabado":
		    	System.out.println(7);
		    	break;
		    case "Domingo":
		    	System.out.println(1);
		    	break;
		    	default:
		    		System.out.println("Valor idefinido");
		    		break;
		 }
	 }
		 
	private static void switchNUmero() {
		
		int numero = 4;
		switch (numero) {
		
		case 1:
		case 2:
		case 3:
		    System.out.println("certo");
	    	break;
	    	
	    case 4:
	    	System.out.println("errado");
	    	break;
	    	
	    case 5:
	    	System.out.println("talvez");
	    	break;
	    
	    	default:
	    		System.out.println("Valor idefinido");
	    		break;
		
	   }
	}
	private static void ifMenor() {
		
		double salarioMensal = 125677.56d;
		double mediaSalaria = 12500d;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		if ((salarioMensal < mediaSalaria) && (quantidadeDependentes >= mediaDependentes)) {
			System.out.println("Funcionario de receber auxlio");
			
		}
		
		boolean salariobaixo = salarioMensal < mediaSalaria;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		if ((salariobaixo) && (muitosDependentes)) {
			System.out.println("Funcionario deve receber auxilio");
			
		}
		
	}

	private static void ifFerias() {
		
		String mes = "junho";
		if ( mes == "Junho" || mes == "Desembro" || mes == "Janeiro");
		System.out.println("Ferias!");
		
	}

	private static void ifsemFlexa() {
		
		int mes = 9;
		if (mes == 1) {
			System.out.println("Janeiro");
		}else if (mes == 2) {
			System.out.println("Feverreiro");
		}else if (mes == 3) {
			System.out.println("Março");
		}else if (mes == 4) {
			System.out.println("Abril");
		}else if (mes == 5) {
			System.out.println("Maio");
		}else if (mes == 6) {
			System.out.println("Julho");
		}else if (mes == 7) {
			System.out.println("Junho");
		}else if (mes == 8) {
			System.out.println("Agosto");
		}else if (mes == 9) {
			System.out.println("Setembro");
		}else if (mes == 10) {
			System.out.println("Outubro");
		}else if (mes == 11) {
			System.out.println("Novembro");
		}else if (mes == 12) {
			System.out.println("Desembro");
		}
		
		
		
		
		
		
		
		
	}

	private static void ifFlexa() {
		// TODO Auto-generated method stub
		
	}
}

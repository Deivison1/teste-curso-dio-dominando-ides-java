import br.com.dio.calculadora.Calculadora;
import br.com.dio.calculadora.Calcular;
import br.com.dio.calculadora.Emprestimo;
import br.com.dio.calculadora.Mensagem;

public class Main {

	public static void main(String[] args) {
		
      //Calculadora
		
		System.out.println("Exercício claculadora");
		System.out.println("");
		
	    Calcular.soma(9, 4);
	    Calcular.subtracao(9, 1.8);
	    Calcular.multiplicacao(5, 5);
	    Calcular.divisao(25, 3);
	    System.out.println("");
	    
	    // Mensagem
	    System.out.println("Exercicio mensagen");
	    System.out.println("");
	    
	    Mensagem.obeterMensagem(9);
	    Mensagem.obeterMensagem(14);
	    Mensagem.obeterMensagem(1);
	    System.out.println("");
	    
	    // Emprestimos
	    System.out.println("Emprestimos");
	    System.out.println("");
	    
	    Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
}

}
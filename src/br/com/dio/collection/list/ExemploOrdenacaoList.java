package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Dados as seguintes informações sobre meus cachorros, crie uma lista
 * e ordene esta lista exibindo:
 * (nome - idade - cor);
 * 
 * cachorro 1 = nome: Jon, idade: 15, cor preto;
 * 
 * cachorro 2 = nome: jack, idade: 12, cor: marron;
 * 
 * cachorro 3 = nome: jon, idade: 10, cor: branco;
 * */

public class ExemploOrdenacaoList {

	public static void main(String[] args) {

		List<Cachorro> meusCachorros = new ArrayList<>() {
			{

				add(new Cachorro("jack", "preto", 15));
				add(new Cachorro("jack", "marron", 12));
				add(new Cachorro("jon", "branco", 10));

			}
		};
		System.out.println("--\tOrdem de inserção\t---");
		System.out.println(meusCachorros);

		System.out.println("--\tOrdem aletória\t---");
		Collections.shuffle(meusCachorros);
		System.out.println(meusCachorros);

		System.out.println("--\tOrdem natural(nome)\t---");
		Collections.sort(meusCachorros);
		System.out.println(meusCachorros);

		System.out.println("--\tOrdem (idade)\t---");
		// Collections.sort(meusCachorros, new ComparatorIdade() );
		meusCachorros.sort(new ComparatorIdade());
		System.out.println(meusCachorros);

		System.out.println("--\tOrdem (cor)\t---");
		// Collections.sort(meusCachorros, new ComparatorCor() );
		meusCachorros.sort(new ComaparatorCor());
		System.out.println(meusCachorros);
		
		System.out.println("--\tOrdem (cor/idade/nome)\t---");
		// Collections.sort(meusCachorros, new ComparatorCor() );
		meusCachorros.sort(new ComaparatorNomeCorIdade());
		System.out.println(meusCachorros);
		
				
	}

}

class Cachorro implements Comparable<Cachorro> {

	private String nome;
	private String cor;
	private Integer idade;

	public Cachorro(String nome, String cor, Integer idade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;

	}

	public String getCor() {
		return cor;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return " [cor=" + cor + ", nome=" + nome + ", idade=" + idade + "]";
	}

	@Override
	public int compareTo(Cachorro cachorro) {

		return this.getNome().compareToIgnoreCase(cachorro.getNome());
	}

}

class ComparatorIdade implements Comparator<Cachorro> {

	@Override
	public int compare(Cachorro c1, Cachorro c2) {

		return Integer.compare(c1.getIdade(), c2.getIdade());
	}

}

class ComaparatorCor implements Comparator<Cachorro> {

	@Override
	public int compare(Cachorro c1, Cachorro c2) {

		return c1.getCor().compareToIgnoreCase(c2.getCor());
	}

}   

class  ComaparatorNomeCorIdade implements Comparator<Cachorro>{

	@Override
	public int compare(Cachorro c1, Cachorro c2) {
		
		int nome = c1.getNome().compareToIgnoreCase(c2.getNome());
		if (nome != 0) return nome;
		
		int cor = c1.getCor().compareToIgnoreCase(c2.getCor());
		if (cor != 0) return cor;
		
	   
		return Integer.compare(c1.getIdade(), c2.getIdade());
	}
	
}


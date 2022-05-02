package br.com.dio.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
 * Dados as seguintes informações sobre minhas séries favoritas,
 * crie um conjunto e ordene esta conjunto exibindo:
 * (nome: genero: tempo de epsódio);
 * 
 *  Séria 1 = nome: Got, genenro: fantasia, tempoEpisódio: 60;
 *  
 *  Séria 2 = nome: Dark, genenro: drama, tempoEpisódio: 60;
 *  
 *  Séria 3 = nome: Arquiero, genenro: ação, tempoEpisódio: 45;*/

public class ExemploOrdenacaoSet {

	public static void main(String[] args) {
		
		System.out.println("--\tOrdem de aleatoria\t---");
        Set<Serie> minhasSeries = new HashSet<>() {{
        	add( new Serie("got", "fantasia", 60));
        	add( new Serie("dark", "drama", 60));
        	add( new Serie("arqueiro", "ação", 45));
        	
        }};
        for(Serie serie : minhasSeries) System.out.println(serie.getNome() + " - " + 
        serie.getGenero() + " - " + serie.getTempoEpisodio());
        
        System.out.println("");
        System.out.println("--\tOrdem de inserção\t---");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
        	add( new Serie("got", "fantasia", 60));
        	add( new Serie("dark", "drama", 60));
        	add( new Serie("arqueiro", "ação", 45));
        	
        }};
        
        for(Serie serie : minhasSeries1) System.out.println(serie.getNome() + " - " + 
        serie.getGenero() + " - " + serie.getTempoEpisodio());
        
        
        
        System.out.println("--\tOrdem natural(tempoEpsodio)\t---");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for(Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - " + 
                serie.getGenero() + " - " + serie.getTempoEpisodio());
        
        
	}   

}
class Serie  implements Comparable<Serie>{
	
	@Override
	public int compareTo(Serie serie) {
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if (tempoEpisodio != 0) return tempoEpisodio;
		
		return this.getGenero().compareTo(serie.getGenero());
		
		
	}
	
	
	
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}
	public String getNome() {
		return nome;
	}
	public String getGenero() {
		return genero;
	}
	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}
	@Override
	public String toString() {
		return "[nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}
	
}
package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		
		
		
		System.out.println(" Crie um lista e adicione as sete notas");
        List<Double> notas = new ArrayList<Double>();
        notas.add(3.0);
        notas.add(7.0);
        notas.add(6.0);
        notas.add(8.0);
        notas.add(5.0);
        notas.add(0.0);
        notas.add(10.0);
        System.out.println(notas.toString());
        
        System.out.println(" Exiba a posição da nota 5.0: " + notas.indexOf(5d));
        
        System.out.println(" Exiba a posição da nota 8.0 na posição 4: ");  
        notas.add(4, 8d);
        System.out.println(notas);
        
        System.out.println(" Substituia a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);
        
        System.out.println(" Convira se a nota 5.0 está na lista: " + notas.contains(5d));
        
        System.out.println(" Exiba todas a notas na ordem em que foram informadas: ");
        for(Double nota : notas) System.out.println(nota);
        
        System.out.println(" Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());
        
        System.out.println(" Exiba a menor nota: " + Collections.min(notas));
        
        System.out.println(" Exiba a maipr nota: " + Collections.max(notas));
        
        
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
        	Double next = iterator.next();
        	soma += next;
        }
        System.out.println(" Exiba a soma dos valores: " + soma);
        
        System.out.println(" Exiba a media das notas: " + soma/notas.size());
        
        System.out.println(" Romova a nota zero: ");
        notas.remove(0);
        System.out.println(notas);
        
        System.out.println(" Romova a nota na posição zero: ");
        notas.remove(0d);
        System.out.println(notas);
        
        System.out.println(" Romova as notas menores que 7.0 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while( iterator1.hasNext()) {
        	Double next = iterator1.next();
        	if(next < 7) iterator1.remove();
        }
        System.out.println(notas);
        
        System.out.println(" Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);
	

        }
	
}

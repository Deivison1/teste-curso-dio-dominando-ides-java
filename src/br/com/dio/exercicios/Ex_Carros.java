package br.com.dio.exercicios;

public class Ex_Carros {

	String cor;
	String modelo;
	int capacidadeTanque;
	
	Ex_Carros(){
		
	}
    Ex_Carros(String cor, String modelo,
	double d){
	    this.cor = cor;
	    this.modelo = modelo;
	    this.capacidadeTanque = (int) d;
	}
	
    void  setCor(String cor) {
		this.cor = cor;
	}
	String getCor() {
		return cor;
	}
	void setModelo(String modelo) {
		this.modelo = modelo;
	}
	String getModelo() {
		return modelo;
	}
	void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	Double totalValorTanque(Double valorCombustivel) {
		return capacidadeTanque * valorCombustivel;
	}
}



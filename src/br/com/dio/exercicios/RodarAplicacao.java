package br.com.dio.exercicios;

public class RodarAplicacao {

	public static void main(String[] args) {
	
		Ex_Carros carro1 = new Ex_Carros();
		
		carro1.setCor("Azul");
		carro1.setModelo("Sedan");
		carro1.setCapacidadeTanque(20);
		
		System.out.println(carro1.getCor());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.69));
        
        System.out.println("");
        Ex_Carros carro2 = new Ex_Carros("amarelo", "Mercedes", 64);
        
        System.out.println(carro2.getCor());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.43));
	}

}

package com.alline.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 35.2;
		System.out.println("O valor da temperatura é: " + temperaturas[0]);
		
		System.out.println("O tamanho reservado do array é: "+ temperaturas.length);
		for(int i = 0; i < temperaturas.length; i++) {
			System.out.println("A temp do dia "+(i+1) +" é " + temperaturas[i]);
		}
	}
}

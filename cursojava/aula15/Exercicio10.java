package com.alline.cursojava.aula15;

import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Em que periodo vc estuda?");
		String periodo = ler.next();
		if(periodo.equalsIgnoreCase("m")) {
			System.out.println("Bom Dia!");
		}else if(periodo.equalsIgnoreCase("v")) {
			System.out.println("Boa Tarde!");
		}else if(periodo.equalsIgnoreCase("n")) {
			System.out.println("Boa Noite!");
		}else {
			System.out.println("Valor Inválido!");
		}
		
		ler.close();
	}

}

package com.alline.cursojava.aula15;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String sexo = ler.next();
		if(sexo.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		}else if (sexo.equalsIgnoreCase("m")){
			System.out.println("Masculino");
		}else {
			System.out.println("Sexo Inválido");
		}
		ler.close();
	}
}

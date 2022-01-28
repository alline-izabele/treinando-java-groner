package com.alline.cursojava.aula15;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String letra = ler.next();
		if(letra.equalsIgnoreCase("a")|| letra.equalsIgnoreCase("e") 
				|| letra.equalsIgnoreCase("i")|| letra.equalsIgnoreCase("o")
				|| letra.equalsIgnoreCase("u")) {
			System.out.println("É vogal");
		}else {
			System.out.println("É consoante");
		}
		ler.close();
	}
}

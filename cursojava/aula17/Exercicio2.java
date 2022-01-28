package com.alline.cursojava.aula17;

import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome, senha;
		System.out.println("Digite nome e senha");
		nome = ler.next();
		senha = ler.next();
		do {
			if(nome.equalsIgnoreCase(senha)) {
				System.out.println("Erro, informe outro nome e senha");
				nome = ler.next();
				senha = ler.next();
			}
		}while(nome.equalsIgnoreCase(senha));
		System.out.println("cadastro realizado");
		ler.close();
	}

}

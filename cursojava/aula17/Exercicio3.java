package com.alline.cursojava.aula17;

import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe nome, idade, salario, sexo, estado");
		String nome, sexo, estado;
		int idade;
		double salario;
		nome = ler.next();
		idade = ler.nextInt();
		salario = ler.nextDouble();
		sexo = ler.next();
		estado = ler.next();
		while(nome.length() <= 3) {
			System.out.println("erro, precisa ter mais de 3 caracteres");
			nome = ler.next();
		}
		while(idade >= 150 || idade < 0) {
			System.out.println("erro, idade invalida");
			idade = ler.nextInt();
		}
		
		ler.close();
	}

}

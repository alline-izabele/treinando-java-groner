package com.alline.cursojava.aula13;

import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora?");
		double ganhoHora = ler.nextDouble();
		System.out.println("Número de horas trabalhadas por mês?");
		double horasMes = ler.nextDouble();
		System.out.println("O salário mensal é: " + (ganhoHora * horasMes));
		ler.close();
	}
}

package com.alline.cursojava.aula15;

import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o salario: ");
		double salario = ler.nextDouble();
		double reajuste, percentual;
		if(salario <= 280) {
			percentual = 0.2;
			reajuste = salario * 0.2;
		}else if (salario < 700){
			percentual = 0.15;
			reajuste = salario * 0.15;
		}else if(salario < 1500) {
			percentual = 0.1;
			reajuste = salario * 0.1;
		}else {
			percentual = 0.05;
			reajuste  = salario * 0.05;
		}
		System.out.println("O salario era: " + salario);
		System.out.println("O percentual de reajuste foi: " + percentual);
		System.out.println("O valor do aumento foi: " + reajuste);
		System.out.println("O novo salário é: " + (salario + reajuste));
		ler.close();
	}
}

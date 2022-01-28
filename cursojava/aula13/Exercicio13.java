package com.alline.cursojava.aula13;

import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora?");
		int ganhoHora = ler.nextInt();
		System.out.println("Número de horas trabalhadas por mês?");
		int horasMes = ler.nextInt();
		
		int salario = ganhoHora * horasMes;
		System.out.println("O salário mensal é: " + salario);
		
		double inss = salario * 0.08;
		System.out.println("pago ao inss: " + inss);
		
		double sindicato = salario * 0.05;
		System.out.println("pago ao sindicato: " + sindicato);
		
		double ir = salario * 0.11;
		System.out.println("pago ao imposto de renda: " + ir);
		
		double totalDescontos = inss + sindicato + ir;
		System.out.println("total descontos: " + totalDescontos);
		
		double salarioLiquido = salario - totalDescontos;
		System.out.println("O salario liquido: " + salarioLiquido);
		ler.close();
	}

}

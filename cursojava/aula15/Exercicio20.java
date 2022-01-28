package com.alline.cursojava.aula15;

import java.util.Scanner;
public class Exercicio20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int s = 0, n = 0;
		String resposta;
		System.out.println("Responda as seguintes questões: ");
		System.out.println("Telefonou para a vitima? ");
		resposta = ler.next();
		if(resposta.equalsIgnoreCase("s")) {
			s++;
		}else {
			n++;
		}
		System.out.println("Esteve no local do crime? ");
		resposta = ler.next();
		if(resposta.equalsIgnoreCase("s")) {
			s++;
		}else {
			n++;
		}
		System.out.println("Mora perto da vitima? ");
		resposta = ler.next();
		if(resposta.equalsIgnoreCase("s")) {
			s++;
		}else {
			n++;
		}
		System.out.println("Devia para a vitima? ");
		resposta = ler.next();
		if(resposta.equalsIgnoreCase("s")) {
			s++;
		}else {
			n++;
		}
		System.out.println("Já trabalhou com a vitima? ");
		resposta = ler.next();
		if(resposta.equalsIgnoreCase("s")) {
			s++;
		}else {
			n++;
		}
		if(s == 2) {
			System.out.println("Sus");
		}else if(s >= 3 && s <= 4) {
			System.out.println("Cumplice");
		}else if (s == 5){
			System.out.print("Among us");
		}else {
			System.out.println("Inocente");
		}
		ler.close();
	}

}

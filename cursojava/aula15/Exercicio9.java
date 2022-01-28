package com.alline.cursojava.aula15;

import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i1 = ler.nextInt(), i2 = ler.nextInt(), i3 = ler.nextInt();
		if(i1 > i2) {
			if(i1 > i3) {
				System.out.println(i1);
			}else {
				System.out.println(i3);
			}
		}if(i2 > i3) {
		}
		ler.close();
	}

}

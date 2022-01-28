package com.alline.cursojava.aula19;

public class Exercicio4 {

	public static void main(String[] args) {
		int[] a = new int[15], b = new int[15];
		for(int i = 1; i <= 9; i++) {
			a[i] = i;
			b[i] = (int) Math.sqrt(a[i]);
			System.out.println("a: "+a[i]);
			System.out.println("b: "+b[i]);
		}

	}

}

package br.com.desafios.java.hackerrank.stdinandstdoutii;

import java.util.Locale;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			sc.useLocale(Locale.US);
			int i = sc.nextInt();
			double d = sc.nextDouble();
			sc.nextLine(); //consome o caracter correspondente a tecla "enter"
			String s = sc.nextLine();

			System.out.println("String: " + s);
			System.out.println("Double: " + d);
			System.out.println("Int: " + i);
			
		} catch (RuntimeException e) {
			System.out.println("O valor digitado está incorreto");
		}
	}
}

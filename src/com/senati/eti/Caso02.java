package com.senati.eti;

import java.util.*;

public class Caso02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese número: ");
		int n = sc.nextInt();
		
		String mensaje = "Número par";
		
		if(n % 2 != 0) {
			mensaje = "Número impar";
		System.out.println("\nR E S U L T A D O ");
		System.out.println("Mensaje: " + mensaje);
		}
		else {
			System.out.println("\nR E S U L T A D O ");
			System.out.println("Mensaje: " + mensaje);
		}
		

	}

}

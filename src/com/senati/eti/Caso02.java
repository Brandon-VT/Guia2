package com.senati.eti;

import java.util.*;

public class Caso02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese n�mero: ");
		int n = sc.nextInt();
		
		String mensaje = "N�mero par";
		
		if(n % 2 != 0) {
			mensaje = "N�mero impar";
		System.out.println("\nR E S U L T A D O ");
		System.out.println("Mensaje: " + mensaje);
		}
		else {
			System.out.println("\nR E S U L T A D O ");
			System.out.println("Mensaje: " + mensaje);
		}
		

	}

}

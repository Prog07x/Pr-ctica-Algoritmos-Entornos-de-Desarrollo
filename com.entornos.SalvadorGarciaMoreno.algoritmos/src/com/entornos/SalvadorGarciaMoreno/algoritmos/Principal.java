package com.entornos.SalvadorGarciaMoreno.algoritmos;

public class Principal {

	public static void main(String[] args) {

		int numeros [] = new int [3];
		
		/* Esta forma hace que no pueda haber numeros repetidos 
		 * Aunque algo exagerado sirve para todo tipo de tamaños
		 * */
		for(int i = 0; i<3 ; i++) {
			numeros[i] = (int)(Math.random()*9+1);
			for(int j = 0; j <3 ; j++) {
				while(numeros[i] == numeros[j] && i!=j) {
					numeros[i] = (int)(Math.random()*9+2);
				}
			}
		}
		
		int resultadoFibonacci[] = new int[3];
		
		for(int i = 0; i<3 ; i++) {
			resultadoFibonacci[i] = algoritmos.fibonacci(numeros[i]);
		}
		
		int resultadoFactorial[] = new int[3];
		
		for(int i = 0; i<3 ; i++) {
			resultadoFactorial[i] = algoritmos.factorial(numeros[i]);
		}
		
		boolean resultadoPrimos[] = new boolean[3];
		
		for(int i = 0; i<3 ; i++) {
			resultadoPrimos[i] = algoritmos.primo(numeros[i]);
		}
		
		
		

	}

}

package com.entornos.SalvadorGarciaMoreno.algoritmos;

public abstract class algoritmos {
	
	/****
	 * Calculo sucesion fibonachi en el n puesto
	 * @param numero
	 * @return int
	 */
	public static int fibonacci(int numero) {
		if(numero<0) throw new IllegalArgumentException();
		
		int a = 0;
		int b = 1;
		
		if(numero == 0) return 0;
		if(numero == 1) return 1; 
		
		int siguiente = 0;
		for(int i = 2; i <= numero; i++) {
			siguiente = a+b;
			a = b;
			b = siguiente;
		}
		
		return b;
	}
	
	/****
	 * Calculo del factorial de n
	 * @param numero
	 * @return int 
	 */
	public static int factorial(int numero) {
		if(numero<0) throw new IllegalArgumentException();
		int resultado = 1;
		for (int i = 2; i<=numero ; i++) {
			resultado = resultado*i;
		}
		
		return resultado;
	}
	
	/****
	 * Comprueba si n es primo o no.
	 * @param numero
	 * @return boolean
	 */
	public static boolean primo(int numero) {
		if(numero<2) throw new IllegalArgumentException();
		if(numero == 2) return true;
		for(int i = 2; i<=numero/2+1; i++) {
			if(numero%i == 0) return false;
		}
		return true;
	}
	
	
	
	
	
	

}

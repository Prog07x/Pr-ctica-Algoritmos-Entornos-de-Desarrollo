package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.entornos.SalvadorGarciaMoreno.algoritmos.algoritmos;

class testAlgoritmos {
	
	static algoritmos x;
	
	@BeforeAll
	static void arreglos() {
		x = new algoritmos() {};
	}

	@Test
	void testFibonacci() {
		assertEquals(1 , x.fibonacci(1));
		assertEquals(5 , x.fibonacci(5));
		assertEquals(55 , x.fibonacci(10));
		
	}

	@Test
	void testFactorial() {
		assertEquals(2, x.factorial(2));
		assertEquals(120, x.factorial(5));
		assertEquals( 6, x.factorial(3));
	}

	@Test
	void testPrimo() {
		assertEquals(true, x.primo(2));
		assertEquals(false, x.primo(8));
		assertEquals(true, x.primo(7));
	}
	
	@Test
	void testFalloFibonacci() {
		assertThrows(IllegalArgumentException.class, () -> {
			x.fibonacci(-2);
		});
	}
	
	@Test
	void testFallofactorial() {
		assertThrows(IllegalArgumentException.class, () -> {
			x.factorial(-2);
		});
	}
	
	@Test
	void testFalloPrimo() {
		assertThrows(IllegalArgumentException.class, () -> {
			x.primo(-2);
		});
	}
	
	
	

}

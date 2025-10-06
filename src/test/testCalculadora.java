package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCalculadora {

	@Test
	void testSuma() {
		assertEquals(5, Calcuadora.suma(2,3));
	}
	
	@Test
	void testResta() {
		assertEquals(1, Calcuadora.resta(4,3));	
	}
	
	@Test
	void testMultiplica() {
		assertEquals(12, Calcuadora.multiplica(4,3));	
	}
	
	@Test
	void testDivide() {
		assertEquals(2, Calcuadora.divide(4,2));	
	}

}

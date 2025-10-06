package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class testCuenta {

	private static Cuenta cuenta, c1, c2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta(0.0);
		c1 = new Cuenta("12345");
		c2 = new Cuenta("67890");
		c1.setSaldo(50.0);
		c2.setSaldo(0.0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta.setSaldo(0.0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(200);
		assertEquals(200, cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta.retirar(200);
		assertEquals(-200, cuenta.getSaldo());
	}
	
	@Test
	void test0014() {
		c1.retirar(200);
		c2.retirar(350);
		c1.ingresar(100);
		c2.retirar(200);
		c2.retirar(150);
		c1.retirar(200);
		c2.ingresar(50);
		c2.retirar(100);
		assertEquals(-250, c1.getSaldo());
		assertEquals(-450, c2.getSaldo());
	}

}

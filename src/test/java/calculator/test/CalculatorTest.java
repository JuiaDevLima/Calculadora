package calculator.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import calculator.java.Calculadora;

public class CalculatorTest {

	private Calculadora calculadora;

	@Before
	public void setUp() {
		calculadora = new Calculadora();
	}

	@Test
	public void testAddition() {
		assertEquals(5, calculadora.add(2, 3));
		assertEquals(-1, calculadora.add(-2, 1)); // Teste para números negativos
	}

	@Test
	public void testSubtraction() {
		assertEquals(2, calculadora.subtract(5, 3));
		assertEquals(-3, calculadora.subtract(0, 3)); // Teste para subtração onde o resultado é negativo
	}

	@Test
	public void testMultiplication() {
		assertEquals(15, calculadora.multiply(3, 5));
		assertEquals(0, calculadora.multiply(0, 5)); // Teste para multiplicação por zero
	}

	@Test
	public void testDivision() {
		assertEquals(2, calculadora.divide(10, 5));
		assertEquals(0, calculadora.divide(0, 5)); // Teste para divisão onde o numerador é zero
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivisionByZero() {
		calculadora.divide(10, 0);
	}

}

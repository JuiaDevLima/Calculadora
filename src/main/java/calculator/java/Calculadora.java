package calculator.java;

public class Calculadora {
	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Não é possivel dividir por zero");
		}
		return a / b;
	}

}

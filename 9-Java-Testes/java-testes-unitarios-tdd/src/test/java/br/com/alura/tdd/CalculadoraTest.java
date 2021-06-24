package br.com.alura.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		
		assertEquals(10, soma);
	}

}

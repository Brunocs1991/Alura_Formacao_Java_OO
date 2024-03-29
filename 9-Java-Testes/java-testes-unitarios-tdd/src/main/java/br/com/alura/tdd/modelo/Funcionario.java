package br.com.alura.tdd.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Funcionario {

	private String nome;
	private LocalDate dataAdmissao;
	private BigDecimal salario;

	public void reajustarSalario(BigDecimal reajuste) {
		this.salario = this.salario.add(reajuste);
		arrendondarSalario(this.salario);
	}

	private void arrendondarSalario(BigDecimal salario2) {
		// TODO Auto-generated method stub
		this.salario = this.salario.setScale(2, RoundingMode.HALF_UP);
	}

}

package br.com.alura.tdd.modelo;

import java.math.BigDecimal;
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
	
}

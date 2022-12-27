package com.br.programaDeEncriptacao.Funcionalidade;

import java.util.ArrayList;

public class MetodoDeCodificacao {

	protected char[] caracteres;
	private Integer valor = 5;
	private String mensagem;

	protected void criptografar() {

		ArrayList<Character> resultadoDaCriptrografia = new ArrayList<Character>();

		for (char i : caracteres) {
			i += valor;
			resultadoDaCriptrografia.add(i);
		}

		StringBuilder builder = new StringBuilder(resultadoDaCriptrografia.size());

		for (Character ch : resultadoDaCriptrografia) {
			builder.append(ch);
		}

		String msg = builder.toString();

		mensagem = msg;

	}

	protected void descriptografar() {
		ArrayList<Character> resultadoDaCriptrografia = new ArrayList<Character>();

		for (char i : caracteres) {
			i -= valor;
			resultadoDaCriptrografia.add(i);
		}

		StringBuilder builder = new StringBuilder(resultadoDaCriptrografia.size());

		for (Character ch : resultadoDaCriptrografia) {
			builder.append(ch);
		}

		String msg = builder.toString();

		mensagem = msg;
	}

	protected String getMensagem() {
		return mensagem;
	}

}

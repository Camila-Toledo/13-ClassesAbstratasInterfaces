package br.com.glandata.abstracao.service;

public class Gerente extends Funcionario {

	@Override
	public double calculaHoras() {
		return 0;
	}

	public void testeMetodo() {
		System.out.println("Olá Gerente!");
	}

}

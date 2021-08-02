package com.br.testeProgramacao;

import com.br.Funcoes.Funcoes;

public class Controller {
	private Funcoes funcoes  = new Funcoes();
	public Controller(int x, int y, String criptografia,int fibonacci)throws Exception {
		this.funcoes.numerosPrimos(x, y);
		this.funcoes.criptografia(criptografia);
		this.funcoes.fibonacci(fibonacci);
	}
	
	public Controller (int x, int y)throws Exception{
		this.funcoes.numerosPrimos(x, y);
	}
	public Controller(String criptografia)throws Exception {
		this.funcoes.criptografia(criptografia);
	}
	
	public Controller(int fibonacci)throws Exception {
		this.funcoes.fibonacci(fibonacci);
	}
}

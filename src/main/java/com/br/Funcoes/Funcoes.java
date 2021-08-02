package com.br.Funcoes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Funcoes {

	// Fução para calculo de numeros primos
	public void numerosPrimos(int x, int y) throws Exception {

		System.out.println("_______________ MODULO PARA NUMEROS PRIMOS_______________");
		int ultimoprimo = 1;
		boolean verPrimo = false;
		if (x > y) {
			System.out.println("o primeiro numero não pode ser maior que o segundo");

		} else {

			for (int i = x; i <= y; i++) {
				if (i == 2) {
					ultimoprimo = i;
				} else {
					if (i % 2 == 0) {
					} else {
						if (i != 1) {
							for (int j = 2; j < i; j++) {
								// System.out.println(i % j);
								if (i % j == 0 && verPrimo == false) {
									verPrimo = true;
								}
							}
							if (verPrimo == false) {
								ultimoprimo = i;
							}

							verPrimo = false;
						}
					}
				}

			}
		}
		System.out.println("este é o ultimo numero primo da sequência digitada " + ultimoprimo);
	}

	// Função para realizar a criptografia de texto
	public void criptografia(String texto) throws Exception {
		System.out.println("_______________ MODULO PARA CRIPTOGRAFIA_______________");
		System.out.println("palavra a ser criptografada: " + texto);
		char[] caracteres = texto.toCharArray();

		Map<Integer, String> alfabeto = new HashMap<Integer, String>();
		int i = 1;
		for (char a = 'a'; a <= 'z'; a++) {
			alfabeto.put(i, String.valueOf(a));
			i++;
		}
		String textoCriptografado = "";
		String textoDescriptografado = "";
		int indiceSelecionado = 0;
		for (char c : caracteres) {
			for (Entry<Integer, String> saida : alfabeto.entrySet()) {
				if (saida.getValue().equals(String.valueOf(c))) {
					indiceSelecionado = saida.getKey() + 3;
					textoCriptografado += String.valueOf(c).equals("x") ? alfabeto.get(1)
							: String.valueOf(c).equals("y") ? alfabeto.get(2) :
									String.valueOf(c).equals("z") ? alfabeto.get(3) : alfabeto.get(indiceSelecionado);
				}
			}
		}
		System.out.println("texto criptografado: " + textoCriptografado);
		char caracter[] = textoCriptografado.toCharArray();

		for (char c : caracter) {
			for (Entry<Integer, String> saida : alfabeto.entrySet()) {

				if (saida.getValue().equals(String.valueOf(c))) {
					indiceSelecionado = saida.getKey() - 3;
					textoDescriptografado += String.valueOf(c).equals("a") ? alfabeto.get(24)
							: String.valueOf(c).equals("b") ? alfabeto.get(25) :
									String.valueOf(c).equals("c") ? alfabeto.get(26) : alfabeto.get(indiceSelecionado);

				}
			}
		}
		System.out.println("texto descriptografado: " + textoDescriptografado);
	}

	// Função para realizar o calculo fibonacci
	public void fibonacci(int fibonacci) throws Exception {
		System.out.println("_______________ MODULO PARA SEQUENCIA DE FIBONACCI_______________");
		
		Map<Integer, Integer> mapeamentoDados = new HashMap<Integer, Integer>();
		System.out.println(0);
		int atual = 0;
		int penultimo = 0;
		int antepenultimo = 0;
		int cont = 1;
		Runtime runtime = Runtime.getRuntime();
		while (cont <= fibonacci) {
			if(runtime.freeMemory() < 240616) {
				System.out.println("parou automaticamente");
				break;
			}
			antepenultimo = penultimo;
			penultimo = atual;
			atual = atual == 0 ? cont : penultimo + antepenultimo;
			System.out.println(cont+"/"+atual+"/"+runtime.freeMemory());
			mapeamentoDados.put(cont, atual);
			cont++;
		}
		System.out.println(mapeamentoDados.get(fibonacci));
	}
}

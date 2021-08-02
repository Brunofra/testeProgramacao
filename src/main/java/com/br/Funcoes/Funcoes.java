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
			// verifica se o valor inicial é maior que valor limite
			System.out.println("o primeiro numero não pode ser maior que o segundo");

		} else {

			for (int i = x; i <= y; i++) {
				if (i == 2) {
					// unico numero par primo
					ultimoprimo = i;
				} else {
					if (i % 2 == 0) {
					} else {
						if (i != 1) {
							// inicia os calculos para verificar
							// os numeros primos
							for (int j = 2; j < i; j++) {
								// se o resto da divisão for zero indica que é divisivel por outro numero
								// além do próprio numero e o numero 1
								if (i % j == 0 && verPrimo == false) {
									verPrimo = true;
								}
							}
							// verifica se ocorreu alguma divisão
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
		// transforma string em array
		char[] caracteres = texto.toCharArray();
		// mapea o alfabeto
		Map<Integer, String> alfabeto = new HashMap<Integer, String>();
		int i = 1;
		for (char a = 'a'; a <= 'z'; a++) {
			alfabeto.put(i, String.valueOf(a));
			i++;
		}
		String textoCriptografado = "";
		String textoDescriptografado = "";
		int indiceSelecionado = 0;
		// criptografa o texto
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
		
		// descriptografa o texto
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
		// mapeia os dados (fora do escopo)
		Map<Integer, Integer> mapeamentoDados = new HashMap<Integer, Integer>();
		System.out.println(0);
		int atual = 0;
		int penultimo = 0;
		int antepenultimo = 0;
		int cont = 1;
		Runtime runtime = Runtime.getRuntime();
		while (cont <= fibonacci) {
			// este foi o limite de memória que o meu computador atigiu 
			// antes do erro de buffer memory 240616

//			Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
			// utilizei o numero natural 100000000 com oito zeros
			if(runtime.freeMemory() < 240616) {
				System.out.println("parou automaticamente por estouro de memória");
				break;
			}
			// itera  ate a variavel fibonacci
			// realiza o calculo fibonacci
			antepenultimo = penultimo;
			penultimo = atual;
			atual = atual == 0 ? cont : penultimo + antepenultimo;
			System.out.println(atual);
			// fora do escopo
			mapeamentoDados.put(cont, atual);
			cont++;
		}
		// fora do escopo
		System.out.println(mapeamentoDados.get(fibonacci));
	}
}

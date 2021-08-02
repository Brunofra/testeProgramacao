package com.br.testeProgramacao;

import java.util.Scanner;

import com.br.Entidade.Inputs;
import com.br.Funcoes.Funcoes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner in = new Scanner(System.in);
    	Inputs input = new Inputs();
    	System.out.println("Digite o numero inicial para calculo dos numeros primos");
    	input.setX(in.nextInt());
    	System.out.println("Digite o numero limite para calculo dos numeros primos");
    	input.setY(in.nextInt());
    	System.out.println("Digite o texto em minusculo a ser criptografado");
    	input.setCriptografia(in.next());
    	System.out.println("Digite o numero limite para o calculo fibonacci");
    	input.setFibonacci(in.nextInt());
    	try {
    		Controller controller = new Controller(input.getX(), input.getY(),
        			input.getCriptografia(), input.getFibonacci());
//    		Controller controller = new Controller(
//        			input.getCriptografia());
//    		Controller controller = new Controller(input.getX(),input.getY());
//    		Controller controller = new Controller(input.getFibonacci());
    		
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("verifique as informações enviadas \n"+e.getMessage());
		}
       
    }
}

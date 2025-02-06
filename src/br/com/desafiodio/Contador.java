package br.com.desafiodio;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro par�metro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo par�metro");
		int parametroDois = sc.nextInt();
		
		try {
			//chamando o m�todo contendo a l�gica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException  exception) {
			 System.out.println(exception.getMessage());
		}
		
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		 if (parametroUm >= parametroDois) {
	            throw new ParametrosInvalidosException("O segundo par�metro deve ser maior que o primeiro.");
	        }

		int contagem = parametroDois - parametroUm;
		  for (int i = 0; i <= contagem; i++) {
	            System.out.println(parametroUm + i);
	        }
	}

}

package lista3EstruturaCondicionalDs3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
		ordem crescente ou decrescente. 
		 */
		int valorA, valorB, auxiliar, calculo;
		valorA = 0;
		valorB = 0;
		calculo = 0;
		
		Scanner lerTeclado = new Scanner(System.in);
		
		System.out.println("Informe o valor do primeiro numero: ");
		valorA = lerTeclado.nextInt();
		System.out.println("Informe o valor do segundo numero: ");
		valorB = lerTeclado.nextInt();
		
		if(valorA >= valorB)	{
			calculo = valorA % valorB;
			if(calculo == 0) {
				System.out.println("S�o Multiplos");
			}
			else {
				System.out.println("N�o s�o Multiplos");
			}
		}
		else 	{
					calculo = valorB % valorA;
					if(calculo == 0) {
					System.out.println("S�o Multiplos");
				}
					else {
					System.out.println("N�o s�o Multiplos");
					}
				}
			
		

	}

}

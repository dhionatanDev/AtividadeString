package lista3EstruturaCondicional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Fazer um programa para ler um n�mero inteiro, e depois dizer se este 
		 n�mero � negativo ou n�o.
		 
		 */
		int numero = 0 ;
		Scanner lerTeclado = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero = lerTeclado.nextInt();
		
		if(numero<0) {
			System.out.println("O numero " + numero + " � negativo");
		}
		else if(numero == 0){
			System.out.println("O numero " + numero + " � neutro");
		} 
		else {
			System.out.println("O numero " + numero + " � positivo");
		}

	}

}

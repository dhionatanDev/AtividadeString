package lista3EstruturaCondicionalDS8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario= 0, calculo = 0; 
		
		Scanner lerTeclado = new Scanner (System.in);
		System.out.println("Informe o valor do Salario: ");
		salario = lerTeclado.nextDouble();
		
		if(salario <= 2000) {
			System.out.println("Isento ");
		}
		else if(salario > 2000 && salario <= 3000 ) {
			salario = salario -2000;
			if(salario <= 1000) {
				salario = salario * 0.08;
				System.out.printf("R$ : %.2f", salario);
			}
			
		}
		else if(salario > 3000 && salario <= 4500 ) {
			salario = salario - 3000;
			if(salario <= 1500) {
				salario = (salario * 0.18) + 80;
				System.out.printf("R$ : %.2f", salario);
			}
			
		}
		else if(salario > 4500 ) {
			salario = salario - 4500;
			salario = (salario * 0.28) + 350;
			System.out.printf("R$ : %.2f" , salario);
			}
			
		

	}

}

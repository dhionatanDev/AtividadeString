import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		float num1, num2, num3, calculo;
		num1 = 0;
		num2 = 0;
		num3 = 0;
		calculo = 0;
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("Informe o primeiro numero: ");
		num1 = lerTeclado.nextFloat();
		System.out.println("Informe o segundo numero: ");
		num2 = lerTeclado.nextFloat();
		System.out.println("Informe o terceiro numero: ");
		num3 = lerTeclado.nextFloat();
		if (num1 + num2 > num3 && num1 + num3 > num2 && num2 + num3 > num1) {
			    if (num1 != num2 && num2 != num3 && num1 != num3) {
				System.out.println("O triang�lo � escaleno ");
			}
			    else {
			    if ( (num1==num2 && num1 != num3) | (num1 == num3 && num2 != num1)) {
					System.out.println("O triangulo � is�celes");
				}
				else {
					System.out.println("O triangulo � equilatero");
				}
			    }
				System.out.println("Teste");
						
		}
		else {
			System.out.println("Os numeros n�o formam um triangulo ");
		}

	}

}

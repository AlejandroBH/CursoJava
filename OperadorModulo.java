package Todo_Code;

import java.util.Scanner;

public class OperadorModulo {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int resultado;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingresa el primer numero: ");
		num1 = entrada.nextInt();
		System.out.print("Ingresa el segundo numero: ");
		num2 = entrada.nextInt();
		
		resultado = num1 % num2;

		if(resultado==0) {
			System.out.println("El resuduo de la division es un numero par");
		}else {
			System.out.println("El resuduo de la division es un numero inpar");
		}
	}
}

package Todo_Code;

import java.util.Scanner;

public class OperadorModulo {

	public static void main(String[] args) {
		
		int input;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingresa un numero entero: ");
		input = entrada.nextInt();

		if(input % 2 == 0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
	}
}

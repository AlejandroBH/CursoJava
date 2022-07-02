package Todo_Code;

public class IfElse_Anidados {
	
	public static void main(String[] args) {
		
		//Declara tipo de datos para variables
		int num1, num2;
		
		//Inicializa las variables con valor por defecto
		num1 = 15;
		num2 = 15;

		//Muestra que numero es mayor
		if (num1 > num2) {
			System.out.println("El numero mayor es: " + num1);
		}
		else {
			if (num1 == num2) {
				System.out.println("Los numeros son iguales");
			}
			else {
				System.out.println("El numero mayor es: " + num2);
			}

		}
		
	}
	
}

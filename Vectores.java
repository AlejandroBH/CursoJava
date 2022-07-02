package Todo_Code;
import java.util.Scanner;

public class Vectores {
	
	public static void main(String[] ars) {
		
		//Declaracion
		int vector [] = new int [4];
		
		//Asignacion (por teclado)
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner (System.in);
		for (int i=0; i<vector.length; i++) {
			System.out.print("Ingrese el valor para el indice " + i + ": ");
			vector[i] = teclado.nextInt();
		}
		
		System.out.println("------------------------------");
		
		//Recorrido
		for (int i=0; i<vector.length; i++) {
			System.out.println("Estoy en el indice: " + i);
			System.out.println("Tengo guardado un " + vector[i]);
			System.out.println("------------------------------");
		}
	}
}

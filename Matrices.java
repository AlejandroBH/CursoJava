package Todo_Code;
import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
		
		//Declaracion
		int matriz [][] = new int [3][3];
		
		try (Scanner entrada = new Scanner(System.in)) {
			//Asignacion (manual)
			for (int f=0; f<3; f++) {
				for (int c=0; c<3; c++) {
					System.out.println("Ingresa el valor de la posicion f: " + f + " c: " + c);
					matriz[f][c] = entrada.nextInt();
				}
				
			}
		}
		
		//Recorrido
		for (int f=0; f<3; f++) {
			for (int c=0; c<3; c++) {
				System.out.println("El valor de la posicion f: " + f + " c: " + c);
				System.out.println("es de: " + matriz[f][c]);
			}
			
		}

	}

}

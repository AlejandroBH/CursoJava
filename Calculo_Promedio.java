package Todo_Code;
import java.util.Scanner;

public class Calculo_Promedio {

	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			int mF, mC;
			
			System.out.print("Ingrese el maximo de alumnos: ");
			mF = entrada.nextInt();
			System.out.print("Ingrese el maximo de notas: ");
			mC = entrada.nextInt();
			System.out.println("");

			Double matriz[][] = new Double [mF][mC+1];
			Double suma = 0.0;

			for(int f=0; f<mF; f++) {
				for(int c=0; c<mC; c++) {

					System.out.print("Ingrese la calificacion del alumno N° " + f + ": ");
					matriz[f][c]=entrada.nextDouble();
					suma = suma + matriz[f][c];
					
				}
				matriz[f][mC] = suma / mC;
				suma = 0.0;
				
				System.out.println("------------------------------------------------");
			}

			for(int f=0; f<mF; f++) {
				 System.out.println("Las calificaciones del alumno N° " + f + " son: ");
				 System.out.println("");
				for(int c=0; c<mC; c++) {
					System.out.println(matriz[f][c]);
				}

				if (matriz[f][mC]>=4) {
					System.out.println("");
					System.out.println("Promedio final: " + matriz[f][mC]);
					System.out.println("El alumno APROBO el curso");
				}else {
					System.out.println("");
					System.out.println("Promedio final: " + matriz[f][mC]);
					System.out.println("El alumno REPROBO el curso");
				}

				System.out.println("------------------------------------------------");
			}
		}

	}

}

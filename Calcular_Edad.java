package Todo_Code;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calcular_Edad {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int pMax=0; //inicial
		
		System.out.print("Ingresa el maximo de personas: ");
		pMax=entrada.nextInt();
		
		int matriz[][] = new int [pMax][4];
		String vector[] = new String [pMax];
		

		for(int f=0; f<pMax; f++) {
			System.out.print("Ingrese el nombre de la persona: ");
			vector[f]=entrada.next();

			System.out.print("Usuario: " + vector[f] + " | DIA: ");
			matriz[f][0]=entrada.nextInt();
			System.out.print("Usuario: " + vector[f] + " | MES: ");
			matriz[f][1]=entrada.nextInt();
			System.out.print("Usuario: " + vector[f] + " | AÑO: ");
			matriz[f][2]=entrada.nextInt();
			System.out.println("----------------------------------------------------------------------------------------------------------------------");
		}
		
		for(int f=0; f<pMax; f++) {
			//Calculamos la edad y la guardamos en el campo 4 de la matriz
			Calendar fNac = new GregorianCalendar(matriz[f][2], matriz[f][1], matriz[f][0]);
			Calendar fHoy = Calendar.getInstance();

			long edadEnDias = (fHoy.getTimeInMillis() - fNac.getTimeInMillis()) / 1000 / 60 / 60 / 24;

			int edad = Double.valueOf(edadEnDias / 365.25d).intValue();
			matriz[f][3]=edad;

			System.out.println(vector[f] + " nacio el " + matriz[f][0] + "/" + matriz[f][1] + "/" + matriz[f][2] + " y tiene: " + matriz[f][3] +" años");

		}
	}
}

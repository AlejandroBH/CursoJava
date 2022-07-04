package Todo_Code;
import java.util.Scanner;

public class Propio_EjercicioVector {

	public static void main(String[] args) {
		
		//Declaro variables y array de tipo vector con 15 posiciones.
		int Count3 = 0;
		int Count5 = 0;
		int CountDif = 0;
		int nMin = 0;
		int nMax = 0;
		int vector[] = new int [15];
		
		//Inicio un ciclo de tipo for.
		try (Scanner entrada = new Scanner(System.in)) {
			for(int i=0; i<vector.length; i++) {
				
				//Solicito por pantalla que se ingrese un valor para cada posicion.
				System.out.print("Ingrese el valor para la posicion " + i + "> ");
				vector[i]=entrada.nextInt();
				
				//Almaceno informacion en las variables.
				if(vector[i]==3) {
					Count3=Count3+1; 
				}
				if(vector[i]==5){
					Count5=Count5+1;
				}
				if(vector[i]!=5 && vector[i]!=3) {
					CountDif=CountDif+1;
				}
				if(vector[i]<nMin) {
					nMin=vector[i];
				}
				if(vector[i]>nMax) {
					nMax=vector[i];
				}
			}
		}
		
		//Muestro la informacion por pantalla.
		System.out.println("El numero 3 se indico: " + Count3 + " veces.");
		System.out.println("El numero 5 se indico: " + Count5 + " veces.");
		System.out.println("El total de numeros diferentes a 3 y 5 es: " + CountDif);
		System.out.println("El numero menor es: " + nMin + " y el numero mayor es: " + nMax);

	}

}

package Todo_Code;
import java.util.Scanner;

public class Repetitivas {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		//Ejemplo while
		/*int cont = 0;
		int nMax = 0;
		
		System.out.print("Ingrese el maximo de vueltas: ");
		Scanner entrada = new Scanner (System.in);
		nMax = entrada.nextInt();

		while (cont <= nMax) {
			System.out.println("Estoy en la vuelta con while " + cont);
			cont = cont + 1;
		}
		*/
		
		//Ejemplo for
		int nMax = 0;
		
		System.out.print("Ingrese el maximo de vueltas: ");
		Scanner entrada = new Scanner (System.in);
		nMax = entrada.nextInt();
		
		for (int cont=0; cont<=nMax; cont++) {
			System.out.println("Estoy en la vuelta con for " + cont);
		}
	}
}

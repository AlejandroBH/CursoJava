package Todo_Code;
import java.util.Scanner;

public class SueldosDespensa {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		double sueldo = 0;
		int nCat = 0;
		String categoria = " ";

		do {

			System.out.println("------------------------------");
			System.out.println("Ingrese el numero de categoria");
			System.out.println("------------------------------");
			System.out.println("1. Repositor");
			System.out.println("2. Cajero");
			System.out.println("3. Supervisor");
			
			Scanner teclado = new Scanner (System.in);
			System.out.println(" ");
			System.out.print("Opcion: ");
			nCat = teclado.nextInt();

			switch(nCat){
				case 1:
					categoria = "Repositor";
					sueldo = 15890 + (15890*0.10);
				break;
				case 2:
					categoria = "Cajero";
					sueldo = 25630.89;
				break;
				case 3:
					categoria = "Supervisor";
					sueldo = 35560.20 - (35560.20*0.11);
				break;
			}
			
			if(nCat == 1 || nCat == 2 || nCat == 3) {
				System.out.println("El sueldo para un " + categoria + " es de: " + sueldo);
			}
			else {
				System.out.println(" ");
				System.out.println("La opcion ingresada no existe");
			}
			
		}while(nCat == 0 || nCat > 3);	

	}
}

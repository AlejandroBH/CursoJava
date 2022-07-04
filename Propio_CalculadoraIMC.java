package Todo_Code;

import java.util.Scanner;

public class Propio_CalculadoraIMC {

	public static void main(String[] args) {
		
		//Definimos variables
		double peso=0, estatura=0, resultado=0;
		int sexo;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Que sexo quiere calcular?");
			System.out.println("1 Hombre");
			System.out.println("2 Mujer");
			System.out.print("Ingresa la opcion: ");
			sexo=entrada.nextInt();
			
			switch (sexo) {
			case 1:
				System.out.println("Calcular IMC de Hombres");
				System.out.print("Ingrese su peso en Kilos: ");
				peso=entrada.nextDouble();
				System.out.print("Ingrese su estatura en metros: ");
				estatura=entrada.nextDouble();
				
				resultado = peso / (estatura * estatura);
				
				System.out.println("Su indice de masa corporal es: " + resultado);
				
				if(resultado < 20) {
					System.out.println("Tienes desnutricion");
				}
				else {
					if(resultado > 20 && resultado < 24.9) {
						System.out.println("Estas dentro de lo normal");
					}
					else {
						if(resultado > 25 && resultado < 29.9) {
							System.out.println("Tienes sobrepeso");
						}
						else {
							if(resultado > 30 && resultado < 40) {
								System.out.println("Tienes obesidad");
							}
							else {
								System.out.println("Tienes obesidad grave");
							}
						}
					}
				}
				break;
			case 2:
				System.out.println("Calcular IMC de Mujeres");
				System.out.print("Ingrese su peso en Kilos: ");
				peso=entrada.nextDouble();
				System.out.print("Ingrese su estatura en metros: ");
				estatura=entrada.nextDouble();
				
				resultado = peso / (estatura * estatura);
				
				System.out.println("Su indice de masa corporal es: " + resultado);
				
				if(resultado < 19) {
					System.out.println("Tienes desnutricion");
				}
				else {
					if(resultado > 19 && resultado < 23) {
						System.out.println("Estas dentro de lo normal");
					}
					else {
						if(resultado > 24 && resultado < 27) {
							System.out.println("Tienes sobrepeso");
						}
						else {
							if(resultado > 27 && resultado < 32) {
								System.out.println("Tienes obesidad");
							}
							else {
								System.out.println("Tienes obesidad grave");
							}
						}
					}
				}
				break;
				default:
					System.out.println("La opcion digitada no existe, intente nuevamente.");
					break;
			}
		} while (sexo!=1 && sexo!=2);
	}
}

package evPrimerBimestre;

import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int edad;
		boolean pagoEntrada = true;

		System.out.println("ingrese su edad: ");
		edad = entrada.nextInt();

		if (edad >= 18) {
			if (pagoEntrada) {

				System.out.println("entrada valida ");

			} else {
				System.out.println("entrada no abonada. no puede ingresar");
			}
		} else {
			System.out.println("no puede pasar sos menor");
		}

	}
}

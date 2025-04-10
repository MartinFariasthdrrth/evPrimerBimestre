package evPrimerBimestre;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int cafe;

		System.out.println("cual tipo de cafe desea entre 1-4: \t \nsi desea salir ponga el numero 5");
		cafe = datos.nextInt();

		switch (cafe) {

		case 1:
			System.out.println("café cortado");
			break;

		case 2:
			System.out.println("café Latte");
			break;

		case 3:
			System.out.println("café solo");
			break;

		case 4:
			System.out.println("café lágrima");
			break;
		case 5:
			System.out.println("A salido del programa");
			break;

		default:
			System.out.println("puso cualquier cosa");
			break;

		}

		System.out.println("Hasta la proxima");
	}
}

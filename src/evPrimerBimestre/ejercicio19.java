package evPrimerBimestre;

import java.util.Scanner;

public class ejercicio19 {

	
		public static void main(String[] args) throws InterruptedException {
			Scanner datos = new Scanner(System.in);
			int contrasena ;
			int intentos = 0;
				
			do  {
			
				System.out.println("Ingresa la contrasena: ");
				contrasena = datos.nextInt(); 
				
				if (contrasena!=2009) {
					Thread.sleep(1000);
			
					intentos++;
					
					if (intentos <3) {
						System.out.println("Volve a intentarlo. ");
						System.out.println("maximo de intentos son 3 vas a esta cantidad de intentos: "+intentos);
					}
					
				}
				
					 
			} while(contrasena != 2009 && intentos<3);
			
			if (contrasena==2009){
			System.out.println("Contrasena correcta.");
			}
			if (contrasena!=2009){
				System.out.println("Bloqueado. ");
			}
		

	}
}

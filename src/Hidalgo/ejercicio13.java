/*
 *Se debe generar un programa que nos indique si un horario ingresado por
un usuario es incorrecto. Para ello:
• La hora no debe superar el valor 24 (ya que después de 24hs, se
alcanza el día).
• El minuto no debe superar el valor 60 (ya que después de 60min, se
alcanza la hora).
• El segundo no debe superar el valor 60 (ya que después de 60seg, se
alcanza el minuto).
Si el valor ingresado es correcto, mostrar en pantalla que es un valor válido. Si
no lo es, mostrar en pantalla que es un valor incorrecto.
 */

 package Hidalgo;
import java.util.Scanner;
public class ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int hora = 24;
		int mn = 60;
		int sg = 60;
		int n1, n2, n3;
		System.out.println("indique que hora es: ");
		n1 = entrada.nextInt();
		System.out.println("indique los minutos: ");
		n2 = entrada.nextInt();
		System.out.println("indique ademas los segundos: ");
		n3 = entrada.nextInt();
 	
		
		if (n1>=hora || n2 >= mn || n3 >= sg) {
			System.out.println("horario incorrecto  \n"); // \n da salto de linea		 	
		}
		
		else{
			
			System.out.println("Valor ingresado es CORRECTO");
		}
		}
		

}

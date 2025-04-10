/*Elaborar un programa, el cuál indicará cuándo la batería de un celular se está
agotando (en %). Para ello:
• Recordar que la batería de un celular se mide en porcentaje (por
ejemplo: 70% de batería).
• Ingresar en el programa, NO por consola, que la batería comienza
teniendo 100% (¡no colocar el símbolo de “%” dentro de un int! Colocá
únicamente el número entero).
• Mientras la batería sea tenga mas del 0%, y menos del 100%, el celular
podrá funcionar.

ALGORITMOS Y ESTRUCTURA DE DATOS 8
• Hacé que la batería disminuya de a 1%. Para esto, usá un contador.
Recordar: para achicar de a 1 -> “variable – –” en vez de “variable + +”.
• Mostrar en pantalla el valor de la batería, con una espera de 20ms (mili
segundos) cada vez que disminuya 1%.
• Al llegar al 20%, indicar por pantalla “Batería baja”. Esperar 1 segundo
(1000 mili segundos) para indicar este mensaje.
• Al acabarse la batería, indicar por pantalla “Batería agotada”.
 */
package Farias;
import java.util.Scanner;
public class ejercicio21 {
public static void main(String[] args) throws InterruptedException {
	Scanner datos = new Scanner(System.in);
	
	int bateria = 100;
	
	
	while (bateria <= 100 && bateria > 0) {
		bateria--;
		Thread.sleep(20);
		System.out.println("tenes este porcentaje de bateria: "+bateria+"%");
		 if(bateria == 20){
			 Thread.sleep(1000);
			 System.out.println("Baja Batería");
			
		}
		 if(bateria == 0){
			 Thread.sleep(1000);
			 System.out.println("Batería Agotada");
			
		}
	}
	
	
	
	
	
	
}


}

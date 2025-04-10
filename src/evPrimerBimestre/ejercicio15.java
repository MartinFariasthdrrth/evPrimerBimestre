package evPrimerBimestre;
import java.util.Scanner;
public class ejercicio15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hora;
		int mn ;
		int sg ;

		System.out.println("indique que hora (0-24) ");
		hora = scanner.nextInt();
		System.out.println("indique los minutos (0-60) ");
		mn = scanner.nextInt();
		System.out.println("indique ademas los segundos(0-60) ");
		sg = scanner.nextInt();
 	
		String  validacion = "correcto";
		
		switch(hora) {
		case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23:
			
			break;
       		default:
       			validacion = "incorrecto";
		}
		switch(mn) {
		case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59:
			
			break;
		default:
   			validacion = "incorrecto";
		} 
		switch(sg) {
		case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59:
			
			break;
		default:
   			validacion = "incorrecto";
	}
		if(validacion.equals("correcto")) {
		System.out.println("el horario ingresado es correcto.");
		}else {
		System.out.println("el horario ingresado es incorrecto");
		}
	
	}

	
	}
	
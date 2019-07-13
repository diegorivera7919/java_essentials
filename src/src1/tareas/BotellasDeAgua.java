package src1.tareas;

import libs.Input;

public class BotellasDeAgua {
	
	public static void main(String[] arg) {
		//Calcula botellas x minuto que gasta un usuario en la ducha
		int minutos, botellas;
				
		//pedirle al usuario los minutos
		System.out.print("Cuantos minutos duras en la ducha?");
		minutos = Input.get_int();
		
		botellas = minutos * 12;
		
		System.out.print("minutos: " + minutos);
		System.out.print("botellas: " + botellas);

		}
	}


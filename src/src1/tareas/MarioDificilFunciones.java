package src1.tareas;

import libs.Input;

public class MarioDificilFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contadorLinea=1;
		int altura=0;
		
		System.out.println("Ingrese altura deseada");
		altura = Input.get_int();
		
		while(contadorLinea <= altura) {
			lineaGatitos(contadorLinea, altura);
			contadorLinea++;
		}
	}

	private static void lineaGatitos(int contadorLinea, int altura) {
		// TODO Auto-generated method stub
		imprimeEspacios(contadorLinea, altura);
		imprimeGatitos(contadorLinea);
		imprimeAbismo(contadorLinea);
		imprimeMasGatitos(contadorLinea);
	}

	private static void imprimeMasGatitos(int contadorLinea) {
		// TODO Auto-generated method stub
		int masGatitos = 0;
		while (masGatitos < contadorLinea) {
			System.out.print("#");
			masGatitos++;
		}
		System.out.println();
	}

	private static void imprimeAbismo(int contadorLinea) {
		// TODO Auto-generated method stub
		int abismo = 0;
		while (abismo < 2) {
			System.out.print(" ");
			abismo++;
		}
	}

	private static void imprimeGatitos(int contadorLinea) {
		// TODO Auto-generated method stub
		int gatitos = 0;
		while (gatitos < contadorLinea) {
			System.out.print("#");
			gatitos++;
		}
	}

	private static void imprimeEspacios(int contadorLinea, int altura) {
		// TODO Auto-generated method stub
		int espacios = altura-contadorLinea;
		while (espacios > 0) {
			System.out.print(" ");
			espacios--;
		}
	}

}

package loops;

public class PiramideGatitos {

	public static void main(String[] args) {
		// imprime piramide de gatitos
		int lineaGatitos = 1, gatitos; 
		
		while(lineaGatitos <= 5) {
			System.out.println();
			gatitos = 0;
			while (gatitos < lineaGatitos) {
				System.out.print("#");
				gatitos++;
			}
		lineaGatitos++;
		}

	}

}

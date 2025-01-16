package cursoJava;

public class ForComContinue {

	
	public static void main(String[] args) {
	
		
		/*estrutura de repetição FOR e CONTINUE*/
		
		for (int numero = 0; numero <= 100; numero++) {
			if (numero == 27 || numero == 57 || numero == 78) {
				System.out.println("Obaaa, encontrei o número " + numero);
				continue;
			}
		}

	}

}

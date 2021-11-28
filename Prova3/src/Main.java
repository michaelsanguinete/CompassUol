import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		AnalisaFrase frase = new AnalisaFrase();

		frase.analisa(scan.nextLine());

		frase.imprimeResultado();

		scan.close();
	}

}

package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exe12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		Locale.setDefault(Locale.US);

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0 ) {
			System.out.println("Eixo Y");
		}
		else if( y == 0.0) {
			System.out.println("Eixo X");
		}
		else if(x > 0.0 && y > 0.0) {
			System.out.println("Quadrante 1");
		}
		else if(x < 0.0 && y > 0.0) {
			System.out.println("Quadrante 2");
		}
		else if(x < 0.0 && y < 0.0) {
			System.out.println("Quadrante 3");
		}
		else {
			System.out.println("Quadrante 4");
		}
			
		sc.close();
	}

}

package práctica2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base, altura, area;
		Scanner entrada=new Scanner(System.in);
		entrada.useLocale(Locale.ENGLISH);
		System.out.println("Introduce la base del triángulo:" );
		base=entrada.nextDouble();
		System.out.println("Introduce la altura del triángulo:" );
		altura=entrada.nextDouble();
		area=base*altura/2;
		System.out.println("El área es:"+ area );
	}

}

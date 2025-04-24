package práctica2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double importe, descuento, total;
		Scanner entrada=new Scanner(System.in);
		entrada.useLocale(Locale.ENGLISH);
		System.out.println("Introduce el importe: ");
		importe=entrada.nextDouble();
		System.out.println("Introduce el descuento; ");
		descuento=entrada.nextDouble();
		total=(importe)-(importe*descuento)/100;
		System.out.println("El importe final es: "+ total + " euros ");
	}

}

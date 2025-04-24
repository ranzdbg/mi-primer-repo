package práctica2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,suma, resta, producto, módulo;
		Scanner entrada=new Scanner(System.in);
		entrada.useLocale(Locale.ENGLISH);
		System.out.println("Introduce un número:");
		a=entrada.nextDouble();
		System.out.println("Introduce otro número:");
		b=entrada.nextDouble();
		suma=a+b;
		resta=a-b;
		producto=a*b;
		módulo=a%b;
		System.out.println(" Suma: " + suma + " Resta: " + resta + " Producto: " + producto + " Módulo: "+ módulo);
		

	}

}

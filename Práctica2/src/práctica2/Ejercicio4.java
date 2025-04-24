package práctica2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1, nota2, nota3, media;
		Scanner entrada=new Scanner(System.in);
		entrada.useLocale(Locale.ENGLISH);
		System.out.println("Introduce una primera nota:" );
		nota1=entrada.nextDouble();
		System.out.println("Introduce una segunda nota:" );
		nota2=entrada.nextDouble();
		System.out.println("Introduce una tercera nota:" );
		nota3=entrada.nextDouble();
		media=(nota1+nota2+nota3)/3;
		System.out.println("La nota media es: "+ media);
	}

}

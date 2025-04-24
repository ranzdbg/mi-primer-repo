package práctica2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tarifa, preciofinal, descuento, discount;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el precio de tarifa: ");
		tarifa=entrada.nextDouble();
		System.out.println("Introduce el precio final: ");
		preciofinal=entrada.nextDouble();
		descuento=(preciofinal / tarifa)*100;
		discount=100-descuento;
		System.out.println("El descuento es: "+ discount + " porciento");
	}

}

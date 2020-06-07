package co.edu.unac;

import java.util.Scanner;
		/* Yuletsy Pabón */

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese la distancia a recorrer del 1er carro.");

		int d1 = scan.nextInt();

		System.out.println("Ingrese la distancia a recorrer del 2do carro.");

		int d2 = scan.nextInt();

		System.out.println("Ingrese la distancia a recorrer del 3er carro.");

		int d3 = scan.nextInt();

		Hilo h1 = new Hilo(d1, 1);
		Hilo h2 = new Hilo(d2, 2);
		Hilo h3 = new Hilo(d3, 3);

		h1.start();
		h3.start();
		h2.start();
	}
}

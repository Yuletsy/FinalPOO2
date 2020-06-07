package co.edu.unac;

public class Hilo extends Thread {
	
 private Integer iteraciones;
 private Integer carro;
 
 
public Hilo(Integer iteraciones, Integer carro) {
	super();
	this.iteraciones = iteraciones;
	this.carro = carro;
}
 
 public void run() {
	 for (int i = 1; i <= iteraciones; i++) {
		 System.out.println("El carro " + carro + " recorrió " + i + " km.");
	 }
	 System.out.println("El carro "  + carro + " hizo el correcto recorrido");
 }
 
}

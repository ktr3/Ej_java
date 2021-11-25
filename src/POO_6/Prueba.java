package POO_6;

import POO_5.Console;

public class Prueba {

	public static void main(String[] args) {

		System.out.println("Teclea el valor para x: ");
		int x = Console.readInt();
		System.out.println("Teclea el valor para y: ");
		int y = Console.readInt();
		Punto a1 = new Punto(x,y);
		Punto a2 = new Punto(6,-2);
		System.out.println(a1.Cuadrante());
		System.out.println(a2.Cuadrante());
	}

}

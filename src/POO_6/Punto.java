package POO_6;

import POO_5.Console;

public class Punto {

	private double x;
	  private double y;

	  // Constructor
	  public Punto(double x, double y) {
	    this.x = x;
	    this.y = y;
	  }

	

	  // metodos de acceso
	  public double getX() {
	    return x;
	  }

	  public double getY() {
	    return y;
	  }


	  // devuelve el cuadrante
	  public int Cuadrante() {
	    if (x > 0.0 && y > 0.0) {
	      return 1;
	    } else if (x < 0.0 && y > 0.0) {
	      return 2;
	    } else if (x < 0.0 && y < 0.0) {
	      return 3;
	    } else if (x > 0.0 && y < 0.0) {
	      return 4;
	    } else {
	      // (x==0.0 || y==0.0)
	      return 0;
	    }
	  }
	  
	  
	   
	  
}

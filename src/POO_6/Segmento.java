package POO_6;

public class Segmento {
	Punto p1;
	Punto p2;
	public Segmento (Punto punto1, Punto punto2) {
		this.p1=punto1;
		this.p2=punto2;
	}
 
	
	//Metodo que calcula la distancia
	public double calc_distancia() {
		float a =  (float) (p1.getX() - p2.getX() * (p1.getX() - p2.getX()));
		float b = (float) (p1.getY() - p2.getY() * (p1.getY() - p2.getY()));
		double d = Math.sqrt(a+b);
		System.out.println("La distancia es de "+ d);
		return d;
	}
	
 
}
	
	
	
	
	
			
	
	
	
			
	
	
	
	


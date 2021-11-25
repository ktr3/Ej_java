package POO_5;

public class Biblioteca {
	

	public static boolean espar (int n) {
		return (n%2==0);
	}

	public static double cantidaddigitos(int n) {
	            int cifras = 0;    //esta variable es el contador de cifras
	            while(n!=0){             //mientras a n le queden cifras
	                    n = n/10;         //le quitamos el último dígito
	                   cifras++;          //sumamos 1 al contador de cifras
	            }return cifras;
	}
	
	public static boolean tiene5(int n) {
		return (cantidaddigitos(n)>=5);
	}
	
	public static boolean multiplo10(){
		System.out.println("Introduce un numero");
		int n = Console.readInt();
		return(n%10==0);
	}	
	
}
	


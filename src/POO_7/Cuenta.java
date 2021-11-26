package POO_7;

public class Cuenta {
	
	private String NombreTitular;
	private double saldo;
	
	
	public Cuenta(String n, double s) {
		this.NombreTitular= n;
		this.saldo=s;
	}
	
	public Cuenta(String n) {
		this.NombreTitular = n;
		this.saldo = 0;
	}
	
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getTitular() {
		return this.NombreTitular;
	}
	
	
	public void deposito (double cantidad) {
		this.saldo=saldo+cantidad;
	}
		
	
	public void retiro (double cantidad) {
		this.saldo=saldo-cantidad;
		
	}
	
	
	public void mostrar() {
		System.out.println("el nombre del titular de la cuenta es: " + this.NombreTitular + "y su saldo es de :" +this.saldo);
		}
	
	
	
	
	}
	
	


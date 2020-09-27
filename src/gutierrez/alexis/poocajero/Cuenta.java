package gutierrez.alexis.poocajero;

import java.util.Random;

public class Cuenta {
	
	private String nombreTitular;
	private long numeroCuenta;
	private double saldo;
	
	public Cuenta() {
		this.nombreTitular = "";
		this.numeroCuenta = 0;
		this.saldo = 0.0;
	}
	
	public Cuenta(String nombre) {
		this.nombreTitular = nombre;
		Random rnd = new Random();
		this.numeroCuenta = Math.abs(rnd.nextLong());
		this.saldo = 0;
	}
	
	public Cuenta(String nombre, double saldo) {
		this.nombreTitular = nombre;
		Random rnd = new Random();
		this.numeroCuenta = Math.abs(rnd.nextLong());
		this.saldo = saldo;
	}
	
	public void ingresarSaldo(double cant) {
		if(cant > 0) {
			this.saldo += cant;
		}
		else {
			System.out.println("Por favor ingrese una cantidad válida");
		}
	}
	
	public void extraerSaldo(double cant) {
		if(cant > this.saldo) {
			System.out.println("No puede retirar más de lo que tiene la cuenta");
		}
		else {
			this.saldo -= cant;
		}
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
		
}
package gutierrez.alexis.poocajero;

import java.util.Scanner;

public class Cajero {

	public static void main(String[] args) {
		
		int opc;
		boolean cont = true;
		boolean existeCuenta = false;
		Scanner sc = new Scanner(System.in);
		Cuenta cuenta = new Cuenta();
		
		do {
			
			System.out.println("Bienvenido al cajero, favor de seleccionar una opcion y dar enter \n");
			System.out.println("1.- Crear cuenta vacía \n" + "2.- Crear cuenta saldo inicial \n" + "3.- Ingresar dinero \n" + "4.- Sacar dinero \n" + "5.- Ver saldo \n"
			+ "6.- Salir \n" + "7.- Hacer transferencia \n" + "8.- Funcion extra 1");
			try {
				opc = sc.nextInt();
				switch (opc) {
				case 1:
					if(existeCuenta) {
						System.out.println("Lo lamento, ya hay una cuenta creada!!");
					}
					else {
						System.out.println("Ingresa el nombre del titular de la cuenta: ");
						cuenta.setNombreTitular(sc.next());
						System.out.println("Genial! Se ha creado una cuenta a nombre de " + cuenta.getNombreTitular() + " con saldo de $" + cuenta.getSaldo() );
						existeCuenta = true;
					}
					break;
				case 2:
					if(existeCuenta) {
						System.out.println("Lo lamento, ya hay una cuenta creada!!");
					}
					else {
						System.out.println("Ingresa el nombre del titular de la cuenta: ");
						cuenta.setNombreTitular(sc.next());
						System.out.println("Ingresa el monto inicial: $");
						cuenta.setSaldo(sc.nextDouble());
						System.out.println("Genial! Se ha creado una cuenta a nombre de " + cuenta.getNombreTitular() + " con saldo de $" + cuenta.getSaldo() );
						existeCuenta = true;
					}
					break;
				case 3:
					if(existeCuenta) {
						System.out.println("Ingresar monto a añadir: $");
						cuenta.ingresarSaldo(sc.nextDouble());
					}
					else {
						System.out.println("Favor de tener una cuenta existente");
					}
					break;
				case 4:
					if(existeCuenta) {
						System.out.println("Ingresar monto a retirar: $");
						cuenta.extraerSaldo(sc.nextDouble());
						System.out.println("Su nuevo saldo es: $" + cuenta.getSaldo());
					}
					else {
						System.out.println("Favor de tener una cuenta existente");
					}
					break;
				case 5:
					if(existeCuenta) {
						System.out.println("El saldo de tu cuenta es: $" + cuenta.getSaldo());
					}
					else {
						System.out.println("Favor de tener una cuenta existente");
					}
					break;
				case 6:
					cont = false;
					System.out.println("Hasta la próxima!!!");
					break;
				case 7:
					System.out.println("Ingresa la cuenta a transferir");
					String cuentaTransferir = sc.next();
					if(cuentaTransferir.length() == 8) {
						System.out.println("Ingresa el monto a transferir");
						double montoTransferir = sc.nextDouble();
						if(montoTransferir <= cuenta.getSaldo()) {
							cuenta.extraerSaldo(montoTransferir);
							System.out.println("Transferencia exitosa! Su nuevo saldo es: $" + cuenta.getSaldo());
						}
						else {
							System.out.println("Lo sentimos, no cuenta con saldo suficiente");
						}
					}
					else {
						System.out.println("Longitud de cuenta no válida, intentarlo otra vez");
					}
					break;
				default:
					System.out.println("Elige una opción válida por favor!");
					break;
				}
			} catch (Exception e) {
				System.out.println("Ingresa una opción válida por favor!!!");
			}
			
		} while (cont);
		
		sc.close();
		
	}
}
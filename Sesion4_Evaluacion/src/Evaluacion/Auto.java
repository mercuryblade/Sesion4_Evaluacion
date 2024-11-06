package Evaluacion;

import java.util.Scanner;

public class Auto {

	private String marca;
	private String modelo;
	private String color;
	private double velocidadMaxima;
	private boolean encendido;
	static Scanner input = new Scanner(System.in);
	public Auto() {
		
	}
	public Auto(String marca, String modelo, String color, double velocidadMaxima, boolean encendido) {

		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidadMaxima = velocidadMaxima;
		this.encendido = encendido;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public void encenderAuto() {

		if (encendido) {

			System.out.println("Su auto ya se encuentra encendido");
		} else {

			System.out.println("Se ha encendido el auto");
			encendido = true;
		}

	}

	public void apagarAuto() {

		if (encendido) {
			
			System.out.println("Su auto se ha apagado correctamente");
			encendido = false;
		}
		else
		{
			
			System.out.println("su auto ya se encuentra apagado");
		}
		
	}

	public void acelerarAuto() {

		if (encendido) {
			
			System.out.println("El auto esta siendo acelerado");
			

		} else {
			System.out.println("No puedes acelerar, el auto se encuentra apagado");
		}
	}

	public  void Menu() {
		
		
	
		boolean salir = false;
		
		
		while (!salir) {
			System.out.println();
			System.out.println("Selecciona que desea hacer");
			System.out.println("1-. Enceder el auto");
			System.out.println("2-. Apagar Auto");
			System.out.println("3-. Acelerar Auto");
			System.out.println("4-. Salir");
			Scanner input = new Scanner(System.in);
			
			int opcion = input.nextInt();
			switch (opcion) {

			case 1: 
					encenderAuto();
				break;
			case 2:
					apagarAuto();
				break;
			case 3:
				acelerarAuto();
				break;
			case 4:
				
				salir = true;
				break;

			default:
				System.err.println("Ingresa una opcion valida");
			}

		}
		input.close();

	}
	
	public static void main(String[]args) {
		
		
		Auto auto1 = new Auto();
		System.out.println("Ingresa la marca del auto : ");
		String marca = input.nextLine();
		auto1.setMarca(marca);
		System.out.println("Ingresa el modelo del auto : ");
		String modelo = input.nextLine();
		auto1.setModelo(modelo);
		System.out.println("Ingresa el color del auto");
		String color = input.nextLine();
		auto1.setColor(color);
		System.out.println("Ingresa La velocidad maxima del vehiculo");
		double velocidad = input.nextDouble();
		auto1.setVelocidadMaxima(velocidad);
		auto1.setEncendido(false);
		System.out.println("\nFelicidades por su nuevo Auto [marca = "+auto1.getMarca()+", modelo = "+auto1.getModelo()+", color = "+auto1.getColor()+", velocidadMaxima = "+auto1.getVelocidadMaxima()+", encendido = "+auto1.isEncendido());
		auto1.Menu();
		
	}

}

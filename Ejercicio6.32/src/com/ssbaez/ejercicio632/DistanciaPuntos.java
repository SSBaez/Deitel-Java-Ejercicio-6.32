package com.ssbaez.ejercicio632;

import java.util.Scanner;

public class DistanciaPuntos {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Aplicacion que calcula la distancia entre dos puntos (x1, y1) y (x2, y2)");
		
		System.out.printf("%nIngrese el primer punto (x1, y1)%n%s",
						  "x1 = ");
		double x1 = input.nextDouble();
		System.out.printf("y1 = ");
		double y1 = input.nextDouble();
		
		System.out.printf("%nIngrese el segundo punto (x2, y2)%n%s",
				  		  "x2 = ");
		double x2 = input.nextDouble();
		System.out.printf("y2 = ");
		double y2 = input.nextDouble();
		System.out.printf("La distancia entre los puntos es: %.2f", distancia(x1, y1, x2, y2));
		
	}
	
	public static double distancia(double x1, double y1, double x2, double y2) {
		
		double distancia = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		
		return distancia;
	}

}

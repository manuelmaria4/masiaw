package es.cj.fundamento.datos;

import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class EjercicioUno {
	
	//Programa que realice conversi�n de grados Celsius a Farenheit.
	//Los grados Celsius debe introducirlos el usuario
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Grados Celsius:");
		double grados = sc.nextDouble();
		double farenheit = (grados * 1.8) + 32;
		System.out.println(grados + "grados celsius son" + farenheit + "grados farenheit");
		

}

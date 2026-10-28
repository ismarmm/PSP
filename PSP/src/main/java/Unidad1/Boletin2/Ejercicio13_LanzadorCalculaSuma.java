package Unidad1.Boletin2;

import java.io.IOException;

public class Ejercicio13_LanzadorCalculaSuma {

	public static void compilar() {
		try {
			ProcessBuilder pb = new ProcessBuilder("javac", "Ejercicio13_CalculaSuma.java");
			pb.inheritIO();
			int codigo = pb.start().waitFor();
			if (codigo == 0) {
				System.out.println("Compilación correcta.");
			} else {
				System.out.println("Error de compilación (código " + codigo + ").");
			}
		} catch (IOException | InterruptedException e) {
			System.out.println("No se pudo compilar: " + e.getMessage());
		}
	}

	public static void ejecutar(int numero, String tipo) {
		try {
			ProcessBuilder pb = new ProcessBuilder("java", "Ejercicio13_CalculaSuma", String.valueOf(numero), tipo);
			pb.inheritIO();
			int codigo = pb.start().waitFor();
			if (codigo != 0) {
				System.out.println("El subproceso terminó con código " + codigo);
			}
		} catch (IOException | InterruptedException e) {
			System.out.println("No se pudo ejecutar: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		compilar();
		ejecutar(10, "par");    
		ejecutar(10, "impar");  
	}
}
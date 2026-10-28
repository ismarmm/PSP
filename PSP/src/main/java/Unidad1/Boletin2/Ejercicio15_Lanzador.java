package Unidad1.Boletin2;

import java.io.IOException;

public class Ejercicio15_Lanzador {

	private static final String RUTA_JAR = "C:\\Users\\mmanu\\Desktop\\DAM 2\\psp\\psp26_27\\01-Unidad1\\src\\main\\java\\Boletin2\\Ejercicio15_CalculaMultiplicacionJAR.jar";

	public void lanzaMultiplicador(int inicio, int fin) {
		try {
			ProcessBuilder pb = new ProcessBuilder(
					"java", "-jar", RUTA_JAR,
					String.valueOf(inicio), String.valueOf(fin));

			pb.inheritIO(); 

			Process proceso = pb.start();
			proceso.waitFor(); 

		} catch (IOException | InterruptedException e) {
			System.out.println("Error al lanzar el jar: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		Ejercicio15_Lanzador l = new Ejercicio15_Lanzador();
		l.lanzaMultiplicador(1, 4);
		l.lanzaMultiplicador(5, 9);
	}
}
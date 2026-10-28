package Unidad1.EstudioEnCasa;

import java.io.IOException;

public class Estudio1_LanzadorSuma {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
		String classPath = System.getProperty("java.class.path");
		String[] comando = {"java", "-cp", classPath, "Unidad1.EstudioEnCasa.Estudio1_HijaSum", "8", "12"};
		ProcessBuilder pb = new ProcessBuilder(comando);
		
		pb.inheritIO();
		pb.start();
		
		Process p = pb.start();
		
		int exitCode = p.waitFor();
		
		System.out.println("Padre: La hija ha terminado con código de salida: " + exitCode);
	}
}

package Unidad1.Ejemplos;

import java.io.File;
import java.io.IOException;

public class EjecutarProgramaPython {
	
	public static void main(String[] args) {
		
		
		File rutaPrograma = new File("C:\\Users\\mmarf\\Desktop\\DAM2\\psp\\psp26_27\\01-Unidad1\\src/main/resources/Unidad1/pythonEjecutableEjemplo.py");
		
		ProcessBuilder p = new ProcessBuilder("python", rutaPrograma.getAbsolutePath());
		
		p.inheritIO();
		
		try {
			Process proceso = p.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

package Amazon;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class LanzadorFiltrarPorProvincia {
	
	/* SOLO DIOS Y YO EN EL PASADO SABEMOS COMO FUNCIONA ESTE CODIGO, NO TOCAR
	 * 
	 * EL SIGUIENTE CODIGO NO COGE LAS CIUDADES CON TILDE POR QUE LA CONSOLA DE ECPLISE ES UNA MIERDA
	 * 
	 * EL PROGRAMA FUNCIONA, F*CK ECLIPSE, <3 IntellijiJ
	 * 
	 * */
	
	
	public static void main(String[] args) {
		
		LanzadorFiltrarPorProvincia LFPP = new LanzadorFiltrarPorProvincia();
		String[] provincias = {"Sevilla", "Córdoba", "Huelva", "Cádiz", "Jaén", "Almería","Granada", "Málaga"}; 
		
		
		
		try {
			LFPP.compila("src/main/java/Amazon/FiltrarPorProvincia.java", "target/classes", "Amazon.FiltrarPorProvincia");
			
			List<Integer> numerosSumar = new ArrayList<Integer>(); 
			
			for(String provincia : provincias) {
				
				numerosSumar.add(LFPP.ejecuta("target/classes", "Amazon.FiltrarPorProvincia", provincia));
			}
			
			int numeroTotal = 0;
			
			for (Integer numero : numerosSumar) {
				
				numeroTotal += numero;
			}
			
			System.out.println("Total pedidos: " + numeroTotal);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void compila(String rutaCompila, String rutaClass, String nombreClass) throws IOException, InterruptedException {
		File clase = new File(rutaClass + '/' + nombreClass);
		
		if (!clase.exists()) {	
			ProcessBuilder pb = new ProcessBuilder("javac", "-d", rutaClass,  rutaCompila);
			Process p = pb.start();
			int exit = p.waitFor();
			
//			System.out.println("Codigo de salida: " + exit);
		}
		else {
			System.out.println("El archivo ya esta compilado");
		}
	}
	
	public int ejecuta(String ruta, String nombreClass, String provinciaBuscar) throws IOException, InterruptedException {
		String[] comando = {"java", "-cp", ruta, nombreClass, provinciaBuscar};
		ProcessBuilder pb = new ProcessBuilder(comando);

		Process p = pb.start();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String linea = br.readLine();
		
		int contador = 0;
		
		while (linea != null) {
			
			if(linea.contains(provinciaBuscar)) {
				
				System.out.println(linea);
				contador = Integer.parseInt(linea.split(":")[1]);
			}
			
			linea = br.readLine();
		}
		
		int exit = p.waitFor();
		
//		System.out.println("Codigo de salida: " + exit);
		
		return contador;
	}
}

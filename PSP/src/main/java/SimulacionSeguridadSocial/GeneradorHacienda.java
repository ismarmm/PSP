package SimulacionSeguridadSocial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class GeneradorHacienda {

	public static void main(String[] args) throws FileNotFoundException {
		
		File fichero = new File(args[0]);
		
		FileReader fr = new FileReader(fichero);
		Scanner sc = new Scanner(fr);
		sc.useLocale(Locale.ENGLISH);

		List<String> datosPersonas = new ArrayList<String>();
		
		while(sc.hasNextLine()) {
			
			String datoActual = sc.nextLine();
			datosPersonas.add(datoActual);
			
		}
		
		List<String> personasNSS = new ArrayList<String>();
		int contadorLineasTotal = 0;
		int contadorNSS = 0;
		
		for(String dato : datosPersonas) {
			
			contadorLineasTotal++;
			
			if(dato.startsWith("AN") ) {
				
				contadorNSS++;
				personasNSS.add(dato);
			}
			
		}
		
		System.out.println(contadorLineasTotal);
		System.out.println(contadorNSS);
		
		File file = new File("src/main/resources/SimulacionSeguridadSocial/" + "NSSs.txt");
		PrintWriter pw = new PrintWriter(file);
		pw.println(personasNSS);
		System.out.println("Archivo escrito correctamente");
		pw.close();
	}
}

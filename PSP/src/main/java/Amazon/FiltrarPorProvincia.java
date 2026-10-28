package Amazon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FiltrarPorProvincia {

	public static void main(String[] args) {
		
		String provinciaFiltrar = args[0];
		
		FiltrarPorProvincia fpp = new FiltrarPorProvincia();
		
		try {
			fpp.leerArchivo("src/main/resources/Amazon/pedidos.txt", provinciaFiltrar);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public void leerArchivo(String ruta, String provinciaFiltrar) throws FileNotFoundException {
		File f = new File(ruta);
		
		FileReader fr = new FileReader(f);
		Scanner sc = new Scanner(fr);
		sc.useLocale(Locale.ENGLISH);
		
		File file = new File("src/main/resources/Amazon/" + provinciaFiltrar + ".txt");
		PrintWriter printwriter = new PrintWriter(file);

		int contador = 0;
		
		while(sc.hasNextLine()) {
			String provincia = sc.nextLine();
			
			if(provincia.contains(provinciaFiltrar)) {
				
				contador++;
				printwriter.println(provincia);
			}
			
		}
		
		System.out.println(provinciaFiltrar + ":" + contador);
		printwriter.close();
		
	}
}

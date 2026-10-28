package Unidad1.Boletin3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2_AnalizadorTemperaturas {
	public static void main(String[] args) throws FileNotFoundException {
		Ejercicio2_AnalizadorTemperaturas at = new Ejercicio2_AnalizadorTemperaturas();
		
		String rutaLeer = args[0];
		int umbral = Integer.parseInt(args[1]);
		
		List<Integer> temperaturas;
		temperaturas = at.leerArchivo(rutaLeer);
		int recuentoSupera = at.cuentaSuperaUmbral(temperaturas, umbral);
		System.out.println(recuentoSupera);
		
		at.escribeFichero(umbral, recuentoSupera);
	
	}
	
	public List<Integer> leerArchivo(String ruta) throws FileNotFoundException {
		File f = new File(ruta);
		List<Integer> temps = new ArrayList<Integer>();
		
		FileReader fr = new FileReader(f);
		Scanner sc = new Scanner(fr);
		sc.useLocale(Locale.ENGLISH);

		while(sc.hasNextLine()) {
			String temp = sc.nextLine();
			temps.add(Integer.parseInt(temp));
		}
		return temps;
	}
	
	public int cuentaSuperaUmbral(List<Integer> temps, int umbral) {
		int contador = 0;
		for (Integer temp : temps) {
			if (temp >= umbral) {
				contador++;
			}
		}
		return contador;
	}
	
	public void escribeFichero(int umbral, int superado) throws FileNotFoundException {
		File file = new File("C:/Users/mmarf/Desktop/DAM2/psp/psp26_27/01-Unidad1/src/main/java/Unidad1/Boletin3/" + umbral + ".txt");
		PrintWriter printwriter = new PrintWriter(file);
		printwriter.println(superado);
		printwriter.close();
	}
	
}
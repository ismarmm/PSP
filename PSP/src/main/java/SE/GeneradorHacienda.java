package SE;

import java.io.File;
import java.io.IOException;

public class GeneradorHacienda {
	
	static void main(String[] args) throws IOException, InterruptedException {
		GeneradorHacienda g = new GeneradorHacienda();
		
		//aqui lo haria con un input o un scanner lo que quisiese para que el usuario me escribiese la ruta donde esta el archivo a leer como args[0]
		//aqui le pondria la ruta a escribir (el output del programa) como args [1.]
		//incluso podria modificar el programa con un tercer parametro y no hardcodear el AN sino pasarlo como parametro para 
		// en un futuro no tener que tocar el codigo simplemente cambiar el parametro 
		// odio el puto eclipse
	}
	
	
	
public void compilaContadorPalabras(String ruta, String rutaclase, String nombreClass)throws IOException, InterruptedException {
	        File clase = new File(rutaclase, nombreClass);

	        if (!clase.exists()) {
	            ProcessBuilder pb = new ProcessBuilder("javac", "-d", rutaclase, ruta);
	            Process p = pb.start();
	            p.waitFor();
	        }
	        else {
	            System.out.println("Esto ya esta compilado");
	        }
	    }
	
	
	
	
    public void ejecutaContadorPalabras(String ruta, String nombreClass, String parametro1, String parametro2) throws IOException, InterruptedException {

        String[] comando = {"java", "-cp", ruta, nombreClass, parametro1, parametro2};
        ProcessBuilder pb = new ProcessBuilder(comando);
        pb.redirectErrorStream(true);
        pb.inheritIO();

        Process p = pb.start();
        int exit = p.waitFor();

        System.out.println("codigo de salida" + exit);
    }
}



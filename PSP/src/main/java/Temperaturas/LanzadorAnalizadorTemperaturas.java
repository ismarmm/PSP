package Temperaturas;

import java.io.File;
import java.io.IOException;

public class LanzadorAnalizadorTemperaturas {
    public static void main(String[] args) throws IOException, InterruptedException {
        LanzadorAnalizadorTemperaturas l =  new LanzadorAnalizadorTemperaturas();
        String ruta = "C:\\Users\\isma\\Downloads\\elden_ring_proyecto\\src\\Temperaturas\\AnalizadorTemperaturas.java";
        String rutaclase = "C:\\Users\\isma\\Downloads\\elden_ring_proyecto\\out\\production\\elden_ring_proyecto";
        String nombreClass = "Boletin2runtinme.AnalizadorTemperaturas";
        String parametro1 = "C:\\Users\\isma\\Downloads\\elden_ring_proyecto\\src\\resources\\datos.txt";
        String parametro2 = "25"; // esto ponerlo como in poner el umbral y simplemente ese umbral meterlo en un arrraylist y pasarle como parametro2 la posicion i hasta que acabe el bucle (un for tipico no hace falta aslist)
        String parametro3 ="25.txt";
        l.ejecutaAnalizadorTemperaturas(rutaclase, nombreClass, parametro1, parametro2, parametro3);
    }


    public void compilaContadorPalabras(String ruta, String rutaclase, String nombreClass) throws IOException, InterruptedException {

        File clase = new File(rutaclase, nombreClass);

        if (!clase.exists()) {
            ProcessBuilder pb = new ProcessBuilder("javac", "-d", rutaclase, ruta);
            Process p = pb.start();
            p.waitFor();
        }
        else {
            System.out.println("Esto ya esta compilau");
        }
    }

    public void ejecutaAnalizadorTemperaturas(String ruta, String nombreClass, String parametro1, String parametro2, String parametro3)
            throws IOException, InterruptedException {

        String[] comando = {"java", "-cp", ruta, nombreClass, parametro1, parametro2, parametro3};
        ProcessBuilder pb = new ProcessBuilder(comando);
        pb.redirectErrorStream(true);
        pb.inheritIO();

        Process p = pb.start();
        int exit = p.waitFor();

        System.out.println("codigo de salida" + exit);
    }
}



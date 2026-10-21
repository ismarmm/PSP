package Boletin2runtinme;

import java.io.File;
import java.io.IOException;

public class LanzadorContadoresPalabras {

    static void main(String[] args) throws IOException, InterruptedException {
        LanzadorContadoresPalabras l = new LanzadorContadoresPalabras();

        String ruta = "C:\\Users\\isma\\Downloads\\elden_ring_proyecto\\src\\Boletin2runtinme\\ProcesadorFichero.java";
        String rutaclase = "C:\\Users\\isma\\Downloads\\elden_ring_proyecto\\out\\production\\elden_ring_proyecto";
        String nombreClass = "Boletin2runtinme.ProcesadorFichero";
        String parametro1 = "C:\\Users\\isma\\Downloads\\elden_ring_proyecto\\texto_servicio_hilo_proceso_multihilo_concurrencia.txt";
        String parametro2 = "servicio";
        String parametro3 ="a.txt";

        l.ejecutaContadorPalabras(rutaclase, nombreClass, parametro1, parametro2, parametro3);
    }

    public void compilaContadorPalabras(String ruta, String rutaclase, String nombreClass)
            throws IOException, InterruptedException {

        File clase = new File(rutaclase, nombreClass.replace('.', '/') + ".class");

        if (!clase.exists()) {
            ProcessBuilder pb = new ProcessBuilder("javac", "-d", rutaclase, ruta);
            Process p = pb.start();
            p.waitFor();
        } else {
            System.out.println("Esto ya esta compilau");
        }
    }

    public void ejecutaContadorPalabras(String ruta, String nombreClass, String parametro1, String parametro2, String parametro3)
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
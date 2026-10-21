package Boletin2runtinme;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ProcesadorFichero {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String nombreFicheroEntrada = args[0];
        String palabra = args[1];
        String nombreFicheroResultado = args[2];
        contarPalabras(nombreFicheroEntrada, palabra, nombreFicheroResultado);
    }

    public static void contarPalabras(String ruta, String palabra, String resultado) throws IOException {
        Scanner in = null;
        int contador = 0;
        try {
            // abre el fichero
            FileReader fichero = new FileReader(ruta);
            //Se crea el flujo
            in = new Scanner(fichero);
            // lee el fichero
            while (in.hasNext()) {
                String palabraEntrada = in.next();
                if (palabraEntrada.equals(palabra)) {
                    contador++;
                }
            }
        } finally {
            if (in != null) {
                in.close();
                // OjO Al cerrar el Scanner cierra también el FileReader que envuelve.
            }
        }
        FileWriter ficheroSalida = new FileWriter(resultado, StandardCharsets.UTF_8); // con esto simplemente inicio un "escritor" con el contenido de resultado
        PrintWriter escritor = new PrintWriter(ficheroSalida); // con esto simplemente le meto el contenido de
        escritor.println(contador);
        escritor.close();
    }
}
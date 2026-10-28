package Temperaturas;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class AnalizadorTemperaturas {
    public static void main(String[] args) throws IOException {
        String nombreFichero = args[0];
        String valorUmbral = args[1];
        String resultado = args[2];
        AnalizadorTemperaturas an = new AnalizadorTemperaturas();
        an.contadordias(nombreFichero, Integer.parseInt(valorUmbral), resultado);
    }
    public void contadordias(String ruta, int valor, String resultado) throws IOException {
        Scanner in = null;
        int contador = 0;
        try{
            FileReader fichero = new FileReader(ruta);
            in = new Scanner(fichero);
            while (in.hasNextLine()){
                int numero = Integer.parseInt(in.nextLine());
                if(numero>=valor){
                    contador++;
                }
            }
        }
        finally {
            if (in != null) {
                in.close();
            }
        }
        FileWriter ficheroSalida = new FileWriter(resultado, StandardCharsets.UTF_8); // me quedo con la ruta donde quiero hacer el archivo e inicializo FileWrier
        PrintWriter escritor = new PrintWriter(ficheroSalida); //inicializo el pintor y le doy el objeto ya creado de filewriter (la ruta)
        escritor.println("Numero de veces" + contador+ "Numero elegido" + valor);
        escritor.close();
    }



}

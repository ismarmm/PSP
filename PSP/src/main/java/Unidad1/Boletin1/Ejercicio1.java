package Unidad1.Boletin1;

import java.io.IOException;

public class Ejercicio1 {

    public static void main(String[] args) {

        String[] webEjecutar = new String[]{"C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe", "https://educacionadistancia.juntadeandalucia.es/centros/sevilla"};


            try {
            	
				Runtime.getRuntime().exec(webEjecutar);
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}


        

    }

}
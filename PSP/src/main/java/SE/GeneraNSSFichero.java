package SE;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class GeneraNSSFichero {
	 public static void main(String[] args) throws IOException {
	    String nombreFichero = args[0];
	    String rutaTXT = args[1];
	 }

	 
	   public List<String> separador(String ruta, String destino) throws FileNotFoundException {
	        Scanner in = null;
	        List<String> nss = new ArrayList();
	        int contador = 0;
	        try {
	            FileReader fichero = new FileReader(ruta);
	            in = new Scanner (fichero);
	            while (in.hasNextLine()) {
	                String separacion = in.nextLine().substring(0,2);{
	                    if(separacion == "AN");
	                    ///aqui lo añadiria a la lista(nss.add(in.nextLine)); que mi ide se niega a generar al tener la comprobacion delante
	                    /// serian los NIE ya que empiezan por AN, el resto lo podria meter en otra lista si se nos requiriese en un futuro
	                    /// esto lo terminaria añadiendo con FileWriter y PrintWriter a un archivo txt que recibiria el destino que luego 
	                    /// tambien pasariamos por parametro (la ruta) dentro del padre 
	                    /// revisa los ultimos 2 minutos de la puta grabacion y descojonate con lo que me acaba de pasar me cago en la puta mierda esta me hizo
	                    /// mal el import de la puta lista de los cojones 
	                }
	                
	            }
	        }    
	        finally {
	            if (in != null) {
	                in.close();
	            }
	        }	        

	        return nss;
	    }
	   
}

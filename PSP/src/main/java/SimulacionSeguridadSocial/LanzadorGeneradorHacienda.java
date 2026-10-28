package SimulacionSeguridadSocial;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LanzadorGeneradorHacienda {

    public LanzadorGeneradorHacienda() throws java.io.IOException {
    }

	
	String[] comando = {"java", "-cp", "target/classes", "SimulacionSeguridadSocial.GeneradorHacienda", "C:\\Users\\mmarf\\Desktop\\DAM2\\psp\\psp26_27\\01-SimulacionExamen\\Simulacion\\src\\main\\java"};
	ProcessBuilder pb = new ProcessBuilder(comando);

	Process p = pb.start();
	BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
}

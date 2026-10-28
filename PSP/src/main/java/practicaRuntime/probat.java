package practicaRuntime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class probat {

    private static final Logger logger = LogManager.getLogger(probat.class);

    private static final String directorioGenerarClasses = "target\\classes";
    private static final String rutaSourceJava = "src\\main\\java\\practicaRuntime\\ej3python.java";

    public int ejecutaClase(String clase) {
        int resultado = -1;
        try {
            String[] comando = { "java", "-cp", directorioGenerarClasses, clase};
            ProcessBuilder pb = new ProcessBuilder(comando);
            pb.redirectErrorStream(true);
            pb.inheritIO();
            Process proceso = pb.start();
            resultado = proceso.waitFor();
            logger.debug("java terminó con código {}", resultado);
        }
        catch (Exception e) {
            logger.error(e.getMessage());
        }

        return resultado;
    }

    public int lanzaCompilador(String rutaFicheroFuente, String rutaParaGenerarClass) {
        int resultado = -1;

        try {
            String[] comando = {"javac", "-d",rutaParaGenerarClass, rutaFicheroFuente};
            ProcessBuilder pb = new ProcessBuilder(comando);
            pb.inheritIO();
            Process proceso = pb.start();
            resultado = proceso.waitFor();
            logger.debug("javac terminó con código {}", resultado);
        }
        catch (Exception e) {
            logger.error(e.getMessage());
        }

        return resultado;
    }

    public static void main(String[] args) {
        probat lanzador = new probat();

        int codigo = lanzador.lanzaCompilador(rutaSourceJava, directorioGenerarClasses);

        if (codigo == 0) {
            lanzador.ejecutaClase("practicaRuntime.ej3python");
        }
    }
}
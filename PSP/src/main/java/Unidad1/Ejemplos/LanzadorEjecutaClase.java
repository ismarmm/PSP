package Unidad1.Ejemplos;

public class LanzadorEjecutaClase {

    private final static String directorioGenerarClasses = "target\\classes";

    public int ejecutaClase(String clase) {
        int resultado = -1;
        String claseCompleta = clase;

        try {
            String[] comando = {
                "java",
                "-cp",
                directorioGenerarClasses,
                claseCompleta
            };

            ProcessBuilder pb = new ProcessBuilder(comando);
            pb.redirectErrorStream(true);
            pb.inheritIO();

            Process proceso = pb.start();

            resultado = proceso.waitFor();

            System.out.println(resultado);

        } catch (Exception e) {
           
            System.out.println(e.getMessage());
        }

        return resultado;
    }

    public static void main(String[] args) {
        LanzadorEjecutaClase lanzador = new LanzadorEjecutaClase();

        int resultado = lanzador.ejecutaClase("Ejemplos.HolaMundo");

        System.out.println("Resultado final: " + resultado);
    }
}
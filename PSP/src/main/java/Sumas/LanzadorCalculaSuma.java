package Sumas;

public class LanzadorCalculaSuma {

    public static void main(String[] args) {
        LanzadorCalculaSuma lanzador = new LanzadorCalculaSuma();

        lanzador.compila();
        lanzador.ejecuta("par", "10");
        lanzador.ejecuta("impar", "10");
    }

    public void compila() {
        String ruta = "src\\CalculaSuma.java";
        String destino = "bin";

        try {
            ProcessBuilder pb = new ProcessBuilder("javac", "-d", destino, ruta);

            pb.inheritIO();
            Process proceso = pb.start();
            proceso.waitFor();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ejecuta(String tipo, String numero) {
        String ruta = "bin";
        String clase = "CalculaSuma";

        try {
            ProcessBuilder pb = new ProcessBuilder("java", "-cp", ruta, clase, tipo, numero);

            pb.inheritIO();
            Process proceso = pb.start();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
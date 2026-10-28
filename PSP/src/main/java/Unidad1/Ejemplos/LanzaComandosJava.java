package Unidad1.Ejemplos;

public class LanzaComandosJava {

    private static final String directorioGenerarClasses = "C:\\Users\\mmarf\\Desktop\\DAM2\\psp\\psp26_27\\01-Unidad1\\target\\classes\\Ejemplos";
    private static final String rutaSourceJava = "src\\main\\java\\unidad1\\ProcesoHijo.java";

    public int lanzaCompilador(String rutaFicheroFuente, String rutaParaGenerarClass) {
        int exit = 0;

        try {
            String[] comando = {
                "javac",
                "-d",
                rutaParaGenerarClass,
                rutaFicheroFuente
            };

            ProcessBuilder pb = new ProcessBuilder(comando);
            pb.inheritIO(); // Las salidas y los errores se muestran por consola

            Process proceso = pb.start();
            exit = proceso.waitFor(); // Esperamos a que javac termine

            System.out.println("javac terminó con código " + exit);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            exit = -1;
        }

        return exit;
    }

    public static void main(String[] args) {
        LanzaComandosJava l = new LanzaComandosJava();

        int codigo = l.lanzaCompilador(
            rutaSourceJava,
            directorioGenerarClasses
        );

        System.out.println("Código de salida: " + codigo);
    }
}
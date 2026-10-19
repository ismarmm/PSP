package practicaRuntime;
import java.io.File;
import java.io.IOException;

public class ej3python {

    public static void main(String[] args) {
        File rutaPrograma = new File("C:\\Users\\alumno\\IdeaProjects\\PSP\\src\\main\\resources\\a.py");
        ProcessBuilder p = new ProcessBuilder("python", rutaPrograma.getAbsolutePath());
        p.inheritIO();

        try {
            Process proceso = p.start();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}


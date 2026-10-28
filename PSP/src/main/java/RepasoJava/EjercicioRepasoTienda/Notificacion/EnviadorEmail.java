package RepasoJava.EjercicioRepasoTienda.Notificacion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EnviadorEmail {

    private static final Logger logger = LogManager.getLogger(EnviadorEmail.class);

    public void enviarEmail(String email, String asunto, String texto) {
        logger.debug("EMAIL a " + email + " | Asunto: " + asunto + " | Texto: " + texto);
    }
}

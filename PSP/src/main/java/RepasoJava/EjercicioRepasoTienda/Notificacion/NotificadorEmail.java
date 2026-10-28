package RepasoJava.EjercicioRepasoTienda.Notificacion;

import RepasoJava.EjercicioRepasoTienda.Modelo.*;

public class NotificadorEmail implements INotificadorRepo {

    private final EnviadorEmail enviador = new EnviadorEmail();

    @Override
    public void notificar(Cliente cliente, String asunto, String mensaje) {
        enviador.enviarEmail(cliente.getCorreoElectronico(), asunto, mensaje);
    }
}

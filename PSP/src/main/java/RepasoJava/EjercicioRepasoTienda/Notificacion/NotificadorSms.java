package RepasoJava.EjercicioRepasoTienda.Notificacion;

import RepasoJava.EjercicioRepasoTienda.Modelo.*;

public class NotificadorSms implements INotificadorRepo {

    private final EnviadorSms enviador = new EnviadorSms();

    @Override
    public void notificar(Cliente cliente, String asunto, String mensaje) {
        enviador.enviarSms(cliente.getNumTelefono(), asunto + ". " + mensaje);
    }
}

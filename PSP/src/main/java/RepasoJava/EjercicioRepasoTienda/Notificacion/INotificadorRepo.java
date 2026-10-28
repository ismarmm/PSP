package RepasoJava.EjercicioRepasoTienda.Notificacion;

import RepasoJava.EjercicioRepasoTienda.Modelo.Cliente;

public interface INotificadorRepo {
	
	 void notificar(Cliente cliente, String asunto, String mensaje);

}

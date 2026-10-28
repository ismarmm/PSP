package RepasoJava.EjercicioRepasoTienda.Repositorio;

import java.util.ArrayList;
import java.util.List;
import RepasoJava.EjercicioRepasoTienda.Modelo.*;

public class NotificadorRepo {
	
	List<Notificador> notificadorRepo;
	
	public void agregarPedido() {

		

	}

	

	public void leerPedido() {

		

	}

	

	

	public void modificarPedido() {

		

	}

	

	public void eliminarPedido() {

		

	}



	public NotificadorRepo() {
		super();
		this.notificadorRepo = new ArrayList<Notificador>();
	}



	public List<Notificador> getNotificadorRepo() {
		return notificadorRepo;
	}



	public void setNotificadorRepo(List<Notificador> notificadorRepo) {
		this.notificadorRepo = notificadorRepo;
	}



	@Override
	public String toString() {
		return "NotificadorRepo [notificadorRepo=" + notificadorRepo + "]";
	}
	
	

}

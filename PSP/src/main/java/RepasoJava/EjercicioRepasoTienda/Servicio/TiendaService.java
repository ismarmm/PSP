package RepasoJava.EjercicioRepasoTienda.Servicio;

import java.awt.List;

import RepasoJava.EjercicioRepasoTienda.Repositorio.NotificadorRepo;
import RepasoJava.EjercicioRepasoTienda.Repositorio.PedidoRepositorio;

public class TiendaService {
	
	private PedidoRepositorio pedidoRepo;
	private NotificadorRepo notificadorRepo;
	
	
	public TiendaService(PedidoRepositorio pedidoRepo, NotificadorRepo notificadorRepo) {
		super();
		this.pedidoRepo = new PedidoRepositorio();
		this.notificadorRepo = new NotificadorRepo();
	}
	
	

}

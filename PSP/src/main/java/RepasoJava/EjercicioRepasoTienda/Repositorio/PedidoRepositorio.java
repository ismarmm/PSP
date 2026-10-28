package RepasoJava.EjercicioRepasoTienda.Repositorio;

import java.util.HashSet;
import java.util.Set;
import RepasoJava.EjercicioRepasoTienda.Modelo.*;

public class PedidoRepositorio {

	
	Set<Pedido> pedidos;
	
	
	public void agregarPedido() {

		

	}

	

	public void leerPedido() {

		

	}

	

	

	public void modificarPedido() {

		

	}

	

	public void eliminarPedido() {

		

	}
	
	

	public PedidoRepositorio() {
		super();
		this.pedidos = new HashSet<Pedido>();
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "PedidoRepositorio [pedidos=" + pedidos + "]";
	}
	
	
	
}

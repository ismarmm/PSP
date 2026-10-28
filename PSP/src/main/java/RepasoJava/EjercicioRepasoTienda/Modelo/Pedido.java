package RepasoJava.EjercicioRepasoTienda.Modelo;

import java.util.Objects;

public class Pedido {

	
	private int contador = 0;
	private int id;
	private Cliente cliente;
	private EstadoPedido estadoPedido;
	
	public Pedido(int id, Cliente cliente, EstadoPedido estadoPedido) {
		super();
		contador++;
		this.id = contador;
		this.cliente = cliente;
		this.estadoPedido = EstadoPedido.PENDIENTE;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public EstadoPedido getEstadoPedido() {
		return estadoPedido;
	}

	public void setEstadoPedido(EstadoPedido estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(cliente, Integer.valueOf(contador), estadoPedido, Integer.valueOf(id));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(cliente, other.cliente) && contador == other.contador
				&& estadoPedido == other.estadoPedido && id == other.id;
	}

	@Override
	public String toString() {
		return "Pedido [contador=" + contador + ", id=" + id + ", cliente=" + cliente + ", estadoPedido=" + estadoPedido
				+ "]";
	}
	
	
	
	
	
}

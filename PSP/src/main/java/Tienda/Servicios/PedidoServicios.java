package Tienda.Servicios;
import Tienda.Estado;
import Tienda.Modelo.Cliente;
import Tienda.Modelo.Pedido;
import java.util.HashSet;
import java.util.Set;

public class PedidoServicios {
    private Set<Pedido> pedidos = new HashSet<>();

    public void crearPedido(Cliente cliente, int importe, Estado estado) {
        Pedido pedido = new Pedido(cliente, importe, estado);
        pedidos.add(pedido);
    }
    public void BorrarPedido(Cliente cliente, int importe) {
        for (Pedido pedido : pedidos) {
            if(pedido.getCliente().getCorreo().equals(cliente.getCorreo())){
                pedidos.remove(pedido);
            }
        }
    }

    public void ModificarEstadoPedido(Cliente cliente, int importe, Estado estado) {
        for (Pedido pedido : pedidos) {

        }

    }
}

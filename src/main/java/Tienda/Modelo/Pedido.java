package Tienda.Modelo;

import Tienda.Estado;

public class Pedido {
    private static int id = 1;
    private Cliente cliente;
    private int importe;
    private Estado estado;

    public Pedido(Cliente cliente, int importe, Estado estado) {
        this.cliente = cliente;
        this.importe = importe;
        this.estado = Estado.PENDIENTE;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Pedido.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}

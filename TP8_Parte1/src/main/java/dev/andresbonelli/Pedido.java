package dev.andresbonelli;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private final String codigoPedido;
    private List<Producto> productos;
    private String estado;
    private List<Notificable> observadores;

    public Pedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
        this.productos = new ArrayList<>();
        this.observadores = new ArrayList<>();
        this.estado = "PENDIENTE";
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarObservadores();
    }

    public void agregarObservador(Notificable observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Notificable observador) {
        observadores.remove(observador);
    }

    private void notificarObservadores() {
        for (Notificable observador : observadores) {
            observador.notificar("El pedido "+codigoPedido+" ha cambiado a estado: " + estado);
        }
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public String getEstado() {
        return estado;
    }
}

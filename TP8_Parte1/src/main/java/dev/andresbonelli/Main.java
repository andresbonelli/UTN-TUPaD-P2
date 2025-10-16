package dev.andresbonelli;

import dev.andresbonelli.mediosPago.PayPal;
import dev.andresbonelli.mediosPago.TarjetaCredito;

public class Main {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Juan Pérez", "juan.perez@email.com");

        // Crear productos
        Producto producto1 = new Producto("Laptop", 1200.00);
        Producto producto2 = new Producto("Mouse", 25.50);
        Producto producto3 = new Producto("Teclado", 75.00);

        // Crear pedido
        Pedido pedido = new Pedido("P001");
        pedido.agregarObservador(cliente);

        // Agregar productos al pedido
        System.out.println("--- Agregando productos al pedido ---");
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);
        pedido.agregarProducto(producto3);

        System.out.println("Productos en el pedido:");
        for (Producto p : pedido.getProductos()) {
            System.out.println("- " + p.getNombre() + ": $" + p.getPrecio());
        }

        // Calcular total
        double total = pedido.calcularTotal();
        System.out.println("\nTotal del pedido: $" + total);

        // Cambiar estado del pedido
        System.out.println("\n--- Procesando pedido ---");
        pedido.cambiarEstado("EN_PROCESO");

        // Procesar pago con tarjeta de crédito
        System.out.println("\n--- Pago con Tarjeta de Crédito ---");
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456");
        tarjeta.aplicarDescuento(10);
        tarjeta.procesarPago(total);

        // Cambiar estado después del pago
        System.out.println();
        pedido.cambiarEstado("PAGADO");

        // Simular otro pago con PayPal
        System.out.println("\n--- Pago  con PayPal ---");
        PayPal paypal = new PayPal("juan.perez@email.com");
        paypal.aplicarDescuento(5);
        paypal.procesarPago(total);

        // Finalizar pedido
        System.out.println();
        pedido.cambiarEstado("ENVIADO");

        System.out.println();
        pedido.cambiarEstado("ENTREGADO");
    }
}
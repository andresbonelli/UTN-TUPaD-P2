package dev.andresbonelli.sistemaDePagos;

import java.util.List;

class GestorPagos {
    public static void procesarPago(Pagable medioPago, double monto) {
        System.out.println("=================================");
        System.out.println("Método de pago: " + medioPago.obtenerDetalles());
        System.out.println("---------------------------------");
        medioPago.pagar(monto);
        System.out.println("=================================\n");
    }

    public static void procesarPagos(List<Pagable> mediosPago, List<Double> montos) {
        System.out.println("--- Procesando múltiples pagos ---\n");
        for (int i = 0; i < mediosPago.size() && i < montos.size(); i++) {
            procesarPago(mediosPago.get(i), montos.get(i));
        }
    }
}
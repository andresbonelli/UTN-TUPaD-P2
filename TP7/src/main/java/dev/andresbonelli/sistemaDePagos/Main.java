package dev.andresbonelli.sistemaDePagos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pagable tarjeta1 = new TarjetaCredito("4532123456789012", "Juan Pérez", 3);
        Pagable transferencia1 = new Transferencia("0123456789012345678901", "Banco Nación");
        Pagable efectivo1 = new Efectivo("Centro - Local 42");
        Pagable tarjeta2 = new TarjetaCredito("5412987654321098", "María García", 6);

        System.out.println("--- Pagos Individuales ---\n");
        GestorPagos.procesarPago(tarjeta1, 15000.0);
        GestorPagos.procesarPago(transferencia1, 8500.50);
        GestorPagos.procesarPago(efectivo1, 3200.0);

        List<Pagable> mediosPago = new ArrayList<>();
        mediosPago.add(tarjeta2);
        mediosPago.add(new Transferencia("9876543210987654321098", "Banco Galicia"));
        mediosPago.add(new Efectivo("Norte - Sucursal 15"));

        List<Double> montos = new ArrayList<>();
        montos.add(24000.0);
        montos.add(12500.75);
        montos.add(5000.0);

        GestorPagos.procesarPagos(mediosPago, montos);

        System.out.println("--- Ejemplo de polimorfismo ---\n");
        List<Pagable> pagables = List.of(tarjeta1,transferencia1,efectivo1,tarjeta2);
        double montoFijo = 1000.0;

        for (Pagable p : pagables) {
            GestorPagos.procesarPago(p, montoFijo);
        }
    }
}

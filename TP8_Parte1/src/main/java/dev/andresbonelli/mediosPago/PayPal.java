package dev.andresbonelli.mediosPago;

import dev.andresbonelli.PagoConDescuento;

public class PayPal implements PagoConDescuento {
    private String email;
    private double descuento;

    public PayPal(String email) {
        this.email = email;
        this.descuento = 0;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        this.descuento = porcentaje;
        System.out.println("Descuento del " + porcentaje + "% aplicado a PayPal");
    }

    @Override
    public void procesarPago(double monto) {
        double montoFinal = monto - (monto * descuento / 100);
        System.out.println("Procesando pago de $" + montoFinal + " con PayPal (" + email + ")");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package dev.andresbonelli.mediosPago;

import dev.andresbonelli.PagoConDescuento;

public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;
    private double descuento;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
        this.descuento = 0;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        this.descuento = porcentaje;
        System.out.println("Descuento del " + porcentaje + "% aplicado a la tarjeta de crédito");
    }

    @Override
    public void procesarPago(double monto) {
        double montoFinal = monto - (monto * descuento / 100);
        System.out.println(
                "Procesando pago de $"
                        + montoFinal
                        + " con tarjeta de crédito "
                        + ofuscar(numeroTarjeta)
        );
    }

    private String ofuscar(String textoPlano) {
        return textoPlano.length() < 4
                ? "***"
                : "***" + textoPlano.substring(textoPlano.length() - 4);
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
}

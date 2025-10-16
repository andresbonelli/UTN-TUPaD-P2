package dev.andresbonelli;

public interface PagoConDescuento extends Pago {
    void aplicarDescuento(double porcentaje);
}

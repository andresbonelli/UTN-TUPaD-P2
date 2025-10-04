package dev.andresbonelli.sistemaDePagos;

class TarjetaCredito implements Pagable {
    private final String numeroTarjeta;
    private final String titular;
    private final int cuotas;

    public TarjetaCredito(String numeroTarjeta, String titular, int cuotas) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.cuotas = cuotas;
    }

    @Override
    public void pagar(double monto) {
        double montoPorCuota = monto / cuotas;
        System.out.println("Procesando pago con Tarjeta de Crédito");
        System.out.println("Monto total: $" + String.format("%.2f", monto));
        System.out.println("Cuotas: " + cuotas + " de $" + String.format("%.2f", montoPorCuota));
    }

    @Override
    public String obtenerDetalles() {
        return "Tarjeta " + ofuscar(numeroTarjeta) +
                " - Titular: " + titular;
    }

    private String ofuscar(String textoPlano) {
        return textoPlano.length() < 4
                ? "***"
                : "***" + textoPlano.substring(textoPlano.length() - 4);
    }
}

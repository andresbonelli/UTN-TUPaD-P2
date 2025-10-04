package dev.andresbonelli.sistemaDePagos;

class Efectivo implements Pagable {
    private final String sucursal;

    public Efectivo(String sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Procesando pago en Efectivo");
        System.out.println("Sucursal: " + sucursal);
        System.out.println("Monto: $" + String.format("%.2f", monto));
    }

    @Override
    public String obtenerDetalles() {
        return "Pago en Efectivo - Sucursal: " + sucursal;
    }
}

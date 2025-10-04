package dev.andresbonelli.sistemaDePagos;

interface Pagable {
    void pagar(double monto);
    String obtenerDetalles();
}

package dev.andresbonelli.sistemaDePagos;

class Transferencia implements Pagable {
    private final String cbu;
    private final String banco;

    public Transferencia(String cbu, String banco) {
        this.cbu = cbu;
        this.banco = banco;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Procesando Transferencia");
        System.out.println("Banco: " + banco);
        System.out.println("CBU: " + cbu);
        System.out.println("Monto: $" + String.format("%.2f", monto));
    }

    @Override
    public String obtenerDetalles() {
        return "Transferencia - " + banco + " (CBU: " + cbu + ")";
    }
}

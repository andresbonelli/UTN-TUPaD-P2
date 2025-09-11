public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // Asociación bidireccional
    private Banco banco; // Agregación

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null) {
            cliente.setTarjeta(this);
        }
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(String fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }
    public Cliente getCliente() { return cliente; }
    public Banco getBanco() { return banco; }
    public void setBanco(Banco banco) { this.banco = banco; }
}
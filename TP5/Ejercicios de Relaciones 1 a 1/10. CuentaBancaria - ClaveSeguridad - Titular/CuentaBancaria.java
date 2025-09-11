public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // composición
    private Titular titular;      // bidireccional

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
        this.titular = titular;
        if (null != titular) {
            titular.setCuenta(this);
        }
    }

    public String getCbu() { return cbu; }
    public void setCbu(String cbu) {
        this.cbu = cbu;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Titular getTitular() {
        return titular;
    }
    public void setTitular(Titular titular) {
        this.titular = titular;
    }
}
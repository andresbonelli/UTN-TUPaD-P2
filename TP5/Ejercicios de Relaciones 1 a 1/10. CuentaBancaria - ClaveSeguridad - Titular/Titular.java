public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;

    public Titular(String nombre, String dni, CuentaBancaria cuenta) {
        this.nombre = nombre;
        this.dni = dni;
        this.cuenta = cuenta;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getDni() {return dni;}
    public void setDni(String dni) {this.dni = dni;}
    public CuentaBancaria getCuenta() {return cuenta;}
    public void setCuenta(CuentaBancaria cuenta) {this.cuenta = cuenta;}

}
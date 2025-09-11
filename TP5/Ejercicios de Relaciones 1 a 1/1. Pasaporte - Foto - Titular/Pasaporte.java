public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; // Composición
    private Titular titular; // Asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); // Composición
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (null != titular) {
            titular.setPasaporte(this); // Mantener la Bidireccionalidad
        }
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(String fechaEmision) { this.fechaEmision = fechaEmision; }
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }
}
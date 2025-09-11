public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // Agregación
    private Usuario usuario; // Asociación bidireccional

    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria; // Agregación - recibe batería existente
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null) {
            usuario.setCelular(this);
        }
    }

    public String getImei() { return imei; }
    public void setImei(String imei) { this.imei = imei; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public Bateria getBateria() { return bateria; }
    public Usuario getUsuario() { return usuario; }
}
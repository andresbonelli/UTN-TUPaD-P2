public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; // Composición
    private Propietario propietario; // Asociación bidireccional

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null) {
            propietario.setComputadora(this);
        }
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }
    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public Propietario getPropietario() { return propietario; }
}
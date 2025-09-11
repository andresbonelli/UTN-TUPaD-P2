import java.util.Date;

class ClaveSeguridad {
    private String codigo;
    private Date ultimaModificacion;

    public ClaveSeguridad(String codigo) {
        this.codigo = codigo;
        this.ultimaModificacion = new Date();
    }

    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {
        this.codigo = codigo;
        this.ultimaModificacion = new Date();
    }
    public Date getUltimaModificacion() {return ultimaModificacion;}
}
public class GeneradorQR {
    public void generar(String valor, Usuario usuario) { // dependencia de creación
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("QR generado");
    }
}
public class Calculadora {
    public void calcular(Impuesto impuesto) { // dependencia de uso
        System.out.println("Calculando impuesto: \n");
        System.out.println("Monto: " + impuesto.getMonto());
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
    }
}
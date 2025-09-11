public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) { // dependencia de creación
        Render render = new Render(formato, proyecto);
        System.out.println("Render exportado");
    }
}
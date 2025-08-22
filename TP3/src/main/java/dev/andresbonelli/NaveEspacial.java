package dev.andresbonelli;

class NaveEspacial {
    private final String nombre;
    private int combustible = 0;
    private final int capacidadMaxima;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.capacidadMaxima = combustible;
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println("La nave espacial " + nombre + " despega 🚀");
        } else {
            System.out.println("[ERROR] - No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println("La nave espacial " + nombre + " avanzó " + distancia + " km.");
        } else {
            System.out.println("[ERROR] - No hay suficiente combustible para avanzar.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= capacidadMaxima) {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        } else {
            System.out.println("No se puede superar la capacidad máxima de " + capacidadMaxima);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " - Combustible: " + combustible + "/" + capacidadMaxima);
    }


}


package dev.andresbonelli.vehiculoHerencia;

public class Main {
    public static void main(String[] args) {
        Auto miAuto = new Auto("Renault", "19", 5);
        miAuto.mostrarInfo();
        Vehiculo vehiculo = new Auto("VW", "Gol", 3);
        vehiculo.mostrarInfo();
    }
}

package dev.andresbonelli.figurasGeometricas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Figura> figuras = new ArrayList<>();

        figuras.add(new Circulo(5.0));
        figuras.add(new Rectangulo(4.0, 6.0));
        figuras.add(new Circulo(3.5));
        figuras.add(new Rectangulo(8.0, 2.5));

        for (Figura f : figuras) {
            System.out.println("--- Figura " + (figuras.indexOf(f) + 1) + " ---");
            f.mostrarInfo();
        }

        double areaTotal = 0;
        for (Figura f : figuras) {
            areaTotal += f.calcularArea();
        }
        System.out.println("Área total de todas las figuras: " + String.format("%.2f", areaTotal) + " m²");
    }
}

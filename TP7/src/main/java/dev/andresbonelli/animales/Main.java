package dev.andresbonelli.animales;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== KATA 4: Animales y Comportamiento Sobrescrito ===\n");

        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Amapola", 2, "Cruza"));
        animales.add(new Gato("Groove", 14, false));
        animales.add(new Vaca("Milka", 5, 25.5));
        animales.add(new Perro("Ajax", 11, "Pastor Belga"));
        animales.add(new Gato("Don Gato", 4, true));

        System.out.println("--- Descripcion de animales con sus sonidos ---\n");
        for (Animal a : animales) {
            System.out.println("Animal " + (animales.indexOf(a) + 1) + ":");
            a.describirAnimal();
            System.out.print("Sonido: ");
            a.hacerSonido();
            System.out.println();
        }
    }
}

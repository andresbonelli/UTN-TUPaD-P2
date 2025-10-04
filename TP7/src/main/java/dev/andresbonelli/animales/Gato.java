package dev.andresbonelli.animales;

class Gato extends Animal {
    private final boolean esCallejero;

    public Gato(String nombre, int edad, boolean esCallejero) {
        super(nombre, edad);
        this.esCallejero = esCallejero;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla");
    }

    @Override
    public void describirAnimal() {
        super.describirAnimal();
        System.out.println("Tipo: " + (esCallejero ? "Callejero" : "Doméstico"));
    }
}

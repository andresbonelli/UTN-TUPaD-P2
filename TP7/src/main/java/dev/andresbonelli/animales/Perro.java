package dev.andresbonelli.animales;

class Perro extends Animal {
    private final String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    @Override
    public void describirAnimal() {
        super.describirAnimal();
        System.out.println("Raza: " + raza);
    }
}

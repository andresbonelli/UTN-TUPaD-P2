package dev.andresbonelli.animales;

class Vaca extends Animal {
    private final double litrosLeche;

    public Vaca(String nombre, int edad, double litrosLeche) {
        super(nombre, edad);
        this.litrosLeche = litrosLeche;
    }

    @Override
    public void hacerSonido() {
        System.out.println("La vaca muje");
    }

    @Override
    public void describirAnimal() {
        super.describirAnimal();
        System.out.println("Producción diaria: " + litrosLeche + " litros de leche");
    }
}

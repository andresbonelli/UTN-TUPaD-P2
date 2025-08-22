package dev.andresbonelli;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        System.out.println("\n--- Ejercicio 1 ---\n");
        Estudiante estudiante = new Estudiante("Juan", "Perez", "Programación II", 7.5);
        System.out.println("\nDatos de estudiante antes de modificar:");
        estudiante.mostrarInfo();
        estudiante.subirCalificacion(1.5);
        estudiante.bajarCalificacion(3);
        System.out.println("\nDatos de estudiante después de modificar:");
        estudiante.mostrarInfo();


        // Ejercicio 2
        System.out.println("\n--- Ejercicio 2 ---\n");
        Mascota gato = new Mascota("Groove", "Gato", 12);
        System.out.println("\nInformacion de mascota antes de modificar:");
        gato.mostrarInfo();
        gato.cumplirAnios();
        System.out.println("\nInformacion de mascota despues de modificar:");
        gato.mostrarInfo();


        // Ejercicio 3
        System.out.println("\n--- Ejercicio 3 ---\n");
        Libro libro = new Libro("1984", "George Orwell", 1949);
        libro.setAnioPublicacion(3000); // inválido
        libro.setAnioPublicacion(2020); // válido
        System.out.println(libro);


        // Ejercicio 4
        System.out.println("\n--- Ejercicio 4 ---\n");
        Gallina gallina1 = new Gallina(1, 2);
        Gallina gallina2 = new Gallina(2, 1);
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();


        // Ejercicio 5
        System.out.println("\n--- Ejercicio 5 ---\n");
        NaveEspacial nave = new NaveEspacial("Apollo 11", 50);
        nave.mostrarEstado();
        nave.avanzar(10);
        nave.recargarCombustible(30);
        nave.avanzar(20);
        nave.mostrarEstado();
    }
}

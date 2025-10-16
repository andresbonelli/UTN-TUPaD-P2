package dev.andresbonelli.usoDeTryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivoConTryWithResources {
    public static void main(String[] args) {
        String rutaArchivo = "src/main/java/dev/andresbonelli/usoDeTryWithResources/";
        String nombreArchivo = "archivo.txt";

        try (BufferedReader reader = new BufferedReader(
                new FileReader(rutaArchivo + nombreArchivo)
        )) {
            String linea;

            System.out.println("Contenido del archivo '" + nombreArchivo + "':");
            System.out.println("-----------------------------------");

            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

            System.out.println("-----------------------------------");

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        System.out.println("\nEl archivo se cerró automáticamente");
    }

}

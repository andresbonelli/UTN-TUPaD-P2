package dev.andresbonelli.lecturaArchivo;

import java.io.*;

public class LecturaArchivo {
    public static void main(String[] args) {
        String rutaArchivo = "src/main/java/dev/andresbonelli/lecturaArchivo/";
        String nombreArchivo = "archivo.txt";
        BufferedReader reader = null;

        try {
            File archivo = new File(rutaArchivo + nombreArchivo);

            reader = new BufferedReader(new FileReader(archivo));
            String linea;

            System.out.println("Contenido del archivo '" + nombreArchivo + "':");
            System.out.println("-----------------------------------");

            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

            System.out.println("-----------------------------------");

        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo '" + nombreArchivo + "' no existe");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
}

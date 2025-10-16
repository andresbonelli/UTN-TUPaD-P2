package dev.andresbonelli.conversionCadenaNumero;

import java.util.Scanner;

public class ConversionCadenaNumero {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            String texto = scanner.nextLine();

            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido exitosamente: " + numero);
            System.out.println("El doble del número es: " + (numero * 2));

        } catch (NumberFormatException e) {
            System.out.println("Error: '" + e.getMessage().split(":")[1].trim() + "' no es un número válido");
        }
    }
}
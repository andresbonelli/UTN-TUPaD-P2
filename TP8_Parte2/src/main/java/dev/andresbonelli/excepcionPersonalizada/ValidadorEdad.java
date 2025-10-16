package dev.andresbonelli.excepcionPersonalizada;

import java.util.Scanner;

public class ValidadorEdad {
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser menor a 0: " + edad);
        }
        if (edad > 120) {
            throw new EdadInvalidaException("La edad no puede ser mayor a 120 años: " + edad);
        }
        System.out.println("Edad válida: " + edad + " años");
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            validarEdad(edad);
            System.out.println("La edad fue registrada correctamente");

        } catch (EdadInvalidaException e) {
            System.out.println("Error de validación: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida");
        }
    }
}

package dev.andresbonelli.divisionSegura;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el dividendo: ");
            int dividendo = scanner.nextInt();

            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();

            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + dividendo + " / " + divisor + " = " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida");
        }
    }
}

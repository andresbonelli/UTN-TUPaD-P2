package TP2;

import java.util.Scanner;

class Ejercicios {
    
    static Scanner sc;
    
    static void abrirScanner() { sc = new Scanner(System.in); }
    
    static void cerrarScanner() { sc.close(); }
    
    static void ej01anioBisiesto() {
        System.out.println("\n------------ Ejercicio 1 -------------\n");
        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();

        boolean esBisiesto = (anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0));

        if (esBisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
        
    }
    
    static void ej02mayorDeTresNumeros() {
        System.out.println("\n------------ Ejercicio 2 -------------\n");
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int c = sc.nextInt();

        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;

        System.out.println("El mayor de los tres números es: " + mayor +"\n");
    }
    
    static void ej03clasificarEdades() {
        System.out.println("\n------------ Ejercicio 3 -------------\n");
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }
    }
    
    static void ej04descuentosPorCategoria() {
     System.out.println("\n------------ Ejercicio 4 -------------\n");   
     System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        sc.nextLine();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String entrada = sc.nextLine().trim().toUpperCase();
        char categoria = entrada.isEmpty() ? null : entrada.charAt(0);

        double porcentajeDescuento = 0;
        switch (categoria) {
            case 'A': porcentajeDescuento = 0.10; break;
            case 'B': porcentajeDescuento = 0.15; break;
            case 'C': porcentajeDescuento = 0.20; break;
            default:
                System.out.println("Categoría inválida.");
        }

        double precioFinal = precio - (precio * porcentajeDescuento);

        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento aplicado: " + (int)(porcentajeDescuento * 100) + "%");
        System.out.println("Precio final: $" + precioFinal);
    }
    
    static void ej05sumaNumerosPares() {
        System.out.println("\n------------ Ejercicio 5 -------------\n");   
        int suma = 0;
        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            int n = sc.nextInt();
            if (n == 0) break;
            if (n % 2 == 0) { suma += n; }
        }
        System.out.println("La suma de los números pares es: " + suma);
    }
    
    static void ej06contadorPositivosNegativos() {
        System.out.println("\n------------ Ejercicio 6 -------------\n");  
        int positivos = 0, negativos = 0, ceros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int n = sc.nextInt();
            if (n > 0) positivos++;
            else if (n < 0) negativos++;
            else ceros++;
        }

        System.out.println("Resultado:");
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
    
    static void ej07validacionNota() {
        System.out.println("\n------------ Ejercicio 7 -------------\n"); 
         int nota;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = sc.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente.");
    }
    
    static void ej08calculoPrecio() {
        System.out.println("\n------------ Ejercicio 8 -------------\n"); 
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impPorc = sc.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descPorc = sc.nextDouble();

        double precioFinal = precioBase + (precioBase * (impPorc / 100.0)) - (precioBase * (descPorc / 100.0));

        System.out.println("El precio final del producto es: $" + precioFinal);

    }
    
    static void ej09costoEnvio() {
        System.out.println("\n------------ Ejercicio 9 -------------\n");
  
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        sc.nextLine(); // limpiar

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.nextLine().trim();

      
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: $" + costoEnvio);
        System.out.println("El total a pagar es: $" + total);
      
    }
    
    private static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return 5.0 * peso;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return 10.0 * peso;
        } else {
            System.out.println("Zona inválida. Debe ser Nacional o Internacional.");
            return 0;
        }
    }
    
    private static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    static void ej10actualizarStock() {
        System.out.println("\n------------ Ejercicio 10 -------------\n");
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = sc.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = sc.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = sc.nextInt();

        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    
    private static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    private static final double DESCUENTO_ESPECIAL = 0.10;
    
    static void ej11descuentoEspecial() {
        System.out.println("\n------------ Ejercicio 11 -------------\n");
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        calcularDescuentoEspecial(precio);

    }
    
    private static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
        return precioFinal;
    }
    
    static void ej12modificacionPrecios() {
        System.out.println("\n------------ Ejercicio 12 -------------\n");
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }

        // Modificar el precio de un producto especifico
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }
    }
    
    static void ej13impresionRecursiva() {
        System.out.println("\n------------ Ejercicio 13 -------------\n");
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);

        // Modificar el precio de un producto especifico
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirRecursivo(precios, 0);
    }
    
    private static void imprimirRecursivo(double[] array, int index) {
        if (index >= array.length) return; // Caso base
        System.out.println("Precio: $" + array[index]);
        imprimirRecursivo(array, index + 1);
    }
}

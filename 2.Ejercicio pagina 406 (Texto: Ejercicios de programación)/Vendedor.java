package Excepciones;

import java.util.Scanner;

/**
 * Esta clase denominada Vendedor modela un vendedor que tiene 
 * como atributos un nombre, apellidos y una edad.
 * @version 1.2/2020
 */
public class Vendedor {
    // Atributos
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructor
    public Vendedor(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    // Método para imprimir los datos del vendedor
    public void imprimir() {
        System.out.println("Nombre del vendedor = " + nombre);
        System.out.println("Apellidos del vendedor = " + apellidos);
        System.out.println("Edad del vendedor = " + edad);
    }

    // Método para verificar la edad del vendedor
    public void verificarEdad(int edad) {
        if (edad < 0 || edad > 120) {
            throw new IllegalArgumentException("La edad no puede ser negativa ni mayor a 120.");
        } else if (edad < 18) {
            throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años.");
        } else {
            this.edad = edad;
        }
    }

    // Método principal para ingresar datos desde el teclado
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Nombre del vendedor: ");
            String n = teclado.nextLine();

            System.out.print("Apellidos del vendedor: ");
            String a = teclado.nextLine();

            Vendedor vendedor = new Vendedor(n, a);

            System.out.print("Edad del vendedor: ");
            int e = teclado.nextInt();

            vendedor.verificarEdad(e);
            vendedor.imprimir();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            teclado.close();
        }
    }
}

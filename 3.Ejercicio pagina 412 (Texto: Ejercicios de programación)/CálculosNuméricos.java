package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Esta clase denominada CálculosNuméricos permite realizar dos cálculos matemáticos:
 * calcular el logaritmo neperiano de un valor y calcular la raíz cuadrada de un valor.
 * @version 1.2/2020
 */
public class CálculosNuméricos {

    /**
     * Método que calcula el logaritmo neperiano de un valor numérico.
     * Si el valor no es positivo se lanza una excepción.
     */
    public static void calcularLogaritmoNeperiano(double valor) {
        try {
            if (valor < 0) {
                throw new ArithmeticException("El valor debe ser un número positivo");
            }
            double resultado = Math.log(valor);
            System.out.println("Logaritmo neperiano: " + String.format("%.4f", resultado));
        } catch (ArithmeticException e) {
            System.out.println("Error: El valor debe ser un número positivo para calcular el logaritmo.");
        } catch (InputMismatchException e) {
            System.out.println("Error: El valor debe ser numérico para calcular el logaritmo.");
        }
    }

    /**
     * Método que calcula la raíz cuadrada de un valor numérico.
     * Si el valor no es positivo se lanza una excepción.
     */
    public static void calcularRaizCuadrada(double valor) {
        try {
            if (valor < 0) {
                throw new ArithmeticException("El valor debe ser un número positivo");
            }
            double resultado = Math.sqrt(valor);
            System.out.println("Raíz cuadrada: " + String.format("%.4f", resultado));
        } catch (ArithmeticException e) {
            System.out.println("Error: El valor debe ser un número positivo para calcular la raíz cuadrada.");
        } catch (InputMismatchException e) {
            System.out.println("Error: El valor debe ser numérico para calcular la raíz cuadrada.");
        }
    }

    /**
     * Método main que solicita un valor numérico por teclado.
     * Para dicho valor se calcula el logaritmo neperiano y la raíz cuadrada.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Valor numérico: ");
            double valor = teclado.nextDouble();

            calcularLogaritmoNeperiano(valor);
            calcularRaizCuadrada(valor);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un valor numérico.");
        } finally {
            teclado.close();
        }
    }
}

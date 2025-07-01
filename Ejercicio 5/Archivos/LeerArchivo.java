
import java.io.*;
public class LeerArchivo {
    public static void main(String[] args) throws Exception {
        String nombreArchivo = "C:/prueba.txt"; /* Definición del
        archivo de texto a leer */
        FileInputStream archivo; // Definición de flujo de datos
        InputStreamReader conversor; // Definición del flujo de lectura
        BufferedReader filtro; // Definición del buffer
        String línea;
        try {
        /* Crea los objetos FileInputStream, BufferedReader y
        BufferedReader */
        archivo = new FileInputStream(nombreArchivo);
        conversor = new InputStreamReader(archivo);
        filtro = new BufferedReader(conversor);
        línea = filtro.readLine();
        while (línea != null) {
        System.out.println(línea); /* Imprime en pantalla una
        línea del archivo */
        línea = filtro.readLine(); // Lee la siguiente línea
        }
        filtro.close(); // Cierra el archivo
        } catch (IOException e) { // En caso que se genere una excepción
}
System.out.println("No se pudo leer el archivo.");
}
}

import java.util.*;

public class EquipoMaratonProgramacion {
   
        /* Atributo que define el nombre el equipo de la maratón de
        programación */
        String nombreEquipo;
        /* Atributo que define el nombre de la universidad a la que
        pertenece el equipo de la maratón de programación */
        String universidad;
        /* Atributo que define el lenguaje de programación utilizado por el
        equipo de la maratón de programación */
        String lenguajeProgramación;
        /* Atributo que define los programadores que conforman el equipo
        de la maratón de programación */
        Programador[] programadores;
        /* Atributo que define el tamaño del equipo de la maratón de
        programación */
        int tamañoEquipo;
        /**
        * Constructor de la clase EquipoMaratónProgramación
        * @param nombreEquipo Parámetro que define el nombre del
        * equipo de la maratón de programación
        * @param universidad Parámetro que define la universidad a la que
        * pertenece el equipo de la maratón de programación
        * @param lenguajeProgramación Parámetro que define el lenguaje
        * de programación que utilizará el equipo de la maratón de
        * programación
        */
        EquipoMaratonProgramacion(String nombreEquipo, String universidad, String lenguajeProgramación) {
        this.nombreEquipo = nombreEquipo;
        this.universidad = this.universidad;
        this.lenguajeProgramación = this.lenguajeProgramación;
        this.programadores = this.programadores;
        tamañoEquipo = 0; // El tamaño del equipo inicialmente es cero
        programadores = new Programador[3]; /* Crea un array con tres
        programadores */
        }
        boolean estáLleno() {
            return tamañoEquipo == programadores.length;
            }
            /**
            * Método que permite añadir un programador al array de
            * programadores
            * @param programador Parámetro que define el programador a
            * agregar al array de programadores
            * @throws Exception Excepción que indica que el equipo de
            * programación está completo
            */
            void añadir(Programador programador) throws Exception {
            if (estáLleno()) { /* Si el array está lleno, se genera la excepción
            correspondiente */
            throw new Exception ("El equipo está completo. No se pudo agregar programador.");
            }
            // Se asigna el programador al array de programadores
            programadores[tamañoEquipo] = programador;
            tamañoEquipo++; // Se incrementa el tamaño del equipo
            }
            /**
            * Método que permite validar un campo evaluando si el campo no
            * tiene dígitos y su longitud no debe ser superior a 20 caracteres. Si
            * no cumple estos criterios, se generan las excepciones
            * correspondientes
            * @param campo Parámetro que define el campo a validar
            * @throws Exception Excepción que indica que el nombre ingresado
            * no puede tener dígitos o que la longitud no debe ser superior a 20
            * caracteres
            */
            static void validarCampo(String campo) throws Exception {
            for (int j = 0; j < campo.length(); j++) {
            char c = campo.charAt(j);
            if (Character.isDigit(c)) { /* Si el caracter es un dígito se genera
            la excepción correspondiente */
            throw new Exception("El nombre no puede tener dígitos.");
            }
            }if (campo.length() > 20) {
                throw new Exception("La longitud no debe ser superior a 20 caracteres.");
                }
                }
                /**
                * Método main que solicita ingresar por teclado el nombre del
                * equipo, la universidad, el lenguaje de programación, crea un
                * equipo de maratón de programación y luego solicita ingresar por
                * teclado tres integrantes del equipo, realizando las validaciones de
                * datos.
                */
                public static void main(String args[]) throws Exception {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Nombre del equipo = ");
                String nombre = teclado.next();
                System.out.println("Universidad = ");
                String universidad = teclado.next();
                System.out.println("Lenguaje de programación = ");
                String lenguaje = teclado.next();
                EquipoMaratonProgramacion equipo = new
                EquipoMaratonProgramacion(nombre, universidad, lenguaje);
                System.out.println("Datos de los integrantes del equipo");
                String nombreProgramador;
                String apellidosProgramador;
                for (int i= 0; i < 3; i++) {
                System.out.println("Nombre del integrante = ");
                nombreProgramador = teclado.next();
                validarCampo(nombreProgramador); /* Valida que el nombre
                del integrante sea correcto */
                System.out.println("Apellidos del integrante = ");
                apellidosProgramador = teclado.next();
                validarCampo(apellidosProgramador); /* Valida que el
                apellido sea correcto */
                Programador programador = new
                Programador(nombreProgramador,apellidosProgramador); // Crea un programador
                equipo.añadir(programador); /* Añade el programador al
                array de programadores */
                }
                }
}

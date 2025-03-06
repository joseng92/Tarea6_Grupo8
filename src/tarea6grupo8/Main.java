package tarea6grupo8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jose_&Cesar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una lista de empleados
        ArrayList<Persona> personas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int menu;

        // Menú interactivo
        do {
            System.out.println("\n=== Sistema de Gestión de Personas ===");
            System.out.println("1. Agregar Doctor");
            System.out.println("2. Agregar Deportista");
            System.out.println("3. Mostrar Personas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            menu = scan.nextInt();

            switch (menu) {
                case 1: // Agregar Doctor
                    scan.nextLine(); // Limpiar buffer
                    System.out.print("Ingrese el nombre del doctor: ");
                    String nombreDoctor = scan.nextLine();

                    System.out.print("Ingrese la edad del doctor: ");
                    int edadDoctor = scan.nextInt();

                    scan.nextLine(); // Limpiar buffer
                    System.out.print("Ingrese el género del doctor: ");
                    String generoDoctor = scan.nextLine();

                    System.out.print("Ingrese la especialidad del doctor: ");
                    String especialidad = scan.nextLine();

                    System.out.print("Ingrese el hospital donde trabaja el doctor: ");
                    String hospital = scan.nextLine();

                    // Crear instancia de Doctor y agregarla a la lista
                    Doctor doctor = new Doctor(nombreDoctor, edadDoctor, generoDoctor, especialidad, hospital);
                    personas.add(doctor);
                    System.out.println("Doctor agregado exitosamente.");
                    break;

                case 2: // Agregar Deportista
                    scan.nextLine(); // Limpiar buffer
                    System.out.print("Ingrese el nombre del deportista: ");
                    String nombreDeportista = scan.nextLine();

                    System.out.print("Ingrese la edad del deportista: ");
                    int edadDeportista = scan.nextInt();

                    scan.nextLine(); // Limpiar buffer
                    System.out.print("Ingrese el género del deportista: ");
                    String generoDeportista = scan.nextLine();

                    System.out.print("Ingrese el deporte que practica el deportista: ");
                    String deporte = scan.nextLine();

                    // Crear instancia de Deportista y agregarla a la lista
                    Deportista deportista = new Deportista(deporte, nombreDeportista, edadDeportista, generoDeportista);
                    personas.add(deportista);
                    System.out.println("Deportista agregado exitosamente.");
                    break;

                case 3: // Mostrar todas las personas
                    if (personas.isEmpty()) {
                        System.out.println("No hay personas registradas.");
                    } else {
                        System.out.println("\nLista de Personas:");
                        for (Persona persona : personas) {
                            System.out.println(persona.obtenerInformacion());
                            System.out.println("--------------------------");
                        }
                    }
                    break;

                case 4: // Salir
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
                    break;
            }
        } while (menu != 4);

        scan.close();
    }
}
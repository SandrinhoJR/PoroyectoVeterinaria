/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller3;

import controlador.ControladorMascota;
import controlador.ControladorPropietario;
import vistas.VistaMascota;
import vistas.VistaPropietario;

/**
 *
 * @author sandro rendon
 */
public class Taller3 {

    public static void main(String[] args) {
       /* // Se crea un objeto Scanner para poder leer lo que el usuario escribe por teclado
        Scanner scanner = new Scanner(System.in);

        // === Registro del Propietario ===
        // Se piden los datos personales del dueño de las mascotas
        System.out.println("=== Registro del Propietario ===");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine(); // Se guarda el nombre que escribe el usuario

        System.out.println("Documento: ");
        String documento = scanner.nextLine(); // Se guarda el documento

        System.out.println("Telefono: ");
        String telefono = scanner.nextLine(); // Se guarda el número de teléfono

        // Se crea un objeto de tipo Propietario con los datos que se ingresaron
        Propietario propietario = new Propietario(nombre, documento, telefono);

        // === Registro de Mascotas ===
        // Se pregunta cuántas mascotas se van a registrar
        System.out.print("\nCuantas mascotas desea registrar?: ");
        int numMascotas = Integer.parseInt(scanner.nextLine()); // Se convierte el texto a número

        // Se repite el proceso de registro por cada mascota
        for (int i = 0; i < numMascotas; i++) {
            System.out.println("\n--- Mascota #" + (i + 1) + " ---");

            // Se piden los datos de la mascota
            System.out.print("Nombre de la mascota: ");
            String nombreMascota = scanner.nextLine();

            System.out.print("Especie: ");
            String especie = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine()); // Se convierte la edad a número

            // Se crea un objeto Mascota con los datos ingresados
            Mascota mascota = new Mascota(nombreMascota, especie, edad);

            // Se agrega la mascota al propietario
            propietario.agregarMascota(mascota);

            // === Registro de Consultas ===
            // Se pregunta cuántas consultas médicas tiene la mascota
            System.out.print("Cuantas consultas desea agregar a esta mascota?: ");
            int numConsultas = Integer.parseInt(scanner.nextLine());

            // Se repite el proceso por cada consulta
            for (int j = 1; j <= numConsultas; j++) {
                System.out.println("-> Consulta #" + (j));

                // Se genera un código automático para la consulta
                String codigo = IDGenerator.generarCodigoConsulta();

                // Se pide la fecha de la consulta
                System.out.print("Fecha (YYYY-MM-DD): ");
                String fecha = scanner.nextLine();

                // Se piden los datos del veterinario que atendió la consulta
                System.out.println("Informacion del veterinario:");
                System.out.print("Nombre: ");
                String nombreVet = scanner.nextLine();

                System.out.print("Especialidad: ");
                String especialidad = scanner.nextLine();

                // Se crea el objeto Veterinario y luego el objeto Consulta
                Veterinario vet = new Veterinario(nombreVet, especialidad);
                Consulta consulta = new Consulta(codigo, fecha, vet);

                // Se agrega la consulta a la mascota
                mascota.agregarConsulta(consulta);
            }
        }

        // === Mostrar resultados ===
        // Se imprime toda la información del propietario y sus mascotas
        System.out.println("\n===== FICHA CLINICA COMPLETA =====");
        System.out.println(propietario.mostrarInformacion());
        System.out.println(propietario.mostrarMascotas());

        // Se cierra el Scanner para liberar recursos
        scanner.close();
    }
*/
   
        // Crear los controladores una sola vez
        ControladorMascota controladorMascota = new ControladorMascota();
        ControladorPropietario controladorPropietario = new ControladorPropietario();

        // Crear las vistas pasándoles los dos controladores
        VistaMascota vistaMascota = new VistaMascota();
        VistaPropietario vistaPropietario = new VistaPropietario();

        // Mostrar la vista principal
        vistaPropietario.setVisible(true);
    }

}

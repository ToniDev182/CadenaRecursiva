/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bibliotecauniversitaria;

/**
 *
 * @author 34639
 */

import java.util.Scanner;

public class BibliotecaUniversitaria {

    public static void main(String[] args) {
        // Crear un array para almacenar alumnos
        Alumno[] alumnos = new Alumno[3];
        alumnos[0] = new Alumno("Antonio", "Atienza", "22345678A");
        alumnos[1] = new Alumno("Daniel", "Ramos", "27654321B");
        alumnos[2] = new Alumno("Adian", "Aguyo", "26789012C");

        // Crear un array para almacenar documentos
        Documento [] documentos = new Documento [3];
        documentos[0] = new Libro ("Cien años de soledad", "Gabriel Garcia Márquez", "Editorial Sudamerica", 1967, "Papel", 1);
        documentos[1] = new Libro  ("La sombra del viento", "Carlos Ruiz Zafón", "Editorial Planeta", 2001, "CD", 2);
        documentos[2] = new Revista ("Más allá", "Javier Sierra", "Editorial Planeta", 1990, "DVD", 3, 5, 10, "Enero");

        // Crear un array para almacenar préstamos
        Prestamo[] prestamos = new Prestamo[2];
        prestamos[0] = new Prestamo(1, "01/12/2023", "22345678A");
        prestamos[1] = new Prestamo(2, "20/01/2024", "27654321B");

        // Mostrar información de alumnos
        System.out.println("Información de Alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }

        // Mostrar información de documentos (n\ salto de linea)
        System.out.println("\nInformación de Documentos:");
        for (Documento  documento : documentos) {
            System.out.println(documento);
        }

        // Mostrar información de préstamos
        System.out.println("\nInformación de Préstamos:");
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    // Realizar operaciones adicionales según tus necesidades
    // Por ejemplo, solicitar la devolución de un préstamo y calcular la multa
    Scanner scanner = new Scanner(System.in); // Se crea un objeto Scanner para la entrada del usuario
    System.out.println("\nIngrese la fecha de devolución (dd/mm/aaaa):");
     String fechaDevolucion = scanner.next(); // Se solicita al usuario que ingrese la fecha de devolución
     prestamos[0].setDevuelto(true); // Se marca el préstamo 1 como devuelto (por ejemplo, para simular la devolución)
     int multa = prestamos[0].calcularMulta(fechaDevolucion); // Se calcula la multa por demora en la devolución
     System.out.println("Multa por demora en la devolución: " + multa + " días."); // Se imprime la multa calculada

     // Buscar un alumno por DNI
    System.out.println("\nIngrese el DNI de un alumno para buscar:");
    String dniBusqueda = scanner.next(); // Se solicita al usuario que ingrese el DNI de un alumno  
    Alumno alumnoEncontrado = buscarAlumnoPorDNI(alumnos, dniBusqueda); // Se busca al alumno en el array utilizando su DNI
    if (alumnoEncontrado != null) {
     System.out.println("Alumno encontrado:\n" + alumnoEncontrado); // Se imprime la información del alumno encontrado
    } else {
    System.out.println("Alumno con DNI " + dniBusqueda + " no encontrado."); // Se informa que el alumno no fue encontrado
    }

    // Cerrar el scanner para liberar recursos
    scanner.close();

        
    }

    // Método para buscar un alumno por DNI
    private static Alumno buscarAlumnoPorDNI(Alumno[] alumnos, String dni) {
        for (Alumno alumno : alumnos) {
            if (alumno.getDni().equals(dni)) {
                return alumno;
            }
        }
        return null; // Retorna null si no se encuentra el alumno con el DNI especificado
    }
}


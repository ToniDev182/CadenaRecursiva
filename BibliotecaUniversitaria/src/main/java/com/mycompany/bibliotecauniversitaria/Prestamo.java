/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecauniversitaria;

/**
 *
 * @author 34639
 */
// Clase Prestamo
public class Prestamo {
    // Atributos de la clase Prestamo
    private int numeroDocumento; // Número identificador del documento prestado
    private String fecha; // Fecha del préstamo
    private String dniAlumno; // DNI del alumno que realiza el préstamo
    private boolean devuelto; // Indica si el préstamo ha sido devuelto o no

    // Constructor de la clase Prestamo
    public Prestamo(int numeroDocumento, String fecha, String dniAlumno) {
        this.numeroDocumento = numeroDocumento;
        this.fecha = fecha;
        this.dniAlumno = dniAlumno;
        this.devuelto = true; // Por defecto, el préstamo no ha sido devuelto
    }

    // Métodos getters y setters
    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(String dniAlumno) {
        this.dniAlumno = dniAlumno;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    // Método toString para mostrar los datos del préstamo
    public String toString() {
        return "Préstamo:\n" +
                "Número de documento: " + numeroDocumento + "\n" +
                "Fecha: " + fecha + "\n" +
                "DNI del alumno: " + dniAlumno + "\n" +
                "Devuelto: " + devuelto + "\n";
    }

    // Método para calcular la multa por demora en la devolución
    public int calcularMulta(String fechaDevolucion) {
        try {
            // Suponemos que la fecha tiene el formato dd/mm/aaaa
            // Extraemos el día, el mes y el año de la fecha del préstamo
            int diaPrestamo = Integer.parseInt(fecha.substring(0, 2));
            int mesPrestamo = Integer.parseInt(fecha.substring(3, 5));
            int anioPrestamo = Integer.parseInt(fecha.substring(6, 10));

            // Extraemos el día, el mes y el año de la fecha de devolución
            int diaDevolucion = Integer.parseInt(fechaDevolucion.substring(0, 2));
            int mesDevolucion = Integer.parseInt(fechaDevolucion.substring(3, 5));
            int anioDevolucion = Integer.parseInt(fechaDevolucion.substring(6, 10));

            // Calculamos la diferencia en días entre ambas fechas
            int dias = calcularDiferenciaEnDias(diaPrestamo, mesPrestamo, anioPrestamo, diaDevolucion, mesDevolucion, anioDevolucion);

            // Si la diferencia es mayor a 0, se aplica la multa
            return Math.max(0, dias);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            // Manejar posibles excepciones al convertir cadenas a enteros o al acceder a partes de la cadena
            System.out.println("Error al calcular la multa: " + e.getMessage());
            return 0;
        }
    }

   // Método para calcular la diferencia en días entre dos fechas
private int calcularDiferenciaEnDias(int diaInicio, int mesInicio, int anioInicio, int diaFin, int mesFin, int anioFin) {
    // Arreglo que representa la cantidad de días en cada mes
    int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    // Variable para contar la diferencia en días
    int dias = 0;

    // Bucle para incrementar días hasta que las fechas de inicio y fin sean iguales
    while (diaInicio != diaFin || mesInicio != mesFin || anioInicio != anioFin) {
        // Incrementar la variable días para contar el día actual
        dias++;

        // Avanzar al siguiente día
        diaInicio++;

        // Verificar si el día actual supera la cantidad de días en el mes actual
        if (diaInicio > diasPorMes[mesInicio]) {
            // Reiniciar día a 1
            diaInicio = 1;

            // Avanzar al siguiente mes
            mesInicio++;

            // Verificar si el mes actual supera 12 (diciembre)
            if (mesInicio > 12) {
                // Reiniciar mes a 1
                mesInicio = 1;

                // Avanzar al siguiente año
                anioInicio++;
            }
        }
    }

    // Devolver la diferencia total en días
    return dias;
}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecauniversitaria;

/**
 *
 * @author 34639
 */
// Clase Alumno
class Alumno {
    private String nombre;
    private String apellidos;
    private String dni;
    private Prestamo prestamo; // Agregado para mantener el préstamo del alumno

    public Alumno(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellidos = apellido;
        this.dni = dni;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // Método toString para mostrar los datos del alumno
    public String toString() {
        return """
               Alumno:
               Nombre: """ + nombre + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "DNI: " + dni + "\n";
    }

   
}

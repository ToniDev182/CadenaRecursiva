/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecauniversitaria;

/**
 *
 * @author 34639
 */
// Clase hija Libros que hereda de Documentos
public class Libro extends Documento {
    // Constructor de la clase Libros
    public Libro (String titulo, String autor, String editorial, int anio, String formato, int numero) {
        super(titulo, autor, editorial, anio, formato, numero); // Llama al constructor de la clase padre
    }
}
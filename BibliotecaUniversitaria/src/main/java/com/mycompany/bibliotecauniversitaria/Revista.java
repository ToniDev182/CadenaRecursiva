/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecauniversitaria;

/**
 *
 * @author 34639
 */
// Clase hija Revistas que hereda de Documentos
public class Revista extends Documento {
    // Atributos propios de la clase Revistas
    private int volumen;
    private int numeroRevista; // Número de la revista dentro del volumen
    private String mes;

    // Constructor de la clase Revistas
    public Revista (String titulo, String autor, String editorial, int anio, String formato, int numero, int volumen, int numeroRevista, String mes) {
        super(titulo, autor, editorial, anio, formato, numero); // Llama al constructor de la clase padre
        this.volumen = volumen;
        this.numeroRevista = numeroRevista;
        this.mes = mes;
    }

    // Métodos getters y setters
    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getNumeroRevista() {
        return numeroRevista;
    }

    public void setNumeroRevista(int numeroRevista) {
        this.numeroRevista = numeroRevista;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    // Método toString para mostrar los datos de la revista
    public String toString() {
        return super.toString() + // Llama al método toString de la clase padre
                "Volumen: " + volumen + "\n" +
                "Número de la revista: " + numeroRevista + "\n" +
                "Mes de salida: " + mes + "\n";
    }
}

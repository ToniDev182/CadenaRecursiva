/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecauniversitaria;

/**
 *
 * @author 34639
 */
// Clase padre Documentos
public class Documento {
    // Atributos protegidos
    protected String titulo;
    protected String autor;
    protected String editorial;
    protected int anio;
    protected String formato; // Papel, CD o DVD
    protected int numero; // Número identificador del documento
    protected boolean prestado; // Indica si el documento está prestado o no

    // Constructor de la clase Documentos
    public Documento(String titulo, String autor, String editorial, int anio, String formato, int numero) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anio = anio;
        this.formato = formato;
        this.numero = numero;
 
    }

    // Métodos getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    // Método toString para mostrar los datos del documento
    public String toString() {
        return "Documento número " + numero + ":\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Editorial: " + editorial + "\n" +
                "Año de publicación: " + anio + "\n" +
                "Formato: " + formato + "\n" +
                "Prestado: " + prestado + "\n";
    }
}

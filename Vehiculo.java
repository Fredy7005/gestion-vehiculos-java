/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject10;



// La clase padre. De aqui sale todo lo demas para no repetir codigo.
public class Vehiculo {
    // Atributos privados porque lo pide el enunciado
    private String marca;
    private String modelo;
    private int anio;
    private double precioDia;

    // El constructor con todo para rellenar los datos de golpe
    public Vehiculo(String marca, String modelo, int anio, double precioDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioDia = precioDia;
    }

    // --- GETTERS Y SETTERS (Los ha generado el IDE automaticamente) ---
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    // Metodo basico para escupir la info por consola
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Anio: " + anio);
        System.out.println("Precio por dia: " + precioDia + " EUR");
    }
}
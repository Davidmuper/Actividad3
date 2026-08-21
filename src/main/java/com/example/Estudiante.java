package com.example;

public class Estudiante {

    private String nombre;
    private int edad;
    private double promedio;

    // Constructor vacío
    public Estudiante() {
        nombre = "Desconocido";
        edad = 0;
        promedio = 0.0;
    }

    // Constructor completo
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Getter de nombre
    public String getNombre() {
        return nombre;
    }

    // Setter de nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter de edad
    public int getEdad() {
        return edad;
    }

    // Setter de edad
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    // Getter de promedio
    public double getPromedio() {
        return promedio;
    }

    // Setter de promedio
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Método para saber si el estudiante aprobó
    public boolean haAprobado() {
        return promedio >= 3.0;
    }

    // Método para mostrar la información
    public void mostrarInfo() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);

        if (haAprobado()) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }
}
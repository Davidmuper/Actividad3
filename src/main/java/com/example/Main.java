package com.example;

public class Main {

    public static void main(String[] args) {

        // =========================
        // EJERCICIO 1: LIBRO
        // =========================

        System.out.println("===== EJERCICIO 1: LIBRO =====");

        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);

        libro.mostrarInfo();

        System.out.println();


        // =========================
        // EJERCICIO 2: CUENTA BANCARIA
        // =========================

        System.out.println("===== EJERCICIO 2: CUENTA BANCARIA =====");

        CuentaBancaria cuenta = new CuentaBancaria("David", 500000);

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        cuenta.depositar(100000);

        System.out.println("Saldo después del depósito: " + cuenta.getSaldo());

        cuenta.retirar(1000000);

        System.out.println("Saldo después del retiro: " + cuenta.getSaldo());

        System.out.println();


        // =========================
        // EJERCICIO 3: ESTUDIANTE
        // =========================

        System.out.println("===== EJERCICIO 3: ESTUDIANTE =====");

        Estudiante estudiante1 = new Estudiante("Pedro", 21, 2.5);

        estudiante1.mostrarInfo();

        System.out.println();

        Estudiante estudiante2 = new Estudiante("Ana", 20, 4.2);

        estudiante2.mostrarInfo();

        System.out.println();

        // Probar los setters

        estudiante1.setEdad(22);

        estudiante1.setPromedio(3.5);

        System.out.println("Información después de modificar los datos:");

        estudiante1.mostrarInfo();
    }
}
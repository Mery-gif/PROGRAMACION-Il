/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

public class TestEstadistica {

    static class Estadistica {

        private double[] datos;

        public Estadistica(double[] datos) {
            this.datos = datos;
        }

        public double promedio() {
            double suma = 0;
            for (int i = 0; i < datos.length; i++) {
                suma += datos[i];
            }
            return suma / datos.length;
        }

        public double desviacion() {
            double prom = promedio();
            double suma = 0;

            for (int i = 0; i < datos.length; i++) {
                suma += Math.pow(datos[i] - prom, 2);
            }

            return Math.sqrt(suma / (datos.length - 1));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] datos = new double[10];

        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < 10; i++) {
            datos[i] = sc.nextDouble();
        }

        Estadistica est = new Estadistica(datos);

        System.out.printf("El promedio es %.2f\n", est.promedio());
        System.out.printf("La desviacion estandar es %.5f\n", est.desviacion());

        sc.close();
    }
}
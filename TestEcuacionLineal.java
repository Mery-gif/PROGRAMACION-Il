/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebra;
import java.util.Scanner;

public class TestEcuacionLineal {

    // Clase interna EcuacionLineal
    static class EcuacionLineal {

        // Atributos privados
        private double a, b, c, d, e, f;

        // Constructor
        public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }

        // Método que verifica si tiene solución
        public boolean tieneSolucion() {
            return (a * d - b * c) != 0;
        }

        // Método que retorna X
        public double getX() {
            return (e * d - b * f) / (a * d - b * c);
        }

        // Método que retorna Y
        public double getY() {
            return (a * f - e * c) / (a * d - b * c);
        }
    }

    // Método principal
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese a, b, c, d, e, f:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        EcuacionLineal ecuacion = new EcuacionLineal(a, b, c, d, e, f);

        if (ecuacion.tieneSolucion()) {
            System.out.println("x = " + ecuacion.getX());
            System.out.println("y = " + ecuacion.getY());
        } else {
            System.out.println("La ecuación no tiene solución.");
        }

        sc.close();
    }
}
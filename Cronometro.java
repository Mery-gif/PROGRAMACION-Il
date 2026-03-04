/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;
import java.util.Random;

public class Cronometro {

    // Atributos privados
    private long inicia;
    private long finaliza;

    // Constructor sin argumentos
    public Cronometro() {
        inicia = System.currentTimeMillis();
        finaliza = 0;
    }

    // Getter inicia
    public long getInicia() {
        return inicia;
    }

    // Getter finaliza
    public long getFinaliza() {
        return finaliza;
    }

    // Método inicia()
    public void inicia() {
        inicia = System.currentTimeMillis();
        finaliza = 0;
    }

    // Método detener()
    public void detener() {
        finaliza = System.currentTimeMillis();
    }

    // Método lapsoDeTiempo()
    public long lapsoDeTiempo() {
        return finaliza - inicia;
    }

    // Método de ordenación por selección
    public static void ordenacionSeleccion(int[] lista) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndice = i;
            for (int j = i + 1; j < n; j++) {
                if (lista[j] < lista[minIndice]) {
                    minIndice = j;
                }
            }
            int temp = lista[i];
            lista[i] = lista[minIndice];
            lista[minIndice] = temp;
        }
    }

    // Programa de prueba
    public static void main(String[] args) {

        // Generar 100.000 números aleatorios
        int[] numeros = new int[100000];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(1000000);
        }

        // Crear objeto Cronometro
        Cronometro cron = new Cronometro();

        // Medir tiempo
        cron.inicia();
        ordenacionSeleccion(numeros);
        cron.detener();

        // Mostrar resultado
        System.out.println("Tiempo en milisegundos: " + cron.lapsoDeTiempo());
    }
}
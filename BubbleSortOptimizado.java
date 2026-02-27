import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class BubbleSortOptimizado {

    // ===== Bubble Sort Optimizado =====
    public static void bubbleSortOptimizado(int[] arreglo) {

        int n = arreglo.length;

        while (n > 0) {

            int ultimoIntercambio = 0;

            for (int i = 1; i < n; i++) {

                if (arreglo[i - 1] > arreglo[i]) {

                    // intercambio
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i - 1];
                    arreglo[i - 1] = temp;

                    ultimoIntercambio = i;
                }
            }

            n = ultimoIntercambio;
        }
    }

    // ===== Generar arreglo aleatorio =====
    public static int[] arregloAleatorio(int tamaño) {
        Random r = new Random();
        int[] arr = new int[tamaño];

        for (int i = 0; i < tamaño; i++)
            arr[i] = r.nextInt(100000);

        return arr;
    }

    // ===== Arreglo creciente =====
    public static int[] arregloCreciente(int tamaño) {
        int[] arr = new int[tamaño];
        for (int i = 0; i < tamaño; i++)
            arr[i] = i;
        return arr;
    }

    // ===== Arreglo decreciente =====
    public static int[] arregloDecreciente(int tamaño) {
        int[] arr = new int[tamaño];
        for (int i = 0; i < tamaño; i++)
            arr[i] = tamaño - i;
        return arr;
    }

    // ===== Medición =====
    public static long medirTiempo(int[] arreglo) {

        long inicio = System.nanoTime();
        bubbleSortOptimizado(arreglo);
        return System.nanoTime() - inicio;
    }

    // ===== MAIN =====
    public static void main(String[] args) {

        int[] tamaños = {100, 500, 1000, 3000, 5000};

        try {
            FileWriter archivo = new FileWriter("resultados.csv");
            archivo.write("Tipo,Tamaño,Tiempo(ns)\n");

            for (int tamaño : tamaños) {

                long t1 = medirTiempo(arregloAleatorio(tamaño));
                archivo.write("Aleatorio," + tamaño + "," + t1 + "\n");

                long t2 = medirTiempo(arregloCreciente(tamaño));
                archivo.write("Creciente," + tamaño + "," + t2 + "\n");

                long t3 = medirTiempo(arregloDecreciente(tamaño));
                archivo.write("Decreciente," + tamaño + "," + t3 + "\n");

                System.out.println("Probado tamaño: " + tamaño);
            }

            archivo.close();
            System.out.println("Archivo resultados.csv generado");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
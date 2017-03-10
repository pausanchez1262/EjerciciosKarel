package Ejercicio4.Histograma;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingresa el numero de filas: ");
        int nfilas = lectura.nextInt();
        System.out.println();
        int[] Datos = new int[nfilas];
        for(int i=0;i<nfilas;i++){
            System.out.print("Ingresa la cantidad de datos en la fila "+(i+1)+": ");
            Datos[i] = lectura.nextInt();
        }
        Histograma histograma = new Histograma(Datos);
        int a = 0;
        do {
            histograma.Siguiente();
            a = histograma.Recoger();
            histograma.Colocar();
            histograma.Devolver(a);
        } while(histograma.puedeRecoger());
    }
    
}

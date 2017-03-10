package Ejercicio2.Numeros;

public class NewMain {

    public static void main(String[] args) {
        Cuartos c = new Cuartos();
        int[] n = new int[3];
        for (int i = 0; i < 3; i++) {
            n[i] = Numero.toInt(c.evaluarCuarto());
            c.Siguiente();
            System.out.print(n[i]);
        }
    }
    
}

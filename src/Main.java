import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        int sumaNumeros = sumarnumeros(3, 300,-3);
        System.out.println("Los numeros sumados mediante la funcion son :"+sumaNumeros);
        coche miCoche = new coche();
        miCoche.incrementandoPuertas(2);
        System.out.println("cantidad de puertas del coche :"+ miCoche.cantidadPuertas);
    }

    public static int sumarnumeros (int a, int b, int c){

      int resultado = a + b + c;
        return resultado ;
    }

}
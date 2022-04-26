public class Main {
    public static void main(String[] args)
    {
        int sumaNumeros = sumarnumeros(3, 300,-3);
        System.out.println("Los numeros sumados mediante la funcion son :"+sumaNumeros);
    }

    public static int sumarnumeros (int a, int b, int c){

      int resultado = a + b + c;
        return resultado ;
    }

}
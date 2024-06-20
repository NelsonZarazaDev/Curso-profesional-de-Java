import java.util.Scanner;

public class primalidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int n= sc.nextInt();
        if(esPrimo(n)){
            System.out.println("Primo");
        }
        else {
            System.out.println("No es numero primo");
        }
    }

    static boolean esPrimo(int numero) {
        int contador = 0;
        int numeros[] = new int[numero];
        for (int i = 0; i < numero; i++) {
            numeros[i] = i + 1;
        }
        for (int i : numeros) {
            if (i == 1 || i == numero) {
                continue;
            }
            if (numero % i == 0) {
                contador++;
            }
        }
        return contador==0;
    }
}
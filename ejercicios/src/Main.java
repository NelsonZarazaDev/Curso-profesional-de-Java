import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num1 = 0, Num2 = 0, suma = 0, resta = 0;
        System.out.print("Ingresa el primer numero: ");
        Num1 = sc.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        Num2 = sc.nextInt();
        suma = Num1 + Num2;
        resta = Num1 - Num2;
        System.out.println("La suma de " + Num1 + " + " + Num2 + " es: " + suma);
        System.out.println("La resta de " + Num1 + " - " + Num2 + " es: " + resta);

        /**************************************************************************/

        int n1 = 0, n2 = 0, c = 0, r = 0;
        System.out.print("Ingresa el primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        n2 = sc.nextInt();
        c = n1 / n2;
        r = n1 % n2;
        System.out.println("Cociente: " + c);
        System.out.println("Residuo: " + r);
    }
}
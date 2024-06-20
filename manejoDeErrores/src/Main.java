import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingrese N1:");
            int n1 = sc.nextInt();
            System.out.println("Ingrese N2:");
            int n2 = sc.nextInt();
            int resultado = n1 / n2;
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
        }

    }
}
import java.util.Scanner;

public class conversorMoneda {
    public static void main(String[] args) {
        convertir(3.917, "colombia");
    }

    public static void convertir(double valorDolar, String pais) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad a convertir");
        double cantidadMoneda = sc.nextDouble();
        double dolares = cantidadMoneda * valorDolar;
        dolares = (double) Math.round(dolares);
        System.out.println(dolares);
    }
}

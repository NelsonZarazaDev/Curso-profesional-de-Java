import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la palabra");
        String palabra = sc.toString();
        if (pala(palabra)) {
            System.out.println("no lo es");
        } else {
            System.out.println("Es palindromo");
        }

    }


    public static boolean pala(String cadena){
        cadena=cadena.replace(" ", "");
        cadena= cadena.toLowerCase();

        StringBuilder cadenaInvertida = new StringBuilder();
        for (int i = cadena.length()-1; i>=0; i--){
            cadenaInvertida.append(cadena.charAt(i));
        }
        return cadena.equals(cadenaInvertida.toString());
    }
}


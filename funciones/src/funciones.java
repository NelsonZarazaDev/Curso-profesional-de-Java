public class funciones {
    public static void main(String[] args) {
        //saludar();
        double r=0, a=2.2, b=4.4;
        r = sumar(a,b);
        System.out.printf("La suma de " + a + " + " + b + " es " + r);
    }

    public static int sumar(int a, int b) {
        int r;
        r = a + b;
        return r;
    }
    public static double sumar(double a, double b) {
        double r;
        r = a + b;
        return r;
    }

    static void saludar() {
        System.out.println("Hola mundo");
    }
}

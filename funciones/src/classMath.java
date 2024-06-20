public class classMath {
    public static void main(String[] args) {
        System.out.println(Math.PI);//Valor de PI

        System.out.println(Math.E);//Valor de EULER

        System.out.println(Math.pow(3, 3)); //Elevado primero el numero segundo el elevado

        //Numeros aleatorios
        int numRandom = (int) Math.random() * 100;
        System.out.println(numRandom);

        System.out.println(Math.random()); //Numeros aleatorios de 0-1

        System.out.println((int) (Math.sqrt(64))); //Permite sacar la raiz

        System.out.println(Math.max(7, 9)); //Devuelve el numero mayor

        System.out.println(Math.min(7, 9)); //Devuelve el numero menor

        System.out.println(Math.round(5.8471)); //Devuelve el numero redondeado
    }
}

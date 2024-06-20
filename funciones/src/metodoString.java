public class metodoString {
    public static void main(String[] args) {
        String nombre = "OREGON"; //Inicia en cero
        System.out.println(nombre.charAt(2)); //Permite acceder a cualquier letra de la palabra

        System.out.println(nombre.length()); //Devuelve la cantidad de caracteres que tiene

        System.out.println(nombre.substring(0,4)); //Devuelve el trozo de los limites indicados de la palabra

        System.out.println(nombre.toLowerCase()); //Devuelve la palabra en minuscula
        System.out.println(nombre.toUpperCase()); //Devuelve la palabra en mayuscula

        nombre = "O r e g o o m";
        System.out.println(nombre.replace(" ", "")); //Reemplaza algun caracter de la palabra por otro

        System.out.println("Hola".equals("Hola")); //Devuelve true si es verdadero y false si no se cumple
        System.out.println("Hola".equals("hola"));

        StringBuilder nuevo = new StringBuilder(); //Objeto que permite almacenar caracteres
        System.out.println(nuevo);
        nuevo.append("Hola "); //Asigna caracteres al objeto
        nuevo.append("Mundo");
        System.out.println(nuevo);

        System.out.println(nuevo.toString());

    }
}

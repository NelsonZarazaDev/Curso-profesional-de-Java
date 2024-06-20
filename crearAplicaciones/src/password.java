public class password {
    public static void main(String[] args) {
        System.out.println(generarContraseña());
    }

    public static String generarContraseña() {
        char[] mayusculas = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        char[] minusculas = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char[] numeros = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        StringBuilder caracteres = new StringBuilder();
        caracteres.append(mayusculas);
        caracteres.append(minusculas);
        caracteres.append(numeros);

        StringBuilder contrasena = new StringBuilder();
        int cantidad=caracteres.length();
        for (int i =0; i<=15; i++){
            int numero= (int)(Math.random()*cantidad);
            contrasena.append(caracteres.toString().charAt(numero));
        }

        return contrasena.toString();
    }
}

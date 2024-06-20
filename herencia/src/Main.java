import herencia.Cliente;
import herencia.Empleado;
import herencia.Persona;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Nelson",'M',20,"Santa lucia");
        var fecha= new Date();
        Cliente cliente = new Cliente("Mauricio",'M',20,"Casa", 1,fecha, true);
        System.out.println(cliente);

        Empleado empleado = new Empleado("Mauricio",'M',20,"Casa", 1,20000);
        System.out.println(empleado);

        System.out.println(empleado.getNombre());

    }
}
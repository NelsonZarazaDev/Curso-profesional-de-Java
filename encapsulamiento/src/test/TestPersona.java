package test;
import encapsulamiento.*;

public class  TestPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Nelson", 20, true);
        System.out.println(persona.getNombre());
        persona.setNombre("Mauricio");
        System.out.println(persona.getNombre());

        System.out.println(persona);

    }
}

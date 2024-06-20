package herencia;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contador;

    public Empleado(String nombre, char genero, int edad, String direccion, int idEmpleado, double sueldo) {
        super(nombre, genero, edad, direccion);
        this.idEmpleado = ++Empleado.contador;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

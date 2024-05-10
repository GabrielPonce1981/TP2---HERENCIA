
public class Cajeros extends Empleado {

    public Cajeros(String dni, String nombre, String domicilio, int fechaIngreso, String categoria) {
        super(dni, nombre, domicilio, fechaIngreso, categoria);

    }

    public double calcularSueldoMensual() {
        return getSueldoBasico();
    }

}
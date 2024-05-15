
public class Cajeros extends Empleado {

    public Cajeros(String dni, String nombre, String domicilio, int fechaIngreso, String categoria) {
        super(dni, nombre, domicilio, fechaIngreso, categoria);

    }

    public double calcularSueldoMensual() {
        return getSueldoBasico();
    }

    @Override
    public void imprimirRecibo() {
        System.out.println("Recibo de sueldo Cajero");
        super.imprimirRecibo();
        System.out.println("Sueldo Mensual: " + calcularSueldoMensual());
    }

}
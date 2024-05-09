
public class Vendedores extends Empleado {
    private double ventasMensuales;
    private final double comision = 1.005;

    public Vendedores(String dni, String nombre, String domicilio, int fechaIngreso, String categoria,double ventasMensuales) {
        super(dni, nombre, domicilio, fechaIngreso, categoria);
        this.ventasMensuales = ventasMensuales;
    }

    public double calcularComisiones() {
        return ventasMensuales * comision;
    }

    public double calcularSueldoMensual() {
        return getSueldoBasico() + calcularComisiones();
    }

    @Override
    public void imprimirRecibo() {
        System.out.println("Recibo de sueldo Vendedor");
        super.imprimirRecibo();
        System.out.println("Comisiones: " + calcularComisiones());
        System.out.println("Sueldo Mensual: " + calcularSueldoMensual());
    }

    public double getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    
    }

    public double getComision() {
        return comision;
    }

}

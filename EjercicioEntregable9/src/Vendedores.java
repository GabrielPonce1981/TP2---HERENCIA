public class Vendedores extends Empleado {
    private double ventasMensuales;
 
    
    public Vendedores( String dni, String nombre, String domicilio, int fechaIngreso, double ventasMensuales, double sueldoBasico, Categoria categoria) {
        super(dni, nombre, domicilio, fechaIngreso, sueldoBasico, categoria);
        this.ventasMensuales = ventasMensuales;
    }

    public double calcularSueldoMensual() {
        return sueldoBasico + (ventasMensuales * 1.5);
    }

    public double getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    
    }



    




}

public class Empleado {
    private String dni;
    private String nombre;
    private String domicilio;
    private int fechaIngreso;
    private final double sueldoBasico = 650000;
    private String categoria;
    public Empleado(String dni, String nombre, String domicilio, int fechaIngreso, String categoria) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.fechaIngreso = fechaIngreso;
        this.categoria = categoria;
    }

    public void imprimirRecibo() {
        System.out.println("nombre: " + getNombre());
        System.out.println("DNI: " + getDni());
        System.out.println("Domicilio: " + getDomicilio());
        System.out.println("Fecha de ingreso: " + getFechaIngreso());
        System.out.println("categoria: " + getcategoria());
        System.out.println("Sueldo Basico: " + getSueldoBasico());
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getFechaIngreso() {
        return fechaIngreso;
    }

    public String getcategoria() {
        return categoria;
    }

    public void setcategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
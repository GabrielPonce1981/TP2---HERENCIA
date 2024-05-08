public class Empleado {
    private String dni;
    private String nombre;
    private String domicilio;
    private int fechaIngreso;
    protected double sueldoBasico;

    
    public Empleado(String dni, String nombre, String domicilio, int fechaIngreso, double sueldoBasico) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.fechaIngreso = fechaIngreso;
        this.sueldoBasico = sueldoBasico;    
    }


    public void imprimirRecibo(){

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


    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }


    public double getSueldoBasico() {
        return sueldoBasico;
    }


    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    

    



}

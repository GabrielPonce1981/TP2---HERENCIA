public class Cajeros extends Empleado {
  
  
    public Cajeros(String dni, String nombre,  String domicilio, int fechaIngreso, double sueldoBasico, Categoria categoria) {
        super(dni, nombre, domicilio, fechaIngreso, sueldoBasico, categoria);
        
    }
  
    public double calcularSueldoMensual(){
        return sueldoBasico;
    }

}

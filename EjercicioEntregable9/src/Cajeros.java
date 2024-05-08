public class Cajeros extends Empleado {
  
  
    public Cajeros(String dni, String nombre,  String domicilio, int fechaIngreso, double sueldoBasico) {
        super(dni, nombre, domicilio, fechaIngreso, sueldoBasico);
        
    }
  
    public double calcularSueldoMensual(){
        return sueldoBasico;
    }

}

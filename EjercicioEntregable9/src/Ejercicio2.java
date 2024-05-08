public class Ejercicio2 extends Empleado {
    public Ejercicio2(String dni, String nombre, String domicilio, int fechaIngreso, double sueldoBasico, Categoria categoria) {
        super(dni, nombre, domicilio, fechaIngreso, sueldoBasico, categoria);
    }

    public void imprimirRecibo (String nombre, String dni, String domicilio, int fechaIngreso, double sueldoBasico) {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println("Sueldo basico: " + sueldoBasico);
        System.out.println("Categoria: " + categoria);
        
    }
}

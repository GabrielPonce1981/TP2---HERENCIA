public class DeptoFamiliar extends Apartamento {
    public DeptoFamiliar(int id, double valorM2, double tamanioM2, String direccion, int numeroHabitaciones, int numeroBanios) {
        super(id, valorM2, tamanioM2, direccion, numeroHabitaciones, numeroBanios );
      }
    
      @Override
      public void imprimir() {
        System.out.println("Imprimiendo datos de la Depto Familiar ");
        super.imprimir();
        System.out.println("Numero de habitaciones: " + getNumeroHabitaciones());
        System.out.println("Numero de banios: " + getNumeroBanios());
        System.out.println("Precio de venta: " + calcularPrecioInmueble());
      }
    
}

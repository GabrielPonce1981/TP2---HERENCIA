public class CasaRural extends Casa {

  private final double precioMetroCuadrado = 1500000;
  //Constructor
  public CasaRural(char[] id, float valorM2, float tamanioM2, String direccion, float valorEnM2, int numeroHabitaciones, int numeroBanios) {
    super(id, valorM2, tamanioM2, direccion, numeroHabitaciones, numeroBanios);
  }

  public double calcularPrecioCasaRural() {
    return getValorM2() * getTamanioM2() * precioMetroCuadrado;
  }
  
  public void imprimir() {
    System.out.println("Imprimiendo datos de la Casa Rural ");
    super.imprimir();
    System.out.println("Numero de habitaciones: " + getNumeroHabitaciones());
    System.out.println("Numero de banios: " + getNumeroBanios());
    System.out.println("Precio de venta: " + calcularPrecioCasaRural());
    
  }

}
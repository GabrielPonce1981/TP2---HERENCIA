public class CasaIndependiente extends Casa {

  private final double preciometrocuadrado = 200000.0;
  
  
  public CasaIndependiente(char[] id, float valorM2, float tamanioM2, String direccion,int numeroHabitaciones, int numeroBanios) {
    super(id, valorM2, tamanioM2, direccion, numeroHabitaciones, numeroBanios);

  }

  public double calcularPrecioCasaIndependiente() {
    return getValorM2()* getTamanioM2()* preciometrocuadrado;
  }



  @Override
  public void imprimir() {
    System.out.println("Imprimiendo datos de la casa");
    super.imprimir();
    System.out.println("Numero de habitaciones: " + getNumeroHabitaciones());
    System.out.println("Numero de banios: " + getNumeroBanios());
    System.out.println("Precio de venta: " + calcularPrecioCasaIndependiente());

  }


}
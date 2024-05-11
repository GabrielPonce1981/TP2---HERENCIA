public class CasaRural extends Casa {

  private static final double precioMetroCuadrado = 1500000;
  //Constructor
  public CasaRural(char[] id, float valorM2, float tamanioM2, String direccion, float valorEnM2, int numeroHabitaciones, int numeroBanios) {
    super(id, valorM2, tamanioM2, direccion, numeroHabitaciones, numeroBanios);
  }

  public void imprimir() {
  }

}
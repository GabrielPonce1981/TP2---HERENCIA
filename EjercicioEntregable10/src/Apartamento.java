public class Apartamento extends Inmueble {

  private int numeroHabitaciones;
  private int numeroBanios;

  //Constructor
  public Apartamento(char[] id, float valorM2, float tamanioM2, String direccion, int numeroHabitaciones, int numeroBanios) {
    super(id, valorM2, tamanioM2, direccion);
    this.numeroHabitaciones = numeroHabitaciones;
    this.numeroBanios = numeroBanios;
  }

  public void imprimir() {
  }

}
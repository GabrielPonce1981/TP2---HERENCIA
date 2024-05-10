public class Apartamento extends Inmueble {

  public int numeroHabitaciones;
  public int numeroBanios;

  //Constructor
  public Apartamento(float valorM2, float tamanioM2, Integer numeroHabitaciones, Integer numeroBanios) {
    super(valorM2, tamanioM2);
    this.numeroHabitaciones = numeroHabitaciones;
    this.numeroBanios = numeroBanios;
  }

  public void imprimir() {
  }

}
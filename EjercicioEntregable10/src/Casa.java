public class Casa extends Inmueble {

  public int numeroHabitaciones;
  public int numeroBanios;

  //Constructor
  public Casa(float valorM2, float tamanioM2, int numeroHabitaciones, int numeroBanios) {
    super(valorM2, tamanioM2);
    this.numeroHabitaciones = numeroHabitaciones;
    this.numeroBanios = numeroBanios;
  }
  
  public void imprimir() {
  }

}
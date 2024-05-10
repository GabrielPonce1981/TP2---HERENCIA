public class CasaIndependiente extends Casa {

  public float valorEnM2;

  //Constructor
  public CasaIndependiente(float valorM2, float tamanioM2, float valorEnM2, int numeroHabitaciones, int numeroBanios) {
    super(valorM2, tamanioM2, numeroHabitaciones, numeroBanios);
    this.valorEnM2 = valorEnM2;
  }

  public void imprimir() {
  }

}
public class Vivienda extends Inmueble {
    private int numeroHabitaciones;
    private int numeroBanios;
  
    //Constructor
    public Vivienda(int id, double valorM2, double tamanioM2, String direccion, int numeroHabitaciones, int numeroBanios) {
      super(id, valorM2, tamanioM2, direccion);
      this.numeroHabitaciones = numeroHabitaciones;
      this.numeroBanios = numeroBanios;
    }
  
    public int getNumeroHabitaciones() {
      return numeroHabitaciones;
    }
  
    public void setNumeroHabitaciones(int numeroHabitaciones) {
      this.numeroHabitaciones = numeroHabitaciones;
    }
  
    public int getNumeroBanios() {
      return numeroBanios;
    }
  
    public void setNumeroBanios(int numeroBanios) {
      this.numeroBanios = numeroBanios;
    }
}

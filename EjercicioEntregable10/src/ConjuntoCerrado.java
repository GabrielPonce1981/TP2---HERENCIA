public class ConjuntoCerrado extends Vivienda {

  public float valorAdministracion;
  public boolean incluyeAreasComunes;
  private static final double precioMetroCuadrado = 2500000;

  //Constructor
  public ConjuntoCerrado(char[] id, float valorM2, float tamanioM2, String direccion, float valorAdministracion, boolean incluyeAreasComunes, float valorEnM2, Integer numeroHabitaciones, Integer numeroBanios) {
    super(id, valorM2, tamanioM2, direccion, numeroHabitaciones, numeroBanios);
    this.valorAdministracion = valorAdministracion;
    this.incluyeAreasComunes = incluyeAreasComunes;
    }

  public void imprimir() {
  }

}
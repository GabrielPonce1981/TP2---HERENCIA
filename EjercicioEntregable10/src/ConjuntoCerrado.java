public class ConjuntoCerrado extends Casa {

  public float valorAdministracion;
  public boolean incluyeAreasComunes;
  public float valorEnM2;

  //Constructor
  public ConjuntoCerrado(float valorM2, float tamanioM2, float valorAdministracion, boolean incluyeAreasComunes, float valorEnM2, Integer numeroHabitaciones, Integer numeroBanios) {
    super(valorM2, tamanioM2, numeroHabitaciones, numeroBanios);
    this.valorAdministracion = valorAdministracion;
    this.incluyeAreasComunes = incluyeAreasComunes;
    this.valorEnM2 = valorEnM2;
  }

  public void imprimir() {
  }

}
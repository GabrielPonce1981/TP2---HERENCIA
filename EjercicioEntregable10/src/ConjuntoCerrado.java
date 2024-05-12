public class ConjuntoCerrado extends Vivienda {

  public float valorAdministracion;
  public boolean incluyeAreasComunes;


  public ConjuntoCerrado(int id, float valorM2, float tamanioM2, String direccion, float valorAdministracion, boolean incluyeAreasComunes, float valorEnM2, Integer numeroHabitaciones, Integer numeroBanios) {
    super(id, valorM2, tamanioM2, direccion, numeroHabitaciones, numeroBanios);
    this.valorAdministracion = valorAdministracion;
    this.incluyeAreasComunes = incluyeAreasComunes;
    }


  @Override  
  public void imprimir() {
    System.out.println("Imprimiendo datos de un Conjunto Cerrado ");
    super.imprimir();
    System.out.println("Valor de la administracion: " + getValorAdministracion());
    System.out.println("Incluye areas comunes: " + getIncluyeAreasComunes());
    System.out.println("Precio de venta: " + calcularPrecioInmueble());
  
  }


  public float getValorAdministracion() {
    return valorAdministracion;
  }


  public void setValorAdministracion(float valorAdministracion) {
    this.valorAdministracion = valorAdministracion;
  }


  public boolean getIncluyeAreasComunes() {
    return incluyeAreasComunes;
  }


  public void setIncluyeAreasComunes(boolean incluyeAreasComunes) {
    this.incluyeAreasComunes = incluyeAreasComunes;
  }



  
}
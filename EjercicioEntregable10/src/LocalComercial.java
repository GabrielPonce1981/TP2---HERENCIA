public class LocalComercial extends Comercial {

  public String centroComercial;

  //Constructor
  public LocalComercial(float valorM2, float tamanioM2, boolean aLaCalle, String centroComercial) {
    super(valorM2, tamanioM2, aLaCalle);
    this.centroComercial = centroComercial;
  }

  public void imprimir() {
  }

}
public class Comercial extends Inmueble {

  public boolean aLaCalle;

  //Constructor
  public Comercial(float valorM2, float tamanioM2, boolean aLaCalle) {
    super(valorM2, tamanioM2);
    this.aLaCalle = aLaCalle;
  }

  public void imprimir() {
  }

}
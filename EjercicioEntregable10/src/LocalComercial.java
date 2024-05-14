public class LocalComercial extends Comercial {
    public String centroComercial;

    public LocalComercial(int id, double valorM2, double tamanioM2, boolean aLaCalle, String direccion,
        String centroComercial) {
      super(id, valorM2, tamanioM2, aLaCalle, direccion);
      this.centroComercial = centroComercial;
    }

    @Override  
    public void imprimir() {
      System.out.println("Imprimiendo datos de Local Comercial");
      super.imprimir();
      System.out.println("Centro Comercial: " + getCentroComercial());
      System.out.println("Local a la calle: " + getaLaCalle());
      System.out.println("Precio de venta: " + calcularPrecioInmueble());
  
    }
  
    public String getCentroComercial() {
      return centroComercial;
    }
  
    public void setCentroComercial(String centroComercial) {
      this.centroComercial = centroComercial;
    }
  
    
  
}

public class Oficina extends Comercial {
    public Oficina(int id, double valorM2, double tamanioM2, String direccion, boolean aLaCalle) {
        super(id, valorM2, tamanioM2, aLaCalle, direccion);
      }
    
      @Override
      public void imprimir() {
        System.out.println("Imprimiendo datos de la Oficina ");
        super.imprimir();
        System.out.println("Precio de venta: " + calcularPrecioInmueble());
    
      }
}

public class App {
    public static void main(String[] args) throws Exception {
      
        
        Titular titular1 = new Titular("24879635", "Pedro", "Salustri", "pedrosalus@gmail.com", "291-4854785");

        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("Visa", "Banco Nacion", "4852-8596-7845-0254", 15000, titular1);

        System.out.println("La tarjeta seleccionada tiene un monto equivalente a: $ " + tarjeta1.getSaldoDisponible());
        System.out.println();
        
        Posnet posnet = new Posnet();

        posnet.efectuarCobro(tarjeta1, 5000, 5); 

    }
}

public class App {
    public static void main(String[] args) throws Exception {
      
        
        Titular titular = new Titular("Juan", "Perez");
        TarjetadeCredito tarjeta = new TarjetadeCredito("1234567890", "VISA" , 1000, titular);

        Posnet posnet = new Posnet();

        posnet.cobrar(tarjeta, 1500, 1);


    }
}

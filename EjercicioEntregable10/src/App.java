public class App {
    public static void main(String[] args) throws Exception {
        
      //Crear un objeto de la clase CasaRural
        CasaRural casaRural = new CasaRural(00001, 1000000, 100, "Calle 10 #10-05", 10, 5);

        System.out.println("Imprimiendo datos de la Casa Rural");
        casaRural.imprimir();
        

    }
}

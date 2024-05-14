public class App {
    public static void main(String[] args) throws Exception {
       //Crear un objeto de la clase CasaRural
        CasaRural casaRural = new CasaRural(00001, 1500000, 250, "Yrigoyen 256", 10, 2);
        DeptoFamiliar deptoFamiliar = new DeptoFamiliar(00002, 1800000, 100, "Fitz Roy 422", 3, 1);
       System.out.println("Datos de la Casa Rural");
       casaRural.imprimir();
       System.out.println("Datos del Departamento Familiar");
       deptoFamiliar.imprimir();
    }
}

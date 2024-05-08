public class App {
    public static void main(String[] args) throws Exception {
       
        Vendedores vendedor1 = new Vendedores("123654852", "Pedro", "las Heras 452", 2012, 95000, 650000, Categoria.VENDEDOR);
        System.out.println("El sueldo del vendedor " + vendedor1.getNombre() +" es de $ " + vendedor1.calcularSueldoMensual());    
        System.out.println("\n");

        Administrativos administrativos1 = new Administrativos("163657552", "Javier", "San Martin 1158", 2020,"Completa", 650000, Categoria.ADMINISTRATIVO);
        System.out.println("El sueldo del administrativo " + administrativos1.getNombre() +" es de $ " + administrativos1.calcularSueldomensual());
        System.out.println("\n");
        Cajeros cajeros1 = new Cajeros("383851236", "Monica", "Posta Rolando 3371", 2018, 650000, Categoria.CAJERO);
        System.out.println("El sueldo del cajero " + cajeros1.getNombre() +" es de $ " + cajeros1.calcularSueldoMensual());
        System.out.println("\n");
        Repartidores repartidores1 = new Repartidores("253855214", "Hernan", "Colon 15", 2021, 650000, 12, Categoria.REPARTIDOR);
        System.out.println("El sueldo del repartidor " + repartidores1.getNombre() +" es de $ " + repartidores1.calcularSueldoMensual());
        System.out.println("\n");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
       
    Repartidores repartidores1 = new Repartidores("253855214", "Hernan", "Colon 15", 2021, 650000, 12, Categoria.REPARTIDOR);
    Cajeros cajeros1 = new Cajeros("383851236", "Monica", "Posta Rolando 3371", 2018, 650000, Categoria.CAJERO);
    Vendedores vendedor1 = new Vendedores("123654852", "Pedro", "las Heras 452", 2012, 95000, 650000, Categoria.VENDEDOR);
    Administrativos administrativos1 = new Administrativos("163657552", "Javier", "San Martin 1158", 2020,"Completa", 650000, Categoria.ADMINISTRATIVO);
    
    imprimirRecibo(repartidores1.getNombre(), repartidores1.getDni(), repartidores1.getDomicilio(), repartidores1.getFechaIngreso(), repartidores1.sueldoBasico, repartidores1.categoria);
    imprimirRecibo(cajeros1.getNombre(), cajeros1.getDni(), cajeros1.getDomicilio(), cajeros1.getFechaIngreso(), cajeros1.sueldoBasico, cajeros1.categoria);
    imprimirRecibo(vendedor1.getNombre(), vendedor1.getDni(), vendedor1.getDomicilio(), vendedor1.getFechaIngreso(), vendedor1.sueldoBasico, vendedor1.categoria);
    imprimirRecibo(administrativos1.getNombre(), administrativos1.getDni(), administrativos1.getDomicilio(), administrativos1.getFechaIngreso(), administrativos1.sueldoBasico, administrativos1.categoria);
}

public static void imprimirRecibo (String nombre, String dni, String domicilio, int fechaIngreso, double sueldoBasico, Categoria categoria) 
    {
        Repartidores repartidores1 = new Repartidores("253855214", "Hernan", "Colon 15", 2021, 650000, 12, Categoria.REPARTIDOR);
        Cajeros cajeros1 = new Cajeros("383851236", "Monica", "Posta Rolando 3371", 2018, 650000, Categoria.CAJERO);
        Vendedores vendedor1 = new Vendedores("123654852", "Pedro", "las Heras 452", 2012, 95000, 650000, Categoria.VENDEDOR);
        Administrativos administrativos1 = new Administrativos("163657552", "Javier", "San Martin 1158", 2020,"Completa", 650000, Categoria.ADMINISTRATIVO);
    
        if (categoria == Categoria.REPARTIDOR) {
            System.out.println("Nombre: " + nombre);
            System.out.println("DNI: " + dni);
            System.out.println("Domicilio: " + domicilio);
            System.out.println("Fecha de ingreso: " + fechaIngreso);
            System.out.println("Categoria: Repartidor");
            System.out.println("Sueldo basico: " + sueldoBasico);
            System.out.println("Repartos extras: " + repartidores1.getRepartosExtras());
            System.out.println("Sueldo mensual: " + repartidores1.calcularSueldoMensual());
            System.out.println("\n");
        } else if (categoria == Categoria.CAJERO) {
            System.out.println("Nombre: " + cajeros1.getNombre());
            System.out.println("DNI: " + cajeros1.getDni());
            System.out.println("Domicilio: " + cajeros1.getDomicilio());
            System.out.println("Fecha de ingreso: " + cajeros1.getFechaIngreso());
            System.out.println("Categoria: Cajero");
            System.out.println("Sueldo basico: " + cajeros1.getSueldoBasico());
            System.out.println("Sueldo mensual: " + cajeros1.calcularSueldoMensual());
            System.out.println("\n");
                        
        } else if (categoria == Categoria.VENDEDOR) {
            System.out.println("Nombre: " + vendedor1.getNombre());
            System.out.println("DNI: " + vendedor1.getDni());
            System.out.println("Domicilio: " + vendedor1.getDomicilio());
            System.out.println("Fecha de ingreso: " + vendedor1.getFechaIngreso());
            System.out.println("Categoria: Vendedor");
            System.out.println("Sueldo basico: " + vendedor1.getSueldoBasico());
            System.out.println("Ventas: " + vendedor1.getVentasMensuales());
            System.out.println("Sueldo mensual: " + vendedor1.calcularSueldoMensual());
            System.out.println("\n");

        } else {
            System.out.println("Nombre: " + administrativos1.getNombre());
            System.out.println("DNI: " + administrativos1.getDni());
            System.out.println("Domicilio: " + administrativos1.getDomicilio());
            System.out.println("Fecha de ingreso: " + administrativos1.getFechaIngreso());
            System.out.println("Categoria: Administrativo");
            System.out.println("Sueldo basico: " + administrativos1.getSueldoBasico());
            System.out.println("Jornada laboral: " + administrativos1.getJornadaLaboral());
            System.out.println("Sueldo mensual: " + administrativos1.calcularSueldomensual());
            System.out.println("\n");
        } 
        
    }
}
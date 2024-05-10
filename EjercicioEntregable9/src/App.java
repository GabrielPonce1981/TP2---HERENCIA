public class App {
        public static void main(String[] args) throws Exception {

                Vendedores vendedor1 = new Vendedores("123654852", "Pedro", "las Heras 452", 2012, "Vendedor", 95000);
                System.out.println("El sueldo del vendedor " + vendedor1.getNombre() + " es de $ "
                                + vendedor1.calcularSueldoMensual());
                System.out.println("\n");

                Administrativos administrativos1 = new Administrativos("163657552", "Javier", "San Martin 1158", 2020,
                                "Administrativo", "Completa");
                System.out.println("El sueldo del administrativo " + administrativos1.getNombre() + " es de $ "
                                + administrativos1.calcularSueldomensual());
                System.out.println("\n");
                Cajeros cajeros1 = new Cajeros("383851236", "Monica", "Posta Rolando 3371", 2018, "Cajero");
                System.out.println("El sueldo del cajero " + cajeros1.getNombre() + " es de $ "
                                + cajeros1.calcularSueldoMensual());
                System.out.println("\n");
                Repartidores repartidores1 = new Repartidores("253855214", "Hernan", "Colon 15", 2021, "Repartidor",
                                12);
                System.out.println("El sueldo del repartidor " + repartidores1.getNombre() + " es de $ "
                                + repartidores1.calcularSueldoMensual());

                System.out.println("\n");
                Vendedores sueldovendedor1 = new Vendedores("123654852", "Pedro", "las Heras 452", 2012, "Vendedor",
                                63000);
                Empleado sueldoAdmistrativo1 = new Administrativos("32654852", "Lorena Paez", "Reconquista 15", 2018,
                                "Administrativo", "media jornada");
                Repartidores suelRepartidores = new Repartidores("14235121", "Martin Lopez", "San Martin 436", 2014,
                                "Repartidor", 10);
                Empleado sueldoCajeros = new Cajeros("41258965", "Vanina Figueroa", "Quiroga 4356", 2022, "Cajero");

                Ejercicio2.imprimirRecibo(sueldovendedor1);
                System.out.println("\n");
                Ejercicio2.imprimirRecibo(sueldoAdmistrativo1);
                System.out.println("\n");
                Ejercicio2.imprimirRecibo(suelRepartidores);
                System.out.println("\n");
                Ejercicio2.imprimirRecibo(sueldoCajeros);
                System.out.println("\n");
        }
}
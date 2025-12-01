public class Main {
    public static void main(String[] args) {
      
        GestorEnvios gestor = new GestorEnvios();
        
        System.out.println("=== SISTEMA DE GESTIÓN DE ENVÍOS ===\n");
        
 
        EnvioLocal envioLocal1 = new EnvioLocal("LOC001", "Juan Pérez", 25.50, 50);
        EnvioLocal envioLocal2 = new EnvioLocal("LOC002", "María García", 18.75, 30);
        
     
        EnvioInternacional envioInt1 = new EnvioInternacional("INT001", "Carlos López", 100.00, 15.50);
        EnvioInternacional envioInt2 = new EnvioInternacional("INT002", "Ana Rodríguez", 150.00, 22.75);
        
       
        gestor.agregarEnvio(envioLocal1);
        gestor.agregarEnvio(envioLocal2);
        gestor.agregarEnvio(envioInt1);
        gestor.agregarEnvio(envioInt2);
        
        System.out.println("\nTotal de envíos registrados: " + gestor.getCantidadEnvios());
        

        gestor.mostrarEnvios();
        
        
        double costoTotal = gestor.calcularCostoTotal();
        System.out.printf("\n=== COSTO TOTAL DE TODOS LOS ENVÍOS: $%.2f ===\n", costoTotal);
        
       
        System.out.println("\n=== DEMOSTRACIÓN DE POLIMORFISMO ===");
        
        
        Envio[] listaEnvios = new Envio[2];
        listaEnvios[0] = new EnvioLocal("LOC003", "Pedro Sánchez", 30.00, 40);
        listaEnvios[1] = new EnvioInternacional("INT003", "Laura Martínez", 120.00, 18.00);
        
       
        for (Envio envio : listaEnvios) {
            System.out.println(envio.obtenerDetalles()); 
        }
    }
}
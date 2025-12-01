public class GestorEnvios {
    private Envio[] envios;
    private int contador;
    
   
    public GestorEnvios() {
        envios = new Envio[4];
    }
    
    // Método para agregar envíos
    public void agregarEnvio(Envio envio) {
        if (contador < envios.length) {
            envios[contador] = envio;
            contador++;
            System.out.println("Envío agregado exitosamente: " + envio.getCodigo());
        } else {
            System.out.println("No hay espacio disponible para más envíos");
        }
    }
    

    public void mostrarEnvios() {
        System.out.println("\n=== LISTA DE ENVÍOS ===");
        for (int i = 0; i < contador; i++) {
            System.out.println(envios[i].obtenerDetalles()); 
        }
    }
    
 
    public double calcularCostoTotal() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            if (envios[i] instanceof EnvioInternacional) {
                EnvioInternacional envioInt = (EnvioInternacional) envios[i];
                total += envioInt.calcularCostoTotal();
            } else if (envios[i] instanceof EnvioLocal) {
             
                total += envios[i].getCostoBase();
            }
        }
        return total;
    }
    
   
    public int getCantidadEnvios() {
        return contador;
    }
}
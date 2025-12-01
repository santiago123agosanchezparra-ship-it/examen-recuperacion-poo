public class EnvioInternacional extends Envio {
    private double impuestoAduana;
    
   
    public EnvioInternacional(String codigo, String destinatario, double costoBase, 
                              double impuestoAduana) {
        super(codigo, destinatario, costoBase); 
        this.impuestoAduana = impuestoAduana;
    }
    
    public double getImpuestoAduana() {
        return impuestoAduana;
    }
    
  
    public void setImpuestoAduana(double impuestoAduana) {
        this.impuestoAduana = impuestoAduana;
    }
    
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + " - Impuesto Aduana: $" + impuestoAduana;
    }
    
    public double calcularCostoTotal() {
        return getCostoBase() + impuestoAduana;
    }
}
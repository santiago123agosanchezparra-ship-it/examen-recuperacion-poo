public class EnvioLocal extends Envio {
    private int distanciaKm;
    

    public EnvioLocal(String codigo, String destinatario, double costoBase, int distanciaKm) {
        super(codigo, destinatario, costoBase); 
        this.distanciaKm = distanciaKm;
    }
    
    
    public int getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(int distanciaKm) {
        this.distanciaKm = distanciaKm;
    }
    
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + " - Distancia: " + distanciaKm + " km";
    }
}
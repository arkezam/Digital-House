package veterinaria;

public class CajaProvisiones {

    Double peso;
    String origen;
    String proveedor;
    Consultorio consultorioDestino;
    String descripcion;
    Boolean transporteConCuidado;

    public CajaProvisiones(Double peso, String origen, String proveedor, Consultorio consultorioDestino, String descripcion, Boolean transporteConCuidado) {
        this.peso = peso;
        this.origen = origen;
        this.proveedor = proveedor;
        this.consultorioDestino = consultorioDestino;
        this.descripcion = descripcion;
        this.transporteConCuidado = transporteConCuidado;
    }
}

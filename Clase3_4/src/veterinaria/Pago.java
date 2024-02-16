package veterinaria;

public class Pago {
    private Cliente cliente;
    private Double deuda;

    public Pago(Cliente cliente, Double deuda) {
        this.cliente = cliente;
        this.deuda = deuda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Double getDeuda() {
        return deuda;
    }

    public void realizarPago(){

    }
}

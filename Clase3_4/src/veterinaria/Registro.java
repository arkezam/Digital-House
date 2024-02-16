package veterinaria;

public class Registro {
    private Cliente cliente;
    private Mascota mascota;

    public Registro(Cliente cliente, Mascota mascota) {
        this.cliente = cliente;
        this.mascota = mascota;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
}

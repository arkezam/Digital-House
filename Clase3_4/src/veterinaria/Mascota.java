package veterinaria;

public class Mascota {
    private String tipo;
    private Cliente dueño;
    private Double peso;
    private Double talla;
    private Integer edad;
    private enum estado{MALO, BUENO, MUY_BUENO}

    public Mascota(String tipo, Cliente cliente, Integer edad) {
        this.tipo = tipo;
        this.dueño = cliente;
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getDueño() {
        return dueño;
    }

    public void setDueño(Cliente dueño) {
        this.dueño = dueño;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getTalla() {
        return talla;
    }

    public void setTalla(Double talla) {
        this.talla = talla;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}

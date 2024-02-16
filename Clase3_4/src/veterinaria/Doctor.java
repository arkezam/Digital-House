package veterinaria;

public class Doctor {
    private String nombre;
    private Consultorio consultorio;

    public Doctor(String nombre, Consultorio consultorio) {
        this.nombre = nombre;
        this.consultorio = consultorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
}

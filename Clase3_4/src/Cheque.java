import java.time.LocalDate;

public class Cheque {
    private String tipoCheque;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private String nombreTitular;
    public Cheque(String nombreTitular, String tipoCheque, LocalDate fechaEmision, LocalDate fechaVencimiento) {
        this.nombreTitular = nombreTitular;
        this.tipoCheque = tipoCheque;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String endoso(String nombreNuevoTitular){
    //transferencia de cheque
        //TODO: Implementar funcion
        nombreTitular = nombreNuevoTitular;

        return "El nuevo titular es: " + nombreNuevoTitular;
    }
    public LocalDate plazoMaximo(){
        return fechaVencimiento.plusDays(30);
    }


}

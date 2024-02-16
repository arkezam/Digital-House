import java.time.LocalDate;

public class Cheque {
    private String nombreTitular;
    private String tipoCheque;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private Double montoCheque;

    public Cheque(String nombreTitular, String tipoCheque, LocalDate fechaEmision, LocalDate fechaVencimiento, Double montoCheque) {
        this.nombreTitular = nombreTitular;
        this.tipoCheque = tipoCheque;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.montoCheque = montoCheque;
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

    public String getNombreTitular() {
        return nombreTitular;
    }
    public String pagarConCheque(Double montoAPagar){

        if(montoAPagar < montoCheque){
            montoCheque = montoCheque - montoAPagar;
            return "Se realizao el pago con el cheque";
        }
        else {
            return "El monto a pagar excede al monto del Cheque";
        }

    }
}

import java.util.Scanner;

public class CajaDeAhorros {
    private String nombreTitular;
    private Double saldo;
    private String numeroCuenta;
    private String tipoCuenta;
    public CajaDeAhorros(String nombreTitular, Double saldo, String numeroCuenta) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }
    public String retirar(Double catidadRetirada){
        System.out.println("---------Verificar Datos--------");
        System.out.println(verificarNombre());
        System.out.println("Escriba \"SI\" para confirmar \"NO\" para corregir");
        Scanner sc = new Scanner(System.in);
        String valida = sc.next();
        valida = valida.toUpperCase();
        if (valida.equals("SI")){
            if (catidadRetirada > saldo){
                return "La cantidad deseada excede al saldo de su cuenta";
            }
            else {
                saldo = saldo - catidadRetirada;
                return "Se ha retirado: " + catidadRetirada + "\nSu saldo ahora es: " + getSaldo();
            }
        }else {
            return "Nombre no validado, saliendo...";
        }
    }

    public String depositar(Double cantidadDeposito){

        try {
            saldo = saldo + cantidadDeposito;
            return "Se ha realizado la Transaccion";

        }catch (Exception e){
            return "Ocurrio un Error" + new Throwable(e);
        }
    }

    public String RealizarTransferencia(CajaDeAhorros otraCuenta, Double cantidadTransferida){
        if(otraCuenta.saldo > cantidadTransferida){
            saldo = saldo + cantidadTransferida;
            otraCuenta.saldo = otraCuenta.saldo - cantidadTransferida;
            return "Se ha transferido el monto";
        }else {
            return "El monto a transferir excede al saldo de la cuenta origen";
        }

    }
    private String verificarNombre(){
        return "Nombre de Titular: " + getNombreTitular();
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public Double getSaldo() {
        return saldo;
    }


}

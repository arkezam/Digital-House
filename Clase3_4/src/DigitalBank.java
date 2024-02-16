public class DigitalBank {
    public static void main(String[] args) {

        CajaDeAhorros tioRico = new CajaDeAhorros( "el Tio Rico",1000.0,"654-987-321");
        CajaDeAhorros otraCuenta = new CajaDeAhorros("Alfredd", 1500.00,"123-212-122");
        System.out.println(tioRico.retirar(2500.0));
        tioRico.RealizarTransferencia(otraCuenta,100.00);

        System.out.println(tioRico.getSaldo());
        System.out.println(otraCuenta.getSaldo());




    }
}
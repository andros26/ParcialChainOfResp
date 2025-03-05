package Servicios;

public class CHandle20k extends BHandleBilletes{

    @Override
    public void solicitudBilletes(int cantidad) {

        if (cantidad % 5000 != 0) {
            throw new IllegalArgumentException("Error: La cantidad debe ser múltiplo de 5.000");
        } else {

            int Denominacion = 20000;

            int numBilletes = cantidad / Denominacion;

            if (numBilletes > 0) {
                System.out.println("Dispensador20k  procesó la solicitud: " + numBilletes + " billetes de " + Denominacion);
                cantidad = cantidad % Denominacion;
                super.solicitudBilletes(cantidad);

            } else {
                super.solicitudBilletes(cantidad);
            }

        }

    }


}

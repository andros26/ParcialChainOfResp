import Servicios.CHandle100k;
import Servicios.CHandle10k;
import Servicios.CHandle20k;
import Servicios.CHandle50k;
import Servicios.CHandle5k;
import Servicios.IHandlerBilletes;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        IHandlerBilletes h1 = new CHandle100k();
        IHandlerBilletes h2 = new CHandle50k();
        IHandlerBilletes h3 = new CHandle20k();
        IHandlerBilletes h4 = new CHandle10k();
        IHandlerBilletes h5 = new CHandle5k();

        System.out.println("Ingrese el monto a retirar(múltiplo de 5000):");
        int monto =leer.nextInt();
        leer.close();
        h1.setNext(h2);
        h2.setNext(h3);
        h3.setNext(h4);
        h4.setNext(h5);


         h1.solicitudBilletes(monto);  // Cajero: Ingresa cantidad
    }
}

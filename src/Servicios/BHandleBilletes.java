package Servicios;

public abstract class BHandleBilletes implements IHandlerBilletes {

    protected IHandlerBilletes next;  // No puede ser (private) por que no se podria acceder desde las clases hijas

    @Override
    public void setNext(IHandlerBilletes handlerBilletes) {
        this.next = handlerBilletes;
    }

    @Override
    public void solicitudBilletes(int cantidad) {
        if (next != null) {
            next.solicitudBilletes(cantidad);    // request
        }
    }

}

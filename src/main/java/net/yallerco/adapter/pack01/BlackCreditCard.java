package net.yallerco.adapter.pack01;

public class BlackCreditCard implements ISecure {

    @Override
    public void payWithSecureLevelA() {
        System.out.println("Tarjeta Black: Pagando con Seguridad ALTA nivel A");
    }

    @Override
    public void payWithSecureLevelZ() {
        //no implementar
    }
}

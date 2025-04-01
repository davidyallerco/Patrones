package net.yallerco.adapter.pack01;

public class GoldCreditCard implements ISecure{
    @Override
    public void payWithSecureLevelA() {
        //no implementar
    }

    @Override
    public void payWithSecureLevelZ() {
        System.out.println("Tarjeta Gold: Pagando con Seguridad BAJA nivel Z");
    }
}

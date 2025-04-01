package net.yallerco.factorymethod.pack05;

public class CardPayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Pagando con Tarjeta de Credito");
    }
}

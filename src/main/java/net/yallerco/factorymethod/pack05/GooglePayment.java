package net.yallerco.factorymethod.pack05;

public class GooglePayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Pagando con google payment");
    }
}

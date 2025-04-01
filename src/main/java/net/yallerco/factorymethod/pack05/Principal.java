package net.yallerco.factorymethod.pack05;

public class Principal {
    public static void main(String[] args) {

        probarFactoryMethod();
    }

    private static void probarFactoryMethod(){
        Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        payment.doPayment();
    }
}
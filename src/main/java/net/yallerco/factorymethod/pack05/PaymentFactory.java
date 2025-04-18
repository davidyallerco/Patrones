package net.yallerco.factorymethod.pack05;

public class PaymentFactory {
    public static Payment buildPayment(TypePayment typePayment){
        switch (typePayment){
            case GOOGLEPAY :
                return new GooglePayment();
            case CARD:
                return new CardPayment();
            default:
                return new CardPayment();
        }
    }
}

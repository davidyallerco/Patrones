package net.yallerco.adapter.pack01;

public class Principal {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.pay("classic");
        creditCard.pay("gold");
        creditCard.pay("black");
        creditCard.pay("silver");
    }
}

package net.yallerco.singlenton.pack03;

public class Card {

    private static Card INSTANCE = new Card();
    //mas atributos que sean necesarios
    private String cardNumber;

    private Card(){
    }
    public synchronized static Card getINSTANCE(){
        return INSTANCE;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}

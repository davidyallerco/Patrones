package net.yallerco.singlenton.pack02;

public class Card {

    private static Card INSTANCE;
    //mas atributos que sean necesarios
    private String cardNumber;

    private Card(){

    }
    //se recomienda usar sincronizacion cuando hay hilos, asi se podria
    //usar este metodo de forma sincronizada
    public synchronized static Card getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new Card();
        }
        return INSTANCE;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}

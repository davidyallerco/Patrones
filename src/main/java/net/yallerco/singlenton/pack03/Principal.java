package net.yallerco.singlenton.pack03;

/*
revisar si se codifico bien
 */
public class Principal {
    public static void main(String[] args) {
        probarSinglenton();
    }

    private static void probarSinglenton() {
        Card card = Card.getINSTANCE();
        Card.getINSTANCE().setCardNumber("1234-1234-1234-9999");
        System.out.println(Card.getINSTANCE().getCardNumber());
    }
}

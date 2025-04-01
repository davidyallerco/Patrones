package net.yallerco.singlenton.pack02;

public class Principal {
    public static void main(String[] args) {
        probarSinglenton();
    }

    private static void probarSinglenton() {
        //Card card = new Card(); //esta forma ya no funciona para singlenton
        //forma adecuada para llamar
        Card.getINSTANCE().setCardNumber("1234-1234-1234-9999");
        System.out.println(Card.getINSTANCE().getCardNumber());
    }
}

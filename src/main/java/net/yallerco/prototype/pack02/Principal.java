package net.yallerco.prototype.pack02;

import static net.yallerco.prototype.pack02.PrototypeFactory.CartType.VISA;
import static net.yallerco.prototype.pack02.PrototypeFactory.CartType.AMEX;
public class Principal {
    public static void main(String[] args) {
        probarPrototype();
    }

    private static void probarPrototype() {
        PrototypeFactory.loadCard();
        try {
            PrototypeCard visa = PrototypeFactory.getInstance(VISA);
            visa.getCard();

            PrototypeCard amex = PrototypeFactory.getInstance(AMEX);
            amex.getCard();

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}

package net.yallerco.adapter.pack01;

public class CreditCard implements IPayment {

    Adapter adapter;

    @Override
    public void pay(String type) {
        if(type.equals("classic")){
            System.out.println("Tarjeta Classic:  Pagando Sin ningun tipo de Seguridad");
        } else if(type.equals("gold")){
            adapter = new Adapter("gold");
            adapter.pay("gold");
        } else if (type.equals("black")){
            adapter = new Adapter("black");
            adapter.pay("black");
        } else {
            System.out.println("No se puede hacer el pago - No se reconoce esa tarjeta");
        }
    }
}
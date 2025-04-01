package net.yallerco.singlenton.pack04;

public class ConexionBDSingleton {

    private static ConexionBDSingleton instancia;
    //se pone a privado el constructor para que no instancien desde afuera
    private ConexionBDSingleton(){
        System.out.println("Conectandose algún motor de base de datos");
    }

    public static ConexionBDSingleton getInstancia(){
        //tambien se puede poner solo instance en vez de ConexionBDSingleton.instancia
        if(ConexionBDSingleton.instancia == null){
            ConexionBDSingleton.instancia = new ConexionBDSingleton();
        }
        return ConexionBDSingleton.instancia;
    }

}

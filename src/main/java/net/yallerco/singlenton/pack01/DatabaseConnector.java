package net.yallerco.singlenton.pack01;

public class DatabaseConnector {

    private static DatabaseConnector databaseConnector;

    private DatabaseConnector(){
        System.out.println("Creando objeto");
    }

    public static synchronized DatabaseConnector getInstance(){
        if (databaseConnector == null){
            databaseConnector = new DatabaseConnector();
        }
        return databaseConnector;
    }

    public void conectarDatabase(){
        System.out.println("Conectando databaseConnector = " + databaseConnector);
    }
    public void desconectarDatabase(){
        System.out.println("Desconectando databaseConnector = " + databaseConnector);
    }
}

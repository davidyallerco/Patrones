package net.yallerco.singlenton.pack01;

public class Principal {
    public static void main(String[] args) {

        DatabaseConnector databaseConnector = DatabaseConnector.getInstance();
        System.out.println("DatabaseConnector = " + databaseConnector);

        DatabaseConnector databaseConnector2 = DatabaseConnector.getInstance();
        System.out.println("DatabaseConnector2 = " + databaseConnector2);

        System.out.println("\n");
        databaseConnector.conectarDatabase();
        databaseConnector2.conectarDatabase();
    }
}

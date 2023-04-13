import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String [] args) {
        try {
            //Localize os registros exportados do RMI

            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9100);

            //As referências passadas em Server.java são pegas aqui
            Chat chat1 = (Chat) registry.lookup("1");
            Chat chat2 = (Chat) registry.lookup("i");
            Chat chat3 = (Chat) registry.lookup("m");
            Chat chat4 = (Chat) registry.lookup("p");

            System.out.println("O nome da conexão é:" + chat1.getName());
            System.out.println("O nome da conexão é:" + chat2.getName());
            System.out.println("O nome da conexão é:" + chat3.getName());
            System.out.println("O nome da conexão é:" + chat4.getName());
        } catch (Exception e) {
            System.out.println("Error in Client side..." + e);
        }
    }
}
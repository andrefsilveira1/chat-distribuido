package chat.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;

public class OldServer {
    public static void main(String[] args) throws RemoteException {
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9100);
        System.out.println("Exporting and binding chats");
        System.out.println("Finishing initial steps...");
        registry.rebind("RMIChat", new ChatImpl());
    }
}
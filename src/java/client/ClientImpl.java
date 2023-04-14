package java.client;
import java.server.ChatServerSide;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
public class ClientImpl implements ChatClientSide, Runnable {

    //Localize os registros exportados do RMI
    Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9100);
    //As referências passadas em Server.java são pegas aqui
//    ChatClientSide chat1 = (ChatClientSide) registry.lookup("1");
    private final ChatServerSide chat;
    private final String clientName;

    protected ClientImpl(String clientName, ChatServerSide chat) throws RemoteException, NotBoundException {
        this.clientName = clientName;
        this.chat = chat;
        chat.newChat(this);
    }

    public void getMessage(String message) throws RemoteException {
        System.out.println(message);
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String sentMessage;
        for(;;) {
            sentMessage = scanner.nextLine();
            try {
                chat.SendMessage(clientName + "> " + sentMessage);
            } catch (RemoteException error) {
                System.out.println("Error in Client side while the message was broadcasting" + error);
            }
        }
    }
}

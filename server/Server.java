import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server {
    public static void main(String [] args) {
        try {
            //Definir hostname
            System.setProperty("java.rmi.server.hostname","127.0.0.1");
            System.out.println("Java server starded...");

            //Criação do chat
            ChatImpl chat1 = new ChatImpl("André", "Dia de folgaa!!", 154, "Olá, aqui estouuu!!");
            ChatImpl chat2 = new ChatImpl("Mateus Melo", "Sextou!", 154, "Qual a boa de Hoje?");
            ChatImpl chat3 = new ChatImpl("João Pedro", "Work day", 154, "Hoje não posso fazer nada");
            ChatImpl chat4 = new ChatImpl("Victor", "Day off", 154, "Estou viajando hoje");

            //Exporta os chats
            Chat stub1 = (Chat) UnicastRemoteObject.exportObject(chat1,0);
            Chat stub2 = (Chat) UnicastRemoteObject.exportObject(chat2,0);
            Chat stub3 = (Chat) UnicastRemoteObject.exportObject(chat3,0);
            Chat stub4 = (Chat) UnicastRemoteObject.exportObject(chat4,0);

            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9100);

            registry.rebind("1", stub1);
            registry.rebind("i", stub2);
            registry.rebind("m", stub3);
            registry.rebind("p", stub4);

            System.out.println("Exporting and binding chats");

        } catch (Exception error) {
            System.out.println("Something goes wrong... " + error);
        }
    }
}
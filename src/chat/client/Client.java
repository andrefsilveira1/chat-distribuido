package chat.client;

import chat.server.ChatServerSide;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.Naming;

public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        String url = "rmi://localhost/RMIChat";
        ChatServerSide chat = (ChatServerSide) Naming.lookup(url);
        new ClientImpl(args[0], chat);
    }
}
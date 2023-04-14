package chat.server;

import chat.client.ClientImpl;

import java.rmi.RemoteException;
import java.util.*;

public class ChatImpl implements ChatServerSide {
    private Vector<ClientImpl> chatList;
    public String name;
    public Integer id;

    public ChatImpl() throws RemoteException {
        chatList = new Vector<>();
    }

    public synchronized void newChat(ClientImpl NewChat) throws RemoteException {
        this.chatList.add(NewChat);
    }

    public synchronized void SendMessage(String message) throws RemoteException {
        for (ClientImpl client : chatList) {
            client.getMessage(message);
        }
    }

    public String getName() throws RemoteException {
        return name;
    }

    public Integer getId() throws RemoteException {
        return id;
    }

}
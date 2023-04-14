package java.server;
import java.client.ClientImpl;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatServerSide extends Remote {

    void newChat(ClientImpl NewChat) throws RemoteException;
    void SendMessage(String message) throws RemoteException;
    public String getName() throws  RemoteException;
    public Integer getId() throws  RemoteException;

}
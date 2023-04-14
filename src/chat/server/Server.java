package chat.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Server extends Remote {
  // Enables the client to register to the chat by using an username as an id
  public void register(String clientName) throws RemoteException;

  // Sends a message to a particular user
  public void sendMessage(String from, String to) throws RemoteException;
}

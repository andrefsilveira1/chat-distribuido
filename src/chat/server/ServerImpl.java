package chat.server;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import chat.client.Client;

public class ServerImpl extends UnicastRemoteObject implements Server {
  private List<Client> clients = new ArrayList<>();

  public ServerImpl() throws RemoteException {
    super();
  }

  public void register(String clientName) throws RemoteException {
    Client c = getClient(clientName);
    if (c != null)
      throw new RemoteException("User " + clientName + " is already taken!");
    c = new Client(clientName);
    clients.add(c);
  }

  public void sendMessage(String from, String to) throws RemoteException {

  }

  private Client getClient(String name) {
    for (Client c : this.clients) {
      if (c.getName() == name) {
        return c;
      }
    }
    return null;
  }
}

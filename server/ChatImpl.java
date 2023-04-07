import java.rmi.Remote;
import java.rmi.RemoteException;

public class ChatImpl implements  Chat {
    public String name;
    public String status;
    public Integer id;
    public String message;

    public ChatImpl (String name, String status, Integer id, String message) throws  RemoteException{
        this.name = name;
        this.status = status;
        this.id = id;
        this.message = message;
    }

    public String getName() throws  RemoteException {
        return name;
    }

    public String getStatus() throws  RemoteException {
        return status;
    }

    public Integer getId() throws  RemoteException {
        return id;
    }

    public String getMessage() throws  RemoteException {
        return message;
    }
}
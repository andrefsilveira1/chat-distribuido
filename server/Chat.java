import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Chat extends Remote{
    public String getName() throws  RemoteException;
    public String getStatus() throws  RemoteException;
    public Integer getId() throws  RemoteException;
    public String getMessage() throws  RemoteException;

}
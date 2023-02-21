import java.rmi.*;

public interface Hello extends Remote{
	public String printHello() throws RemoteException;
}
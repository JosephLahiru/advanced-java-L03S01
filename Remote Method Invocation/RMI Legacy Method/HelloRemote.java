import java.rmi.*;
import java.rmi.server.*;

public class HelloRemote extends UnicastRemoteObject implemets Hello{
	public HelloRemote() throws RemoteException{
		super();
	}
	
	public String printHello(){
		return "Hello World!";
	}
}
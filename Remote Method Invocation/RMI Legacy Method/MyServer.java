import java.rmi.*;
import java.rmi.registry.*;

public class MyServer{
	public static void main(String[] args){
		try{
			Hello stub = new HelloRemote();
			Naming.rebind("rmi://localhost:54321/myfirst", stub");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
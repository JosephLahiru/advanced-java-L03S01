import java.rmi.*;

public class MyClient{
	public static void main(String[] args){
		try{
			Hello stub = (Hello)Naming.lookup("rmi://localhost:54321/myfirst");
			System.out.println(stub.printHello());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
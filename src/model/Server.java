package model;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

import model.ServiceImpl;
import java.net.UnknownHostException;

public class Server {

	public static void main(String[] args) throws UnknownHostException {
		Scanner s = new Scanner(System.in);
		String str1 = null;
		String str2 = null;
		System.out.println("Please enter the IP address of the Server:");
		str1 = s.next();
		System.out.println("Please enter the port number of the Server:");
		str2 = s.next();
		try {
			Service service = new ServiceImpl();
			LocateRegistry.createRegistry(6600);
			Naming.rebind("rmi://" + str1 + ":" + str2 + "/Service", service);
			System.out.println("Service Start!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

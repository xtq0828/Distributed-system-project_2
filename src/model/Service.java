package model;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Service extends Remote {
	public String communication(String array) throws RemoteException;
}

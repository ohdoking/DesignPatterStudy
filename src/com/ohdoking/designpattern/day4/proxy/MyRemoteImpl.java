package com.ohdoking.designpattern.day4.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	protected MyRemoteImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHello() throws RemoteException {
		return "Server says, 'Hey ohdoking' ";
	}
	
	public static void main(String[] args) {
		MyRemote myRemote;
		try {
			myRemote = new MyRemoteImpl();
			System.setProperty("java.rmi.server.hostname","192.168.1.2");
			Naming.rebind("RemoteHello", myRemote);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

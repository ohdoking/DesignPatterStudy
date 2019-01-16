package com.ohdoking.designpattern.day4.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
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
			Naming.rebind("RemoteHello", myRemote);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

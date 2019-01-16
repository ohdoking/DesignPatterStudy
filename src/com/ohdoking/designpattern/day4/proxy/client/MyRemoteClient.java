package com.ohdoking.designpattern.day4.proxy.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.ohdoking.designpattern.day4.proxy.MyRemote;

public class MyRemoteClient {

	public static void main(String[] args) {
		new MyRemoteClient().go();
	}

	public void go() {
		
		MyRemote service;
		try {
			service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
			System.out.println(service.sayHello());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
	}
}

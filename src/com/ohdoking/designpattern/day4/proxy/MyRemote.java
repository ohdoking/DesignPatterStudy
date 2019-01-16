package com.ohdoking.designpattern.day4.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote{
	//return value and argument have to declare Primitive or Serializable type.    
	public String sayHello() throws RemoteException;
}

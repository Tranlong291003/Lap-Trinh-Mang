package com.mycompany.Tuan9.VD1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote{
    String sayHello() throws RemoteException;
}

package com.javarush.task.task32.task3207;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UpperString extends Remote {
    String upperString(String str) throws RemoteException;
}

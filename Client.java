package org.example;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) {
        Ola stub = null;
        try {
            stub = (Ola) Naming.lookup("rmi://localhost:1099/Ola");
            System.out.println(stub.digaOla());
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}

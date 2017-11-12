/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiexample;

/**
 *
 * @author up839743
 */
import java.rmi.registry.*;

public class MyClient {

    public static void main(String [] args) throws Exception {

        //Change this to the servers IP and match port number
        Registry reg = LocateRegistry.getRegistry("148.197.145.175", 1996) ;
        MyRemoteInterface handle = (MyRemoteInterface) reg.lookup("myrmiserver");

        handle.printMessage("Wassup!");
    }
}

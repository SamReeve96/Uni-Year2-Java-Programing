/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createfiles;

import java.io.*;
/**
 *
 * @author up839743
 */

public class CreateFiles {

    public static void main(String args []) throws Exception {

        File dum = new File("C:/Users/Samuel/Desktop/newOrder.txt");

        File dee = new File("tweedle-dee.txt");

        dum.createNewFile();

        dee.createNewFile();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deletefile;

/**
 *
 * @author up839743
 */
import java.io.*;

    public class DeleteFile {

        public static void main(String args []) throws Exception {

            File dum = new File("N:\\Work\\2017 -18\\COSINE\\Lab\\Week8Files\\tweedle-dum.txt");

            File dee = new File("tweedle-dee.txt");

            dum.delete();

            dee.delete();
        }
    }

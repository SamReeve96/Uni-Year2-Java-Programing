/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readfile;

/**
 *
 * @author up839743
 */
  import java.io.* ;

    public class ReadFile {

        public static void main(String [] args) throws Exception {

            FileInputStream in = new FileInputStream("N:/Work/2017 -18/COSINE/Lab/Week8Files/tweedle-dum.txt");

            byte buffer [] = new byte [100] ;

            int numBytesRead = in.read(buffer) ;

            while(numBytesRead > 0) {
                System.out.print(new String(buffer, 0, numBytesRead)) ;
                numBytesRead = in.read(buffer) ;
          }
            in.close(); //Good practice to close files when done with them
        }
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadhello;

/**
 *
 * @author up839743
 */
public class ThreadHello {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String args []) throws Exception {

          MyThread thread1 = new MyThread() ;
          thread1.name = "A" ;

          MyThread thread2 = new MyThread() ;
          thread2.name = "B" ;

          thread1.start() ;
          thread2.start() ;

          thread2.join() ;
          thread1.join() ;
      }
}

class MyThread extends Thread {

    String name ;

    public void run() {
        for(int i = 0 ; i < 10 ; i++) {
            delay() ;
            System.out.println("Hello from thread " + name) ;
        }
    }
      
    void delay() {

        int delay = (int) (1000 * Math.random()) ;
        try {
            Thread.sleep(delay) ;
        }
        catch(Exception e) {
        }
    }
}

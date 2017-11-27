/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deadlock3;

/**
 *
 * @author up839743
 */
import static deadlock3.MyThreadA.semS;
import java.util.concurrent.*;

public class Deadlock3 {

    public static void main(String args []) throws Exception {

        MyThreadA thread1 = new MyThreadA() ;

        MyThreadB thread2 = new MyThreadB() ;
        
        MyThreadC thread3 = new MyThreadC() ;

        thread1.start() ;
        thread2.start() ;
        thread3.start() ;
        
        thread3.join() ;
        thread2.join() ;
        thread1.join() ;
    }
}

class MyThreadA extends Thread {

    static Semaphore semR = new Semaphore(1);

    static Semaphore semS = new Semaphore(1);
    
    static Semaphore semT = new Semaphore(1);
    
    int ResourcesAHeld = 0;

    void delay() {

        int delay = (int) (1000 * Math.random()) ;
        try {
            Thread.sleep(delay) ;
        }
        catch(Exception e) {
        }
    }


    public void run() {
        if (ResourcesAHeld < 2)
        {
            try {
                 while(true) {
                     delay() ;

                     System.out.println("Thread A waiting for R") ;
                     semR.acquire() ;
                     System.out.println("Thread A acquired R") ;

                     delay() ;

                     System.out.println("Thread A waiting for S") ;
                     semS.acquire() ;
                     System.out.println("Thread A acquired S") ;

                     delay() ;

                     System.out.println("Thread A waiting for T") ;
                     semT.acquire() ;
                     System.out.println("Thread A acquired T") ;

                     delay(); 

                     semS.release() ;
                     System.out.println("Thread A released S") ;

                     semR.release() ;
                     System.out.println("Thread A released R") ;

                     semT.release() ;
                     System.out.println("Thread A released T") ;
                 }
            }
            catch(Exception e) {}
        }
    }
}

class MyThreadB extends MyThreadA {


    public void run() {
        try {
             while(true) {
                 delay() ;

                 System.out.println("Thread B waiting for R") ;
                 semR.acquire() ;
                 System.out.println("Thread B acquired R") ;

                 delay() ;

                 System.out.println("Thread B waiting for S") ;
                 semS.acquire() ;
                 System.out.println("Thread B acquired S") ;

                 delay() ;
                 
                 System.out.println("Thread B waiting for T") ;
                 semT.acquire() ;
                 System.out.println("Thread B acquired T") ;
                    
                 delay(); 
                 
                 semS.release() ;
                 System.out.println("Thread B released S") ;

                 semR.release() ;
                 System.out.println("Thread B released R") ;
                 
                 semT.release() ;
                 System.out.println("Thread B released T") ;
             }
        }
        catch(Exception e) {}
    }

}

class MyThreadC extends MyThreadB {


    public void run() {
        try {
             while(true) {
                 delay() ;

                 System.out.println("Thread C waiting for R") ;
                 semR.acquire() ;
                 System.out.println("Thread C acquired R") ;

                 delay() ;

                 System.out.println("Thread C waiting for S") ;
                 semS.acquire() ;
                 System.out.println("Thread C acquired S") ;

                 delay() ;
                 
                 System.out.println("Thread C waiting for T") ;
                 semT.acquire() ;
                 System.out.println("Thread C acquired T") ;
                    
                 delay(); 
                 
                 semS.release() ;
                 System.out.println("Thread C released S") ;

                 semR.release() ;
                 System.out.println("Thread C released R") ;
                 
                 semT.release() ;
                 System.out.println("Thread C released T") ;
             }
        }
        catch(Exception e) {}
    }

}

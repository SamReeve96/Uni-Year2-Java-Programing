/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peterson;

/**
 *
 * @author Samuel
 */
public class Peterson {

      public static void main(String args []) throws Exception {

          MyThread.count = 0 ;

          MyThread thread1 = new MyThread() ;
          thread1.name = "A" ;
          thread1.id = 0 ;

          MyThread thread2 = new MyThread() ;
          thread2.name = "B" ;
          thread2.id = 1 ;

          thread1.start() ;
          thread2.start() ;

          thread1.join() ;
          thread2.join() ;

          System.out.println("MyThread.count = " + MyThread.count) ;
      }
  }

  class MyThread extends Thread {

      volatile static int count ;

      String name ;
      int id ;

      public void run() {

          for(int i = 0 ; i < 10 ; i++) {
              delay() ;

              beginCriticalSection() ;

              int x = count ;
              System.out.println("Thread " + name + " read " + x) ;
              delay() ;
              count = x + 1 ;
              System.out.println("Thread " + name + " wrote " + (x + 1)) ;

              endCriticalSection() ;
          }
      }

      // Peterson's algorithm

      volatile static int turn ;
      volatile static boolean [] interested = new boolean [2] ;

      void beginCriticalSection() {
          delay();
          interested [id] = true ;
          int jd = 1 - id ;
          turn = jd ;
          while(interested [jd] & turn == jd) {}
          delay();
      }

      void endCriticalSection() {
          delay();
          interested [id] = false ;
          delay();
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race;

/**
 *
 * @author up839743
 */
public class Race {

      public static void main(String args []) throws Exception {

          MyThread.count = 0 ;

          MyThread thread1 = new MyThread();
          MyThread thread2 = new MyThread();

          thread1.start() ;
          thread2.start() ;

          thread2.join() ;
          thread1.join() ;

          System.out.println("MyThread.count = " + MyThread.count) ;
      }
  }

  class MyThread extends Thread {

      volatile static int count ;

      public void run() {

          for(int i = 0 ; i < 1000000000 ; i++) {
              int x = count ;
              count = x + 1 ;
          }
      }
  }

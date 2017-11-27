/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuerace;

/**
 *
 * @author Samuel
 */
public class QueueRace {

      public static void main(String args []) throws Exception {

          AThread.q = new Queue() ;

          AThread thread1 = new AThread() ;
          thread1.name = "A" ;

          BThread thread2 = new BThread() ;
          thread2.name = "B" ;

          thread1.start() ;  
          thread1.join() ;
          
          thread2.start() ; 
          thread2.join(); 
          
      }
  }

  class AThread extends Thread {

      volatile static Queue q ;

      String name ;
    //Standard run used by thread one
      public void run() {

          for(int i = 0 ; i < 10 ; i++) {
              q.add("message " + i) ;
          }
      }
  }

  class BThread extends AThread {

    //Modified run for different thread
      public void run() {

          for(int i = 0 ; i < 10 ; i++) {
              String message = q.rem();
              System.out.println("Thread " + name +
                                 " printed message " + message) ;
          }
        }
    }

  class Queue {

      volatile Node front, back ;

      synchronized public void add(String data) {
          if (front != null) {
              back.next = new Node(data) ;
              back = back.next ;
          }
          else {
              front = new Node(data) ; 
              back = front ;
          }
      }

      public String rem() {
          // returns null if queue empty
          String result = null ;
          if (front != null)  {
              result = front.data ;
              front   = front.next ;
          }
          return result ;
      }
  }

  class Node {
      Node(String data) {
          this.data = data ;
      }

      String data ;
      Node next ;
  }

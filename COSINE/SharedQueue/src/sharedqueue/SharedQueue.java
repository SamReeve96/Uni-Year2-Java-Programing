/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharedqueue;

/**
 *
 * @author Samuel
 */
public class SharedQueue {

      public static void main(String args []) throws Exception {

          Writer writer1 = new Writer() ;
          writer1.name = "W1" ;

          Writer writer2 = new Writer() ;
          writer2.name = "W2" ;

          Reader reader1 = new Reader() ;
          reader1.name = "R1" ;

          Reader reader2 = new Reader() ;
          reader2.name = "R2" ;

          reader1.start() ;
          reader2.start() ;
          writer1.start() ;
          writer2.start() ;

          writer1.join() ;
          writer2.join() ;
          reader1.join() ;
          reader2.join() ;
      }
  }

  class Writer extends Thread {

      volatile static Queue q = new Queue() ;

      String name ;

      long i ;

      void longDelay() {

          long delay = (long) (4000000000L * Math.random()) ;
          for(i = 0 ; i < delay ; i++) {}
      }


      public void run() {

          for(int i = 0 ; i < 10 ; i++) {
              longDelay() ;
              q.add("message " + i + " from " + name) ;
          }
      }

  }

  class Reader extends Writer {


      public void run() {

          for(int i = 0 ; i < 10 ; i++) {
              longDelay() ;
              String m = q.rem() ;
              System.out.println("Reader " + name + " read " + m) ;
          }
      }

  }


  class Queue {

      volatile Node front, back ;

      public synchronized void add(String data) {
          if (front != null) {
              back.next = new Node(data) ;
              back = back.next ;
          }
          else {  // queue is empty
              front = new Node(data) ; 
              back = front ;
              notifyAll() ;
          }
      }

      public synchronized String rem() {
          try {
              while (front == null)  {  // queue is empty
                  wait() ;
              }
              String result = front.data ;
              front         = front.next ;
              return result ;
          }
          catch (InterruptedException e) {
              throw new RuntimeException("badness happened: ", e) ;
          }
      }
  }

  class Node {
      Node(String data) {
          this.data = data ;
      }

      String data ;
      Node next ;
  }

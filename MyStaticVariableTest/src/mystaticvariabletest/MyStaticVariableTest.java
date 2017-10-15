/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystaticvariabletest;

/**
 *
 * @author up839743
 */
  public class MyStaticVariableTest {

      public static void main(String args []) {

          MyOtherClass.b = "my string value" ;

          MyOtherClass object1 = new MyOtherClass() ;
          object1.a = 42 ;

          MyOtherClass object2 = new MyOtherClass() ;
          object2.a = 23 ;
          
          object1.changeA(420);
          object1.changeB("B was changed!!!");

          System.out.println("Fields of object1:") ;
          object1.printMyFields() ;

          System.out.println("Fields of object2:") ;
          object2.printMyFields() ;
      }
  }

  class MyOtherClass {
      int a ;
      static String b ;

      void printMyFields() {
          System.out.println("Field a is: " + a) ;
          System.out.println("Field b is: " + b) ;
      }
      
      void changeA(int newA) {
          a = newA;
      }
      
      void changeB(String newB) {
          b = newB;
      }
  }

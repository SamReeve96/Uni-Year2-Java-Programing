/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymethodtest;

/**
 *
 * @author up839743
 */
public class MyMethodTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass object1 = new MyClass();
        
        //(Set a and b in object 1)
        object1.a = 42;
        object1.b = "String Value";
        
        MyClass object2 = new MyClass();
        
        //set a and b for object2
        object2.a = 23;
        object2.b = "other String Value";
        
        //Print fields
        System.out.println("Fields of object 1: ");
        object1.printMyFields();
        
        System.out.println("Fields of object 2: ");
        object2.printMyFields();
        
    }
    
}

class MyClass {
    int a ;
    String b;
    
    void printMyFields() {
        System.out.println("Field a is: " + a);
        System.out.println("Field b is: " + b);
    }
}

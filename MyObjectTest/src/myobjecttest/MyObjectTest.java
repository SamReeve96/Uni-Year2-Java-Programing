/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myobjecttest;

/**
 *
 * @author up839743
 */
public class MyObjectTest {

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
        System.out.println("Field a in obj 1 is: " + object1.a);
        System.out.println("Field b in obj 1 is: " + object1.b);
        
        System.out.println("Field a in obj 2 is: " + object2.a);
        System.out.println("Field b in obj 2 is: " + object2.b);
    }
    
}

class MyClass {
    int a ;
    String b;
}
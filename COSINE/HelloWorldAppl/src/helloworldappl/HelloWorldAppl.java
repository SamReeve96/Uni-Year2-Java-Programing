/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldappl;

/**
 *
 * @author up839743
 */
public class HelloWorldAppl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("hello world");
        String result = LibClass.acrostic(args);
        //System.out.println("Result: " + result);
        System.out.println("\n Result: " + result + "\n");
    }
    
}

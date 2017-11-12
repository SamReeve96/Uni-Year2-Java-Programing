/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg6;

/**
 *
 * @author up839743
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle Tri1 = new Triangle(3, 4, 5);
        Tri1.calcArea();
        Tri1.calcPerm();
        System.out.println("\n");
        
        RightAngle Tri2 = new RightAngle(3, 4);
        Tri2.calcArea();
        
        Tri2.calcPerm();
        Tri2.calcSideC();
        System.out.println("\n");
                
        Triangle Tri3 = new Equal(3);
        Tri3.calcArea();
        Tri3.calcPerm();
    }
    
}

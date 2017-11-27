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
public class RightAngle extends Triangle{
    
    public RightAngle() {
    }
    
    public RightAngle(double a, double b) {
        
        
        super(a,b);
        
    }
    
    public double calcArea(){
        double Area = (getSideA() * getSideB())/2; 
        System.out.println(Area);
        return Area;
    }
    
    public void calcSideC(){
        double SideC = Math.sqrt((getSideA() * getSideA()) + (getSideB() * getSideB()));
        super.setSideC(SideC);
        System.out.println("Side c is: " + SideC);
    }
}

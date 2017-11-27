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
public class Triangle {
    private double SideA;
    private double SideB;
    private double SideC;
    private double perimeter;
    private double area;
    
    
    /*  Constructors */
    public Triangle() {
        
    }
    
    public Triangle(double a, double b, double c) {
        SideA = a;
        SideB = b;
        SideC = c;
    }
    
    public Triangle(double a, double b) {
        SideA = a;
        SideB = b;
    }
    
    public Triangle(double a) {
        SideA = a;
    }
    
    //Getters
    public double getSideA(){
        return SideA;
    }
    
    public double getSideB(){
        return SideB;
    }
    
    public double getSideC(){
         System.out.println(SideC);
        return SideC;
    }
    
    //Setters
    public void setSideA(double a){
        SideA = a;
    }
    
    public void setSideB(double b){
        SideB = b;
    }
    
    public void setSideC(double c){
        SideC = c;
    }
    
    public double calcArea(){
        double p = (SideA + SideB + SideC)/2;
        double Area = Math.sqrt(p*(p-SideA)*(p-SideB)*(p-SideC));
        System.out.println(Area);
        return Area;
    }
    
    public double calcPerm() {
        double Permimeter = SideA + SideB + SideC;
        System.out.println(Permimeter);
        return Permimeter;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdata;

/**
 *
 * @author up839743
 */
public class Student {
    private String name, id; //private instance variables (can only be accessed in this class)
    private int[] score = new int[3]; //3 exam results are stored

    //basic constructor
    public Student()
    {
    }

    //constructor (intitalises the name, id and exam marks)
    public Student(String stName, String stID, int stScore[]){
        name = stName;
        id = stID;
        score = stScore;
    }
    
    //modifier methods
    public void setName(String newName){
        name = newName;
    }
    
    public void setID(String newID){
        id = newID;
    }
    
    public void setScore (int newScore[]){
        score = newScore;
    }
    
    //Access methods
    public String getName (){
        return name;
    }   
    
    public String getID (){
        return id;
    }      
    
    public int[] getScore (){
        return score;
    }      
    

    public double avStudScore(){
        double total = 0;  
        double av;
        for (int i = 0; (i <= score.length - 1); ++i){
            total += score[i];
        }
        av = total/score.length;
        return av;
    }
    
    //Display data about the student
    public void studentPrintout(){
        System.out.println("Student name: " + name);
        System.out.println("Student id: " + id);
        for (int i = 0; i <= (score.length - 1) ; i++){
            System.out.println("Student Score for test(" + i + ") :" + score[i]);
        }
        System.out.println("\n");
    //end of student class
    }
}
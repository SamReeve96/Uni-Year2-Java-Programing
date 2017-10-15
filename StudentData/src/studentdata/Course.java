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
public class Course {
    private String name, id; //private instance variables (can only be accessed in this class)
    private Student[] register = new Student[10]; //Students register holds 10 pupils
    
        //basic constructor
    public Course()
    {
    }
    
    //constructor
    public Course(String crName, String crID, Student[] crRegister)
    {
        name = crName;
        id = crID;
        register = crRegister;
    }
    
    //Setters
    public void setName(String newName){
        name = newName;
    }
    
    public void setID(String newID){
        id = newID;
    }
    
    public void setRegister(Student[] newRegister){
        register = newRegister;
    }
    
    //Getters
    public String getName (){
        return name;
    }   
    
    public String getID (){
        return id;
    }      
    
    public Student[] getRegister (){
        return register;
    }
    
    public double avCourseScore(){
        double total = 0;  
        double av;
        for (int i = 0; (i <= register.length - 1); ++i){
            total += register[i].avStudScore();
        }
        av = total/register.length;
        return av;
    }
    
        //Display data about the Course
    public void coursePrintout(){
        System.out.println("Course name: " + name);
        System.out.println("Course id: " + id);
        System.out.println("Course Average Score: " + avCourseScore());
        System.out.println("(NAME - ID - AVG Score)");
        for (int i = 0; i <= (register.length - 1) ; i++){
            System.out.println(register[i].getName() + " - " + register[i].getID() + " - " + register[i].avStudScore());
        }
        System.out.println("\n");
    //end of student class
    }
}

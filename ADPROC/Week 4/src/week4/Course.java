/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author up839743
 */
// package lab4;
public class Course {
    private String name, code;
    private int numStudents = 0;
    Student[] Register = new Student[10]; 	// later change it with array list
    /** Creates a new instance of Course */
    public Course() {
    }
    public Course(String nm, String cd) {
        name = nm;
        code = cd;
    }
    
    public void addStudent( Student st) {
        Register[numStudents] = st;
        numStudents ++;
    }
                      
    public double averageSc() {
        double s=0.0;
        for (int i=0; i<numStudents; i++)
           s += Register[i].avScore();
        return (s/numStudents);
    }
    public int getNumStud() {
            return numStudents;
    }
    public String getName() {
          return name;
    } 

    public double avCourseScore(){
        double total = 0;  
        double av;
        for (int i = 0; (i <= Register.length - 1); ++i){
            total += Register[i].avScore();
        }
        av = total/Register.length;
        return av;
}

    //Display data about the Course (Added from StudentData project)
    public void coursePrintout(){
        System.out.println("Course name: " + name);
        System.out.println("Course code: " + code);
        System.out.println("Course Average Score: " + avCourseScore());
        System.out.println("(NAME - ID - AVG Score)");
        for (int i = 0; i <= (Register.length - 1) ; i++){
            System.out.println(Register[i].getName() + " - " + Register[i].getScore() + " - " + Register[i].avScore());
        }
        System.out.println("\n");
    }
}


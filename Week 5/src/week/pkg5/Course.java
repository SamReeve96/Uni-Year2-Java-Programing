/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg5;

/**
 *
 * @author up839743
 */
// package lab5;
import java.util.*; 
public class Course {
    private String name, code;
    private int numStudents = 0;
    ArrayList<Student> list = new ArrayList<>();
    /*  Constructors - Create new instances of Course  */
    public Course() {
    }
    public Course(String nm, String cd) {
        name = nm;
        code = cd;
    }
// Access methods
    public int getNumStud() {
        return numStudents;
    }
    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
 // Modifiers
    public void addStudent(Student st) {
        list.add(st);
        numStudents++;
    }
// Calculates the course average score
    public double averageSc() {
        Student work = new Student();
        double s = 0.0;
        for (int i = 0; i < list.size(); i++) {
            work = list.get(i);   // get the student from the list
            s += work.avScore();  // add her/his average scrore
        }
        return (s / list.size());  // return the average for all students
    }
 // Finds the index of the student with max average score
    public int maxAverage() {
        double max = 0.0;
        int ind = 0;
        Student work = new Student();
        for (int i = 0; i < list.size(); i++) {
            work = list.get(i);
            if (max < work.avScore()) {
                max = work.avScore();
                ind = i;
            }
        }
        return (ind);  // returns the index of the student with max average score
    } 
}


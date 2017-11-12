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
//package lab5; 
public class Student {
    protected String name;  	// class data fields (instance variables)
    protected int [] score = new int[3];
  
// Constructors
    public Student() {	  //default constructor
    }
    public Student(String stName,  int stScore[]) {
     // Constructor, performs validity check and initialises the data fields
	name = stName;
        for (int i=0; i<3; i++)
            score[i]= ((stScore[i]> 0) && (stScore[i]< 101))? stScore[i]: 0;
    }
 
// Modifier methods
    public void setName(String nm) {
        name = nm;
    }
    public void setScore(int stSc[]) {
        for (int i=0; i<3; i++)
            score[i] = stSc[i];
//System.arraycopy(stSc, 0, stSc, 0, 3);  		//will do the same job
    }

// Access methods
    public String  getName()  {
        return name;
    }
    public int[] getScore() {
        return score;
    }
    
// Calculates the average score
    public double avScore() {
        double s=0.0;
        for (int i=0; i<3; i++)
            s += score[i];
        return (s/3.);
    }
    public void printOut() {
        System.out.println("\n Student attributes: ");
        System.out.println("\t name : "+ name);
        for (int i=0; i<3; i++)
            System.out.print("\t score["+ i+"] = " + score[i]);
        System.out.println("\n\t average score = " + avScore());
    }    
}


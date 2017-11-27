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
import java.io.*;     // you need this for the I/O
import java.util.*;  // you need this for the Scanner class

public class Main {

public static void main(String[] args) throws IOException {
  Scanner console = new Scanner(System.in);  //object of Scanner class
  String sName, again;
  ArrayList<Student> stud = new ArrayList<>();
  Student work = new Student();
  int i, num = 0;
  boolean answer, excep;
  int[] sScore = new int[3];  //array of three int marks
  do {        //outer loop
    System.out.println("\nEnter first and last name,separated by space. ");
    sName = console.nextLine();//returns(the rest of)the current input line
    do {     // inner loop
       excep = false;  // this variable is for the exception
       try {
         System.out.println("\n Enter three marks separated by spaces. ");
         for (i = 0; i < 3; i++) {
           sScore[i] = console.nextInt();  //scans the next token as an int
          }
       } catch (Exception exRef) {
   // catch block, or exception handler, could have more than one handler
          System.err.println(exRef);
          System.out.print("Marks should be numerals!");
          excep = true;
        }
        console.nextLine(); 	// to clear the rest of the current line
     } while (excep);  //go back if an exception was thrown
     // create an object of class Student
     work = new Student(sName, sScore);
     stud.add(work);  // add the student to the list of students 'stud'
     num++;   // increase the number of students in the list
     System.out.println("\n Another student (y/n)? ");
     again = console.nextLine(); // read the user answer
     answer = false;
     if (again.charAt(0) == 'y') {
       answer=true;  // if data for another student is going to be entered
     }
   }while (answer);   // end outer loop

   Course cm = new Course("Computing", "CMP06");
   // cm - first instance of class Course
   for (i=0;i < num/2;i++) {  //first halve of student list goes to 'cm'
      cm.addStudent(stud.get(i));
   }
   double cmAverage = cm.averageSc();    //returns the average score for cm
   int cmNumbers = cm.getNumStud(); //how many students in the course
   System.out.println("\ncourse name: " + cm.getName()); //course name
   System.out.println("\t average = " + cmAverage); //course average score
   System.out.println("\t number of studs  = " + cmNumbers + "\n");
   for (i = 0; i < cmNumbers; i++) {
      work = cm.list.get(i);
      System.out.println("\t " + work.name);
   }
   // cs - second instance of class Course
   Course cs = new Course("Computer Science", "CS06");
   for (i = num / 2; i < num; i++) //second half of the list goes to 'cs'
      cs.addStudent(stud.get(i));
   int csNum = cs.getNumStud(); //gets the number of students in the course
   System.out.println("\n course name: " + cs.getName());
   System.out.println("\t average =  = " + cs.averageSc());
   System.out.print("\t number of studs = " + csNum + "\n");
   for (i = 0; i < csNum; i++) { //will output the course student names 
      work = cs.list.get(i);
      System.out.println("\t " + work.name);
   }
   int ind = cs.maxAverage();  //index of the student with the max score
   work = cs.list.get(ind); //gets student object with the particular 'ind'
   work.printOut();    //outputs the best student attributes 
  }
}

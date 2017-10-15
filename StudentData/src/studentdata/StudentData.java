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
public class StudentData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student stud1 = new Student("Jack Jones", "839743", new int[] {8, 8, 10});
        Student stud2 = new Student("Jeff Jones", "456456", new int[] {9, 0, 8});
        Student stud3 = new Student("Fred Jones", "123123", new int[] {1, 5, 10});
        Student stud4 = new Student("Cali Jones", "839743", new int[] {8, 8, 10});
        Student stud5 = new Student("Kate Jones", "456456", new int[] {9, 0, 8});
        Student stud6 = new Student("Read Jones", "123123", new int[] {1, 5, 10});
        Student stud7 = new Student("Jack Jones", "839743", new int[] {8, 8, 10});
        Student stud8 = new Student("Jeff Jones", "456456", new int[] {9, 0, 8});
        Student stud9 = new Student("Fred Jones", "123123", new int[] {1, 5, 10});
        Student stud10 = new Student("Cali Jones", "839743", new int[] {8, 8, 10});
        
        Course course1 = new Course("ADPROG","001", new Student[] {stud1, stud2, stud3, stud4, stud5});
        Course course2= new Course("INSE", "002", new Student[] {stud1, stud2, stud6, stud6, stud7, stud8, stud9, stud10});
        
        course1.coursePrintout();
        course2.coursePrintout();
    }
    
}

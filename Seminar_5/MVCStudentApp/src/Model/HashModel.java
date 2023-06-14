package Model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

import Controller.iGetModel;

public class HashModel implements iGetModel {
    //create HashMap students
    private HashMap<Long, Student> students;

    //generate constructor
    public HashModel(HashMap<Long, Student> students) {
        this.students = students;
    }

    //method to delete student for ID
    public void DeleteStudent(){
        System.out.print("Enter the student ID for delete: ");
        Scanner iScanner = new Scanner(System.in);
        Long id = iScanner.nextLong();
        if (students.containsKey(id)){
            students.remove(id);
            System.out.printf("Student ID %d was delete...", id);
        } else {
            System.out.printf("The student with ID %d not found...", id);
        }
        //iScanner.close(); //(Why exception if scanner closed???)
    }

    //add method returned Students list
    @Override
    public Collection<Student> getAllStudents() {
        return students.values();
    }

}

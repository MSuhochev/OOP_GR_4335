package View;

import java.util.Collection;
import java.util.Scanner;

import Controller.iGetViewEng;
import Model.Student;

public class ViewEng implements iGetViewEng {

    // method for print List students
    public void printAllStudents(Collection<Student> students) {
        System.out.println("------------------ List of students ------------------");
        for (Student stud : students) {
            System.out.println(stud);
        }
        System.out.println("------------------ End of student list ------------------");
    }

    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
        }
    }


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import javax.swing.GroupLayout.Group;

import StudentDomen.Student;
import StudentDomen.StudentStream;
import StudentDomen.StudentGroup;
//import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {

        //Create User
        //User u1 = new User("Ivan", "Ivanov", "Moskow", 20);
        //System.out.println(u1);

        //Create Students
        Student s1 = new Student(1, "Ivan", "Ivanov", "Moscow", 20);
        Student s2 = new Student(2, "Petr", "Petrov", "Moscow", 21);
        Student s3 = new Student(3, "Anna", "Petrenko", "Moscow", 20);
        Student s4 = new Student(4, "Evgeniy", "Zinakov", "Voronezh", 21);
        Student s5 = new Student(5, "Ekaterina", "Alekhina", "Voronezh", 21);
        Student s6 = new Student(6, "Elizaveta", "Pronina", "Voronezh", 21);
        Student s7 = new Student(7, "Inna", "Vyshemirskaya", "Moscow", 20);
        Student s8 = new Student(8, "Igor", "Doronin", "Moscow", 20);
        Student s9 = new Student(9, "Anastasia", "Terentyeva", "Moscow", 21);
        Student s10 = new Student(10, "Dmitriy", "Tolstoy", "Voronezh", 20);
        Student s11 = new Student(11, "Aleksey", "Kolesnikov", "Moscow", 21);
        Student s12 = new Student(12, "Valeriy", "Bezrukov", "Moscow", 20);
        Student s13 = new Student(13, "Yana", "Vol", "Moscow", 21);
        Student s14 = new Student(14, "Olga", "Stadnichenko", "Voronezh", 20);
        Student s15 = new Student(15, "Yriy", "Akopyan", "Moscow", 20);
        Student s16 = new Student(16, "Svetlana", "Ahmetgareeva", "Moscow", 21);
        Student s17 = new Student(17, "Anton", "Dolgih", "Moscow", 20);
        Student s18 = new Student(18, "Yliya", "Naboychenko", "Moscow", 21);

        //Create and complete Student List №1
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        listStud1.add(s6);

        //Create and complete Student List №2
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);
        listStud2.add(s11);
        listStud2.add(s12);
        listStud2.add(s13);
        listStud2.add(s14);

        //Create and complete Student List №3
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s15);
        listStud3.add(s16);
        listStud3.add(s17);
        listStud3.add(s18);

        StudentGroup group1 = new StudentGroup(listStud1);
        StudentGroup group2 = new StudentGroup(listStud2);
        StudentGroup group3 = new StudentGroup(listStud3);

        //Create and complete List StudentGroup
        List<StudentGroup> stream = new ArrayList<StudentGroup>();


        stream.add(group1);
        stream.add(group2);
        stream.add(group3);

        StudentStream streams = new StudentStream(stream, 1);


        System.out.println("_____Before sorting_____");
        
        for(StudentGroup group : streams){
            for(Student student: group){
                System.out.println(student);
            }
        }
        System.out.println("------------------------------------------------");
        System.out.println();

        Collections.sort(streams.getStream());

        System.out.println("_____After sorting_____");
        
        for(StudentGroup group : streams){
            for(Student student: group){
                System.out.println(student);
            }
        }
        System.out.println("------------------------------------------------");
    }
}

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

//import Controllers.EmploeeController;
//import StudentDomen.UserComparator;
import StudentDomen.AverageAge;
import StudentDomen.Emploee;

//import javax.swing.GroupLayout.Group;

import StudentDomen.Student;
//import StudentDomen.StudentStream;
//import StudentDomen.StudentGroup;
//import StudentDomen.User;
import StudentDomen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {

        //Create Emploee
        Emploee empl1 = new Emploee(0, "Lev", "Kroichik", "Voronezh", 68, "Physicist");
        Emploee empl2 = new Emploee(0, "Anna", "Guseva", "Voronezh", 43, "Foreign language");
        Emploee empl3 = new Emploee(0, "Elena", "Kovyrshina", "Voronezh", 37, "Mathematic");
        
        // Create and complete List Emploees
        List<Emploee> emploees = new ArrayList<Emploee>();
        emploees.add(empl1);
        emploees.add(empl2);
        emploees.add(empl3);

        AverageAge<Emploee> emplAverAge = new AverageAge<Emploee>(emploees);    

        System.out.println("Average worker age = " + emplAverAge.getAverageAge());

        //Create Students
        Student s1 = new Student(1, "Ivan", "Ivanov", "Moscow", 20);
        Student s2 = new Student(2, "Petr", "Petrov", "Moscow", 21);
        Student s3 = new Student(3, "Anna", "Petrenko", "Moscow", 20);
        Student s4 = new Student(4, "Evgeniy", "Zinakov", "Voronezh", 21);

        // Create and complete Student List
        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);

        AverageAge<Student> studAverAge = new AverageAge<Student>(listStud);

        System.out.println("Average student age = " + studAverAge.getAverageAge());

        //Create Teachers
        Teacher t1 = new Teacher(1, "Ivan", "Ivanov", "Moscow", 34, "physicist");
        Teacher t2 = new Teacher(2, "Petr", "Petrov", "Moscow", 41, "linguist");
        Teacher t3 = new Teacher(3, "Anna", "Petrenko", "Moscow", 29, "philosopher");
        Teacher t4 = new Teacher(4, "Evgeniy", "Zinakov", "Voronezh", 51, "historian");

        // Create and complete Teachers List
        List<Teacher> listTeachers = new ArrayList<Teacher>();
        listTeachers.add(t1);
        listTeachers.add(t2);
        listTeachers.add(t3);
        listTeachers.add(t4);

        AverageAge<Teacher> teacherAverAge = new AverageAge<Teacher>(listTeachers);

        System.out.println("Average teacher age = " + teacherAverAge.getAverageAge());



        

        //Create User
        //User u1 = new User("Ivan", "Ivanov", "Moskow", 20);
        //System.out.println(u1);

        //Create Students
        // Student s1 = new Student(1, "Ivan", "Ivanov", "Moscow", 20);
        // Student s2 = new Student(2, "Petr", "Petrov", "Moscow", 21);
        // Student s3 = new Student(3, "Anna", "Petrenko", "Moscow", 20);
        // Student s4 = new Student(4, "Evgeniy", "Zinakov", "Voronezh", 21);
        // Student s5 = new Student(5, "Ekaterina", "Alekhina", "Voronezh", 21);
        // Student s6 = new Student(6, "Elizaveta", "Pronina", "Voronezh", 21);
        // Student s7 = new Student(7, "Inna", "Vyshemirskaya", "Moscow", 20);
        // Student s8 = new Student(8, "Igor", "Doronin", "Moscow", 20);
        // Student s9 = new Student(9, "Anastasia", "Terentyeva", "Moscow", 21);
        // Student s10 = new Student(10, "Dmitriy", "Tolstoy", "Voronezh", 20);
        // Student s11 = new Student(11, "Aleksey", "Kolesnikov", "Moscow", 21);
        // Student s12 = new Student(12, "Valeriy", "Bezrukov", "Moscow", 20);
        // Student s13 = new Student(13, "Yana", "Vol", "Moscow", 21);
        // Student s14 = new Student(14, "Olga", "Stadnichenko", "Voronezh", 20);
        // Student s15 = new Student(15, "Yriy", "Akopyan", "Moscow", 20);
        // Student s16 = new Student(16, "Svetlana", "Ahmetgareeva", "Moscow", 21);
        // Student s17 = new Student(17, "Anton", "Dolgih", "Moscow", 20);
        // Student s18 = new Student(18, "Yliya", "Naboychenko", "Moscow", 21);

        // Create and complete Student List №1
        // List<Student> listStud1 = new ArrayList<Student>();
        // listStud1.add(s1);
        // listStud1.add(s2);
        // listStud1.add(s3);
        // listStud1.add(s4);
        // listStud1.add(s5);
        // listStud1.add(s6);

        // Create and complete Student List №2
        // List<Student> listStud2 = new ArrayList<Student>();
        // listStud2.add(s7);
        // listStud2.add(s8);
        // listStud2.add(s9);
        // listStud2.add(s10);
        // listStud2.add(s11);
        // listStud2.add(s12);
        // listStud2.add(s13);
        // listStud2.add(s14);

        // Create and complete Student List №3
        // List<Student> listStud3 = new ArrayList<Student>();
        // listStud3.add(s15);
        // listStud3.add(s16);
        // listStud3.add(s17);
        // listStud3.add(s18);

        // StudentGroup group1 = new StudentGroup(listStud1);
        // StudentGroup group2 = new StudentGroup(listStud2);
        // StudentGroup group3 = new StudentGroup(listStud3);

        // Create and complete List StudentGroup
        // List<StudentGroup> stream = new ArrayList<StudentGroup>();


        // stream.add(group1);
        // stream.add(group2);
        // stream.add(group3);

        // StudentStream streams = new StudentStream(stream, 1);


        // System.out.println("_____Before sorting_____");
        
        // for(StudentGroup group : streams){
        //     for(Student student: group){
        //         System.out.println(student);
        //     }
        // }
        // System.out.println("------------------------------------------------");
        // System.out.println();

        // Collections.sort(streams.getStream());

        // System.out.println("_____After sorting_____");
        
        // for(StudentGroup group : streams){
        //     for(Student student: group){
        //         System.out.println(student);
        //     }
        // }
        // System.out.println("------------------------------------------------");

        // System.out.println("_____Using PersonComparator_____");

        // UserComparator<Student> compareS = new UserComparator<Student>();
        // System.out.println(compareS.compare(s17, s18)); // ?? Ask teacher, why result = (-24)??

        //For Paying salary create emploee controller
        //EmploeeController.paySalary(empl1);



    }
}


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetViewEng;
import Model.FileModel;
import Model.HashModel;
import Model.Student;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {

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

        HashMap<Long,Student> studentsMap = new HashMap<Long,Student>();
        studentsMap.put((long) 1, s1);
        studentsMap.put((long) 2, s2);
        studentsMap.put((long) 3, s3);
        studentsMap.put((long) 4, s4);

        iGetModel model = new HashModel(studentsMap);

        iGetViewEng view = new ViewEng();

        //FileModel fModel = new FileModel("StudentsDB.txt");
        //fModel.saveAllStudentsToFile(listStud); //model for save in file StudentDB.txt
        //iGetModel model = new Model(listStud); //model for save in operating memory

        //iGetModel newFModel = fModel; 
        
        //iGetViewEng view = new ViewEng();
        
        Controller controller = new Controller(view, model);

        controller.update();

        controller.run();
    }
}
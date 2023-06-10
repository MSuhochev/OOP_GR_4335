package Controllers;

import Services.StudentService;
import StudentDomen.Student;

public class StudentController implements iUserController<Student>{
    private final StudentService dataService = new StudentService();

    @Override
    public void create(String firstName, String secondName, String adressUser, int ageUser) {
        dataService.create(firstName, secondName, adressUser, ageUser);
    }
}

package Controllers;

import Services.TeacherService;
import StudentDomen.Teacher;

public class TeacherController implements iUserController<Teacher>{

    private final TeacherService teachServ = new TeacherService();

    //Override create method for teacher service
    @Override
    public void create(String firstName, String secondName, String adressUser, int ageUser) {
        teachServ.create(firstName, secondName, adressUser, ageUser);
    }
    
    //Create <T> - Generic method for paying salaries to teacher
    static public <T extends Teacher> void paySalary(T user){
        System.out.println("Teacher " + user.getFirstName() + " received a salary - 30000 RUR");
    }
}

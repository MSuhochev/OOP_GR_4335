package Controllers;

import Services.EmploeeService;
import StudentDomen.Emploee;

public class EmploeeController implements iUserController<Emploee>{

    private final EmploeeService empServ = new EmploeeService();

    //Override create method for emploee service
    @Override
    public void create(String firstName, String secondName, String adressUser, int ageUser) {
        empServ.create(firstName, secondName, adressUser, ageUser);
    }

    //Сreate <T> - Generic method for paying salaries to employees
    static public <T extends Emploee> void paySalary(T user){
        System.out.println(user.getFirstName() + " received a salary - 10000 RUR");
    }
    
}

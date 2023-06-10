package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.UserComparator;

public class EmploeeService implements iUserService<Emploee> {
    private long count;
    private String position;
    private List<Emploee> emploees;
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }
    @Override
    public List<Emploee> getAll() {
        return emploees;
    }
    @Override
    public void create(String firstName, String secondName, String adressUser, int ageUser) {
        Emploee emploeePerson = new Emploee(count, firstName, secondName, adressUser, ageUser, position);
        count++;
        emploees.add(emploeePerson);
    }

     public List<Emploee> getSortedByFIOEmploeesList(){
        List<Emploee> newEmploeeList = new ArrayList<Emploee>(emploees);
        newEmploeeList.sort(new UserComparator<Emploee>());
        return newEmploeeList;
    }
}

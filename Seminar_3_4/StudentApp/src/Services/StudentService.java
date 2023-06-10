package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.UserComparator;
import StudentDomen.Student;

public class StudentService implements iUserService<Student> {
    private int count;
    private List<Student> students;
    
    public StudentService() {
        this.students = new ArrayList<Student>();
    }
    @Override
    public List<Student> getAll() {
        return students;
    }
    @Override
    public void create(String firstName, String secondName, String adressUser, int ageUser) {
        Student studentPerson = new Student(count, firstName, secondName, adressUser, ageUser);
        count++;
        students.add(studentPerson);
    }

    public List<Student> getSortedByFIOStudentsList(){
        List<Student> newStudList = new ArrayList<Student>(students);
        newStudList.sort(new UserComparator<Student>());
        return newStudList;
    }
}

package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;

public class TeacherService implements iUserService<Teacher> {

    //create additional fields for TeacherService class
    private int count;
    private String specialty;
    private List<Teacher> teachers;   //create list teachers

    //create method TeacherService
    public TeacherService(){
        this.teachers = new ArrayList<Teacher>();
    }
    //override teacher list output method
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    //override the creation of the teacher's persona and adding it to the list
    @Override
    public void create(String firstName, String secondName, String adressUser, int ageUser) {
        Teacher teacherPerson = new Teacher(count, firstName, secondName, adressUser, ageUser, specialty);
        count++;
        teachers.add(teacherPerson);
    }

    //add method for displaying a list of teachers sorted by the generic UserComparator class
    public List<Teacher> getSortedByFIOTeachersList(){
        List<Teacher> newTeacherList = new ArrayList<Teacher>(teachers);
        newTeacherList.sort(new UserComparator<Teacher>());
        return newTeacherList;
    }


    
}

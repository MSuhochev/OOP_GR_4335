package Controller;

import java.util.Collection;
import Model.Student;

public interface iGetViewEng {
    public void printAllStudents(Collection<Student> students);
    String prompt(String message);
}


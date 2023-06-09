package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    //Students list 
    private List<Student> students;

    //public list group
    public List<StudentGroup> group;

    //Constructor for StudentGroup
    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    //Getter and setter for StudentGroup
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    //Override Iterator for StudentGroup
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }

    //Added sorting by count of students
    @Override
    public int compareTo(StudentGroup o) {
        if(this.students.size() == o.students.size()){
        }
        if(this.students.size() < o.students.size()){
            return 1;
        }
        return -1;
    }  
}

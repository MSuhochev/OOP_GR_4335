package Model;

import java.util.List;


import Controller.iGetModel;

public class Model implements iGetModel {
    //create List students
    private List<Student> students;

    //add constructor 
    public Model(List<Student> students) {
        this.students = students;
    }

    //create method getAllStudents
    public List<Student> getAllStudents(){

        return students;
    }

    @Override
    public void DeleteStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'DeleteStudent'");
    }

    
}

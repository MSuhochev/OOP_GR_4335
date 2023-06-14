package Controller;

import java.util.ArrayList;
import java.util.Collection;

import Model.Student;

public class Controller {
    private iGetViewEng view;
    private iGetModel model;
    private Collection<Student> students; // declare a variable students (1)

    // generate a constructor
    public Controller(iGetViewEng view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>(); // Initialise a variable students (2)
    }

    // create a method to receive from the model inside the controller
    public void getAllStudents() {
        students = model.getAllStudents();
    }

    // create a Test method
    public boolean testData() {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    // popular method update for calling controller MVC - version
    // public void update() {
    // view.printAllStudents(model.getAllStudents());
    // }

    // method update for calling controller MVP - version
    public void update() {
        getAllStudents();
        if (testData()) {
            view.printAllStudents(students);
        } else {
            System.out.println("The List of Students is empty!");
        }
    }

    // method run
    public void run() {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            System.out.println("You can:" + "\n"
                    + "1. See the students list with command - \"List\"" + "\n"
                    + "2. Delete the student from the list with command - \"Delete\"" + "\n"
                    + "3. Exit from the programm with command \"Exit\"");

            String command = view.prompt("Enter the command: ");
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Exit from the programm...");
                    break;
                case LIST:
                    getAllStudents();
                    view.printAllStudents(students);
                    break;
                case DELETE:
                    model.DeleteStudent();
                    view.printAllStudents(students);
                    break;
                default:
                    break;
            }
        }
    }
}

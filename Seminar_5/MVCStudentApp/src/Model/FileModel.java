package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

public class FileModel implements iGetModel {
    // the path to the file
    private String fileName;

    // method
    public FileModel(String fileName) {
        this.fileName = fileName;

        // Exception Handling try/catch
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> getAllStudents() {
        // creates temporary storage in memory
        List<Student> students = new ArrayList<Student>();
        try {
            // connect to file
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            // go through this file
            while (line != null) {
                String[] param = line.split(" ");
                Student user = new Student(Long.parseLong(param[0]), param[1], param[2], param[3], Integer.parseInt(param[4]));
                students.add(user);
                line = reader.readLine();

            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    public void saveAllStudentsToFile(List<Student> students) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            for (Student user : students) {
                fw.write(user.getStudentId() + " " + user.getFirstName() + " " + user.getSecondName()
                        + " " + user.getAdressUser() + " " + user.getAgeUser());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void DeleteStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'DeleteStudent'");
    }
}

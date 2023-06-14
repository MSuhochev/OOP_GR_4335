package Model;

public class Student extends User implements Comparable<Student>{

    //The field that draws the Student class
    private long studentId;

    //Constructor Student class
    public Student(long studentId, String firstName, String secondName, String adressUser, int ageUser) {
        super(firstName, secondName, adressUser, ageUser);
        this.studentId = studentId;
    }

    //Getters and setters for Student
    public long getStudentId() {
        return studentId;
    }
    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }
    
    //To string method override for Student
    @Override
    public String toString(){
        return "User{" +
        "FirstName => '" + super.getFirstName() + '\''+
        ", SecondName => '" + super.getSecondName() + '\''+
        ", User Adress => '" + super.getAdressUser() + '\''+
        " User Age => " + super.getAgeUser() + '\''+
        " ID Student => '" + studentId +  
        '}';
    }

    //Added sorting by Age and Id
    @Override
    public int compareTo(Student o) {
        if(super.getAgeUser() == o.getAgeUser()){
            if(this.studentId == o.studentId){
                return 0;
            }
            if(this.studentId < o.studentId){
                return -1;
            }
            return 1;
        }
        if(super.getAgeUser() < o.getAgeUser()){
            return -1;
        }
        return 1;
    }
}

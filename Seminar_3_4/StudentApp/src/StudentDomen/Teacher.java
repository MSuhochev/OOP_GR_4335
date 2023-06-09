package StudentDomen;

public class Teacher extends User implements Comparable<Teacher> {
    
    //The field that draws the Teacher class
    private long teacherId;

    //Constructor Student class
    public Teacher(String firstName, String secondName, String adressUser, int ageUser, long teacherId) {
        super(firstName, secondName, adressUser, ageUser);
        this.teacherId = teacherId;
    }

    //Getters and setters for Teacher
    public long getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    //To string method override for Teacher
    @Override
    public String toString(){
        return "User{" +
        "FirstName => '" + super.getFirstName() + '\''+
        ", SecondName => '" + super.getSecondName() + '\''+
        ", User Adress => '" + super.getAdressUser() + '\''+
        " User Age => " + super.getAgeUser() + '\''+
        " ID Teacher => '" + teacherId +  
        '}';
    }

    //Added sorting by Age and Id
    @Override
    public int compareTo(Teacher o) {
        if(super.getAgeUser() == o.getAgeUser()){
            if(this.teacherId == o.teacherId){
                return 0;
            }
            if(this.teacherId < o.teacherId){
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

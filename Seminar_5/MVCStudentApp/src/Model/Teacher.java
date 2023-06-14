package Model;

public class Teacher extends User implements Comparable<Teacher> {
    
    //The field that draws the Teacher class
    private long teacherId;
    private String spetialty;

    //Constructor Student class
    public Teacher(long teacherId, String firstName, String secondName, String adressUser, int ageUser, String spetialty ) {
        super(firstName, secondName, adressUser, ageUser);
        this.teacherId = teacherId;
        this.spetialty = spetialty;
    }

    //Getters and setters for Teacher
    public long getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }
     public String getSpetialty() {
        return spetialty;
    }
    
    //To string method override for Teacher
    @Override
    public String toString(){
        return "User{" +
        "ID Teacher => '" + getTeacherId() + '\''+
        "FirstName => '" + super.getFirstName() + '\''+
        ", SecondName => '" + super.getSecondName() + '\''+
        ", User Adress => '" + super.getAdressUser() + '\''+
        " User Age => " + super.getAgeUser() + '\''+
        " Spetialty => '" + getSpetialty() +  
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

package Model;

public class Emploee extends User{
    
    //add field for Emploee class
    private long count;
    private String specialty;

    //add constructor for Emploee class
    public Emploee(long count, String firstName, String secondName, String adressUser, int ageUser, String specialty) {
        super(firstName, secondName, adressUser, ageUser);
        this.count = count;
        this.specialty = specialty;
    }

    //add getter and setter
    public long getCount() {
        return count;
    }
    public void setCount(long count) {
        this.count = count;
    }
    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    
    

    
}

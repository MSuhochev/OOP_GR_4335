package Model;

// public class User - parent class for teachers, students and 
public class User {
    private String firstName;
    private String secondName;
    private String adressUser;
    private int ageUser;

    //Constructor User class
    public User(String firstName, String secondName, String adressUser, int ageUser) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.adressUser = adressUser;
        this.ageUser = ageUser;
    }

    //Getters and setters for user
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getAdressUser() {
        return adressUser;
    }
    public void setAdressUser(String adressUser) {
        this.adressUser = adressUser;
    }
    public int getAgeUser() {
        return ageUser;
    }
    public void setAgeUser(int ageUser) {
        this.ageUser = ageUser;
    }

    //To string method override
    @Override
    public String toString(){
        return "User{" +
        "FirstName => '" + firstName + '\''+
        ", SecondName => '" + secondName + '\''+
        ", User Adress => '" + adressUser + '\''+
        " User Age => " + ageUser + 
        '}';
    }
}

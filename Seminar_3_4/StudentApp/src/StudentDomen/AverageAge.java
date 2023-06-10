package StudentDomen;

import java.util.List;

public class AverageAge<T extends User> {
    //create list users
    private List<T> users;


    public AverageAge(List<T> users) {
        this.users = users;
    }

    // create T method Average Age
    public double getAverageAge() {
        double summa = 0;
        for (T user : users) {
            summa += user.getAgeUser();
        }
        return summa / users.size();
    }
}
    

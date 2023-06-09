package StudentDomen;

import java.util.Iterator;
import java.util.List;

// Create the StudentSteamIterator class and connect to the Iterator<StudentGroup> interface
public class StudentStreamIterator implements Iterator<StudentGroup> {
    private int counter;
    private final List<StudentGroup> groups;

    // StudentSteamIterator class constructor
    public StudentStreamIterator(List<StudentGroup> groups) {
        this.groups = groups;
        this.counter = 0;
    }
    // Qverride method that calls a boolean variable indicating whether the next element is in the instance's list
    @Override
    public boolean hasNext() {
        return counter < groups.size();
    }

    // Method that calls the next element of the instance's list
    @Override
    public StudentGroup next() {
        if(!hasNext()){
            return null;
        }
        return groups.get(counter++);
    }
}

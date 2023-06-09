package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {

    //Stream list
    private List<StudentGroup> group;
    private int streamNumber; // the field - number of stream

    //Constructor for StudentStream
    public StudentStream(List<StudentGroup> group, int streamNumber) {
        this.group = group;
        this.streamNumber = streamNumber;
    }

    //Getter and setter for StudentStream
    public List<StudentGroup> getStream() {
        return group;
    }
    public void setStream(List<StudentGroup> group) {
        this.group = group;
    }
    public int getStreamNumber() {
        return streamNumber;
    }

    //Override Iterator
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentStreamIterator(group);
    }
}

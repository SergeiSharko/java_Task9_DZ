package Task2_DZ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {

    private List<Student> listOfStudents = new ArrayList<Student>();

    public StudyGroup(List<Student> listStud) {
        this.listOfStudents = listStud;
    }

    public void setList(List<Student> listStud) {
        this.listOfStudents = listStud;
    }

    public List<Student> getList() {
        return listOfStudents;
    }

    @Override
    public Iterator<Student> iterator() {

        Iterator<Student> iterStud = new Iterator<Student>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < listOfStudents.size();
            }

            @Override
            public Student next() {
                return listOfStudents.get(index++);
            }
        };
        return iterStud;
    }

    @Override
    public String toString() {
        return listOfStudents + "";
    }
}

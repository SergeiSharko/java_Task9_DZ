package Task2_DZ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup>{

    private List<StudyGroup> listOfGroups = new ArrayList<StudyGroup>();

    public Stream(List<StudyGroup> listGrps) {
        this.listOfGroups = listGrps;
    }

    public void setListGroups(List<StudyGroup> listGrps) {
        this.listOfGroups = listGrps;
    }
    
    public List<StudyGroup> getListGroups() {
        return listOfGroups;
    }

    @Override
    public Iterator<StudyGroup> iterator() {

        Iterator<StudyGroup> iter = new Iterator<StudyGroup>() {

            private int index;

            @Override
            public boolean hasNext() {
                return index < listOfGroups.size();        
            }

            @Override
            public StudyGroup next() {
                return listOfGroups.get(index++);
            }
        };
        return iter;      
    }    
}

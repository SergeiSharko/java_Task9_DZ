package Task2_DZ;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        return Integer.compare(o1.getListGroups().size(), o2.getListGroups().size());      
    }  
}
// — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
// — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;

package Task2_DZ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> listStud1 = new ArrayList<Student>(List.of(
                new Student("Иван", "Иванов", 20),
                new Student("Петр", "Рыбин", 21),
                new Student("Василий", "Новсов", 22),
                new Student("Павел", "Ломоносов", 22)));

        List<Student> listStud2 = new ArrayList<Student>(List.of(
                new Student("Семен", "Семеныч", 24),
                new Student("Петр", "Первый", 23),
                new Student("Витовд", "Жиглов", 19),
                new Student("Максим", "Трутнев", 20)));

        List<Student> listStud3 = new ArrayList<Student>(List.of(
                new Student("Ольга", "Семеныч", 20),
                new Student("Екатерина", "Великая", 20),
                new Student("Лев", "Жиглов", 21),
                new Student("Оксана", "Темушкина", 21)));

        List<StudyGroup> listGroups1 = new ArrayList<StudyGroup>(List.of(
                new StudyGroup(listStud1),
                new StudyGroup(listStud2)));

        List<StudyGroup> listGroups2 = new ArrayList<StudyGroup>(List.of(new StudyGroup(listStud3)));

        Stream stream1 = new Stream(listGroups1);
        Stream stream2 = new Stream(listGroups2);

        Iterator<StudyGroup> itergrps = stream1.iterator();

        while(itergrps.hasNext()) {
            System.out.println(itergrps.next());
        }

        itergrps = stream2.iterator();

        System.out.println();

        while(itergrps.hasNext()) {
            System.out.println(itergrps.next());
        }

        StreamComparator strComp = new StreamComparator();
        System.out.println();
        System.out.println("Результат сравнения потоков: " + strComp.compare(stream1, stream2));

    }

}

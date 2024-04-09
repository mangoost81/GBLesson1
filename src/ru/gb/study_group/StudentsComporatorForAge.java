package ru.gb.study_group;

import java.util.Comparator;

public class StudentsComporatorForAge implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

    public int compareByName(Students o1, Students o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

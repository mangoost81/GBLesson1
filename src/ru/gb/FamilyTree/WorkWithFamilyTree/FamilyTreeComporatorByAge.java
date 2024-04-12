package ru.gb.FamilyTree.WorkWithFamilyTree;

import java.util.Comparator;

public class FamilyTreeComporatorByAge <E extends FamilyTreeElem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

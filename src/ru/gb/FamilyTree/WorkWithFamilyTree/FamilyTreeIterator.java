package ru.gb.FamilyTree.WorkWithFamilyTree;

import ru.gb.FamilyTree.Human.Human;

import java.util.Iterator;
import java.util.List;

public class FamilyTreeIterator implements Iterator<Human> {
    private List<Human> familyTree;
    private int index;

    public FamilyTreeIterator(List<Human> familyTree) {
        this.familyTree = familyTree;
    }


    @Override
    public boolean hasNext() {
        return index < familyTree.size();
    }

    @Override
    public Human next() {
        return familyTree.get(index++);
    }


}

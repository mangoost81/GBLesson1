package ru.gb.FamilyTree.Model.Servise;

import ru.gb.FamilyTree.Model.FamilyTree.FamilyTree;
import ru.gb.FamilyTree.Model.WorkWithFamilyTree.Iterators.FamilyTreeIterator;

public class ServiseFT {
    private int genId;
    private FamilyTreeIterator familyTree;

    private ServiseFT(){
        familyTree = new FamilyTreeIterator<E>();

    }

    public void addMember(E member) {
        if (!familyTree.contains(member)) {
            familyTree.add(member);
        }
    }
}

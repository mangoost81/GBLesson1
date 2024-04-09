package ru.gb.FamilyTree.FamilyTree;

import ru.gb.FamilyTree.Human.Human;
import ru.gb.FamilyTree.WorkWithFamilyTree.FamilyTreeIterator;
import ru.gb.FamilyTree.WorkWithFamilyTree.HumanComporator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FamilyTree implements Serializable, Iterable<Human> {
    private List<Human> humanList;

    public FamilyTree() {

        this(new ArrayList<>());
    }

    public FamilyTree(List<Human> humanList) {

        this.humanList = humanList;
    }

    public void addMember(Human human) {
        if (!humanList.contains(human)) {
            humanList.add(human);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FamilyTree{ \n");
        for (Human human : humanList) {
            sb.append(human.getInfo()).append("\n");
        }

        sb.append('}');
        return sb.toString();
    }

    public void saveToFile() {

    }

    public void sortByName() {
        Collections.sort(humanList);
    }


    public int sortByAge() {
        humanList.sort(new HumanComporator());
        return 0;
    }


    @Override
    public Iterator<Human> iterator() {
        return new FamilyTreeIterator(humanList);
    }



}


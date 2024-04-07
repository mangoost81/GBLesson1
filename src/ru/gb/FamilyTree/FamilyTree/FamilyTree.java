package ru.gb.FamilyTree.FamilyTree;

import ru.gb.FamilyTree.Human.Human;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable {
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
        final StringBuilder sb = new StringBuilder("FamilyTree{");
        for (Human human: humanList) {
            sb.append(human.getInfo()).append("\n");
        }

        sb.append('}');
        return sb.toString();
    }

    public void saveToFile() {

    }
}


package ru.gb.FamilyTree.Model.WorkWithFamilyTree.Comporators;

import ru.gb.FamilyTree.Model.Human.Human;

import java.util.Comparator;

public class HumanComporator implements Comparator<Human> {


    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }


}

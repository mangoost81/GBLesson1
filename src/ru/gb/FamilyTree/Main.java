package ru.gb.FamilyTree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Human human1 = new  Human("Дмитрий", LocalDate.of(1981,3,17),
                null, Gender.Male, null, null,null);
        Human human2 = new Human("Валерия", LocalDate.of(2005, 10, 5),
                null,Gender.Female,null, null, human1);
        Human human3 = new Human("Алина", LocalDate.of(1980,6,4),
                null,Gender.Female, null,null,null);
        Human human4 = new Human("Наталья", LocalDate.of(1961,6,1),
                null, Gender.Female, null, null, null);
        Human human5 = new Human("Александр", LocalDate.of(1956,12,9),
                null, Gender.Male, null, null, null);
        Human human6 = new Human("Маргарита", LocalDate.of(1932,2,23),
                null, Gender.Female, null, null, null);
        Human human7 = new Human("Борис", LocalDate.of(1931,8,12),
                LocalDate.of(2008,8,16), Gender.Male, null, null, null);

        human1.setChildren(List.of(human2));


        FamilyTree familyTree = new FamilyTree();
        familyTree.list = new ArrayList<>();
        familyTree.list.add(human1);
        familyTree.list.add(human2);
        familyTree.list.add(human3);
        familyTree.list.add(human4);
        familyTree.list.add(human5);
        familyTree.list.add(human6);
        familyTree.list.add(human7);

        System.out.println(human1);



    }
}

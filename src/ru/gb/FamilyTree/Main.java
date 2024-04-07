package ru.gb.FamilyTree;

import ru.gb.FamilyTree.FamilyTree.FamilyTree;
import ru.gb.FamilyTree.FileHandler.FileHandler;
import ru.gb.FamilyTree.FileHandler.Writeble;
import ru.gb.FamilyTree.Human.Gender;
import ru.gb.FamilyTree.Human.Human;

import java.io.*;
import java.nio.file.Watchable;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Human dmitry = new Human("Дмитрий", LocalDate.of(1981, 3, 17),
                null, Gender.Male, null, null);
        Human valery = new Human("Валерия", LocalDate.of(2005, 10, 5),
                null, Gender.Female, null, null);
        Human alina = new Human("Алина", LocalDate.of(1980, 6, 4),
                null, Gender.Female, null, null);
        Human nataly = new Human("Наталья", LocalDate.of(1961, 6, 1),
                null, Gender.Female, null, null);
        Human alexandr = new Human("Александр", LocalDate.of(1956, 12, 9),
                null, Gender.Male, null, null);
        Human margo = new Human("Маргарита", LocalDate.of(1932, 2, 23),
                null, Gender.Female, null, null);
        Human boris = new Human("Борис", LocalDate.of(1931, 8, 12),
                LocalDate.of(2008, 8, 16), Gender.Male, null, null);

        String filePath = "C:\\Learning\\JavaProject\\src\\ru\\gb\\FamilyTree\\FileHandler\\familytree.txt";
        FamilyTree familyTree = new FamilyTree();
        System.out.println(familyTree);

        dmitry.setFather(alexandr);
        dmitry.addChild(valery);
        alina.addChild(valery);
        valery.setFather(dmitry);
        valery.setMother(alina);
        dmitry.setMother(nataly);
        nataly.setMother(margo);
        nataly.setFather(boris);
        nataly.addChild(dmitry);
        boris.addChild(nataly);
        margo.addChild(nataly);
        alexandr.addChild(dmitry);
        familyTree.addMember(dmitry);
        familyTree.addMember(valery);
        familyTree.addMember(alina);
        familyTree.addMember(nataly);
        familyTree.addMember(margo);
        familyTree.addMember(alexandr);
        familyTree.addMember(boris);

        FileHandler fileHandler =new FileHandler();
        fileHandler.saveFile(familyTree, filePath);
        fileHandler.readFile(filePath);


//        System.out.println(dmitry.getInfo());
//        System.out.println(nataly.getChildrenInfo());
//        System.out.println(valery.getFather());
//        System.out.println(familyTree);


    }
}

package ru.gb.FamilyTree.Model;

import java.io.Serializable;

public interface Writeble {

    boolean saveFile(Serializable serializable, String filePath);

    Object readFile(String filePath);

}

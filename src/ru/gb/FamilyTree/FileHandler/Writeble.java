package ru.gb.FamilyTree.FileHandler;

import ru.gb.FamilyTree.Human.Human;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

public interface Writeble {

    boolean saveFile(Serializable serializable, String filePath);

    Object readFile(String filePath);

}

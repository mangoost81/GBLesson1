package ru.gb.FamilyTree.View.Command;

import ru.gb.FamilyTree.View.ConsoleUI;
import ru.gb.study_group.View.command.AddStudent;

public class AddMember extends CommandFT{
    public AddStudent(ConsoleUI consoleUI){
        super("Добавьте нового члена семьи", consoleUI);
    }
}

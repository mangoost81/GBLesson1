package ru.gb.FamilyTree.View.Command;

import ru.gb.FamilyTree.View.ConsoleUI;

public abstract class CommandFT {
    private final String deskription;
    private final ConsoleUI consoleUI;

    public CommandFT(String deskription, ConsoleUI consoleUI){
        this.deskription = deskription;
        this.consoleUI = consoleUI;
    }

    public String getDeskription(){
        return deskription;
    }
    public abstract void execute();

}

package ru.gb.FamilyTree.View;

import ru.gb.FamilyTree.Model.FamilyTree.FamilyTree;
import ru.gb.FamilyTree.Model.Human.Human;
import ru.gb.FamilyTree.View.Command.AddMember;
import ru.gb.FamilyTree.View.Command.CommandFT;


import java.util.ArrayList;
import java.util.List;

public class MainMenuFT {
    private final List<CommandFT> commandListFT;

    public MainMenuFT(ConsoleUI consoleUI){
        commandListFT = new ArrayList<>();
        commandListFT.add();
    }

    public String getMenu() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < commandListFT.size(); i++) {
            sb.append(i+1);
            sb.append(". ");
            sb.append(commandListFT.get(i).getDeskription());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void execute(int choice){
        CommandFT commandFT = commandListFT.get(choice - 1);
        commandFT.execute();
    }

}

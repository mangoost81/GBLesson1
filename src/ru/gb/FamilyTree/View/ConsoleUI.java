package ru.gb.FamilyTree.View;

import ru.gb.FamilyTree.Presenter.PresenterFT;

import java.util.Scanner;

public class ConsoleUI implements ViewFT {
    private Scanner scanner;
    private PresenterFT presenter;
    private boolean status;
    private MainMenuFT mainMenuFT;

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
        this.presenter = new PresenterFT(this);
        this.status = true;
        this.mainMenuFT = new MainMenuFT(this);
    }

    public void startFT() {
        System.out.println("Выберите действие: ");

        while (status){
            System.out.println(mainMenuFT.getMenu());
            String strchoice = scanner.nextLine();
            //check valid
            int choice = Integer.parseInt(strchoice);
            mainMenuFT.execute(choice);

        }
    }

    public void stop() {
        status = false;
        System.out.println("Всего хорошего. ");
    }



    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }
}

package ru.gb.study_group.View;

import ru.gb.study_group.Presenter.Presenter;

import java.util.Scanner;

public class Console implements View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean status;

    public Console() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        status = true;
    }

    @Override
    public void start() {
        System.out.println("Выберите действие: ");

        while (status) {
            System.out.println("1. Добавить студента.");
            System.out.println("2. Получить список студентов.");
            System.out.println("3. Отсортировать по имени.");
            System.out.println("4. Отсортировать по возрасту.");
            System.out.println("5. Закончить работу.");

            String line = scanner.nextLine();
            switch (line) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    getstudentListInfo();
                    break;
                case "3":
                    sortByName();
                    break;
                case "4":
                    sortByAge();
                    break;
                case "5":
                    finish();
                    break;
                default:
                    System.out.println("Incorrect input. ");
            }
        }
    }

    private void finish() {
        status = false;
        System.out.println("До свидания.");
    }

    private void sortByAge() {
        presenter.sortByAge();
    }

    private void sortByName() {
         presenter.sortByName();
    }

    private void getstudentListInfo() {
        presenter.getStudentsInfo();
    }

    private void addStudent() {
        System.out.println("Введите имя студента. ");
        String name = scanner.nextLine();

        System.out.println("Введите возраст студента. ");
        String sTrage = scanner.nextLine();
        int age = Integer.parseInt(sTrage);
        presenter.addStudent(name, age);
    }

    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }
}

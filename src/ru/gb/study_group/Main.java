package ru.gb.study_group;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.addStudent("Bob", 19);
        service.addStudent("Max", 20);
        service.addStudent("Ted", 17);
        service.addStudent("Mary", 20);
        service.addStudent("Helen", 19);

        System.out.println(service.getStudentsInfo());
        service.sortByName();
        System.out.println(service.getStudentsInfo());
        service.sortByAge();
        System.out.println(service.getStudentsInfo());

    }
}

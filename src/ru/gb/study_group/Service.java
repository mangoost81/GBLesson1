package ru.gb.study_group;

import java.util.Collections;

public class Service {
    private int genId;
    private StudyGroup group;

    public Service() {
        group = new StudyGroup();
    }

    public void addStudent(String name, int age) {
        Students student = new Students(name, genId, age);
        group.addStudent(student);
        genId++;
    }

    public String getStudentsInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Students List: \n");
        for (Students student: group) {
            sb.append(student);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void sortByName() {
        group.sortByName();
    }

    public void sortByAge() {
        group.sortByAge();
    }
}

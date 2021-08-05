package ru.job4j.tracker.profession;

public class Programmer extends Engineer {

    private int old;

    public Programmer() {
    }

    public Programmer(String name, String surname, int experience, String programmingLanguage, int old) {
        super(name, surname, experience, programmingLanguage);
        this.old = old;
    }
}

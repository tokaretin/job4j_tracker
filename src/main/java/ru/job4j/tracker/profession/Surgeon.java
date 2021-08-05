package ru.job4j.tracker.profession;

import ru.job4j.tracker.profession.Doctor;

public class Surgeon extends Doctor {

    private String male;

    public Surgeon() {
    }

    public Surgeon(String name, String surname, String dressIsCasual, String experience, String male) {
        super(name, surname, dressIsCasual, experience);
        this.male = male;
    }
}

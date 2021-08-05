package ru.job4j.tracker.profession;

public class Dentist extends Doctor {

    private String specialising;

    public Dentist() {
    }

    public Dentist(String name, String surname, String dressIsCasual, String experience, String specialising) {
        super(name, surname, dressIsCasual, experience);
        this.specialising = specialising;
    }
}

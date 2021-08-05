package ru.job4j.tracker.profession;

public class Doctor extends Profession {

    private String dressIsCasual;
    private String experience;

    public Doctor() {
        super();
    }

    public Doctor(String name, String surname, String dressIsCasual, String experience) {
        super(name, surname);
        this.dressIsCasual = dressIsCasual;
        this.experience = experience;
    }
}

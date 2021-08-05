package ru.job4j.tracker.profession;

public class Engineer extends Profession {

    private int experience;
    private String programmingLanguage;

    public Engineer() {
        super();
    }

    public Engineer(String name, String surname, int experience, String programmingLanguage) {
        super(name, surname);
        this.experience = experience;
        this.programmingLanguage = programmingLanguage;
    }
}

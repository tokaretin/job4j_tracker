package ru.job4j.tracker.profession;

public class Builder extends Engineer{

    private String developer;

    public Builder() {
    }

    public Builder(String name, String surname, int experience, String programmingLanguage, String developer) {
        super(name, surname, experience, programmingLanguage);
        this.developer = developer;
    }
}

package ru.job4j.tracker.profession;

import ru.job4j.tracker.profession.Engineer;

public class Profession {

    private String name;
    private String surname;
    private String education;
    private int birthday;

    public Profession() {
    }

    public Profession (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Образование: " + education);
        System.out.println("Дата рождения: " + birthday);


    }

    public static class Builder extends Engineer {

        private String developer;

        public Builder() {
        }

        public Builder(String name, String surname, int experience, String programmingLanguage, String developer) {
            super(name, surname, experience, programmingLanguage);
            this.developer = developer;
        }
    }
}



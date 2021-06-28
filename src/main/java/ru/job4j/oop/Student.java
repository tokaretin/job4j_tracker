package ru.job4j.oop;

public class Student {
    public void music() {
        System.out.println("Tra - lya - lya ");
    }

    public void song() {
        System.out.println("I can sign a song: ");
    }

    public void musicc(String lyrics) {
        System.out.println("Tra - lya - lya " + lyrics);
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        System.out.println();
        petya.song();
        petya.song();
        petya.song();
        System.out.println();
        String lyrics = "I believe, I can fly";
        petya.musicc(lyrics);

    }
}

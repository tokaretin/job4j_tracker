package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Pioner petya = new Pioner();
        Wolf wolf = new Wolf();
        Girl girl = new Girl();
        girl.help(petya);
        wolf.eat(girl);
        petya.Kill(wolf);
    }
}

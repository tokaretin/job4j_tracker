package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Pioner petya = new Pioner();
        Wolf wolf = new Wolf();
        Girl girl = new Girl();
        girl.help(petya);
        wolf.eat(girl);
        petya.Kill(wolf);
        System.out.println();
        Ball ball = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        hare.eat(ball);
        wolf.eat(ball);
        fox.eat(ball);
    }
}

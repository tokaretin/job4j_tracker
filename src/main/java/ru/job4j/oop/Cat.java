package ru.job4j.oop;

public class Cat {

    public String sound() {
        return "may may";
    }

    private String food;

    private String name;

    public  void show() {
        System.out.println(this.name + " eats " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
        System.out.println();
        System.out.println("This is Gav's food.");
        Cat gav = new Cat();
        gav.eat("cutlet");
        gav.giveNick("Gav");
        gav.show();
        System.out.println("This is Black's food.");
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();
    }
}

package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String voice = "Неизвестное слово + " + eng;
        return voice;
    }

    public static void main(String[] args) {
        DummyDic dammy = new DummyDic();
        String engl = "eng";
        String engToRus = dammy.engToRus(engl);
        System.out.println(engToRus);
    }
}

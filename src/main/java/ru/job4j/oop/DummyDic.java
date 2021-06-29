package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово + " + eng;
    }

    public static void main(String[] args) {
        DummyDic dammy = new DummyDic();
        String english = "eng";
        String engToRuss = dammy.engToRus(english);
        System.out.println(engToRuss);
    }
}

package ru.diana.stack_practice.main;
import ru.diana.stack_practice.util.Check;

public class Main {
    public static void main(String[] args) {
        Check check = new Check();
        boolean result = check.CheckParent("{[()]}");
        if (result) {
            System.out.println("Последовательность скобок корректна");
        } else {
            System.out.println("Ошибка в последовательности скобок");
        }
    }
}

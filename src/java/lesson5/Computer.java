package java.lesson5;

import java.util.Scanner;

public class Computer {
    protected boolean cpu;
    protected boolean ram;
    protected boolean hardDrive;
    protected int loop;

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Привет, тебе нужно угадать число 0 или 1, что бы включить компьютер");
        String word = num.nextLine();
        switch (word) {
            case "Нет" -> System.out.print("Ну, что же, компьютер сгорел!");
            case "Да" -> {
                System.out.print("Ну-с, какое число я загадал?: ");
                int count = num.nextInt();
                int firstVariantOfNumberComputer = 0;
                int secondVariantOfNumberComputer = 1;
                int random_number = firstVariantOfNumberComputer + (int) (Math.random() *
                        secondVariantOfNumberComputer);
                for (int i = 1; i < 10; i++) {
                    if (random_number > count) {
                        System.out.println("Не верно:)! Мое число больше > твоего ");
                        System.out.print("Какое число я загадал?: ");
                        int number2 = num.nextInt();

                    } else if (random_number < count) {
                        System.out.println("Не верно:)! Мое число меньше < твоего ");
                        System.out.print("Какое число я загадал?: ");
                        int number3 = num.nextInt();

                    } else {
                        System.out.println("Урааа, ты включил компьютер! Я загодал число: " + random_number);
                        break;
                    }
                }
            }
        }
    }
}






package RandomValues;

import java.util.Random;

public class CalculatorMethods {

    public int sum(int a, int b) {
        return a + b;

    }

    public int getValue() {
        //Возвращаем случайное значение от 0 до 20
        return new Random().nextInt(20);
    }

    private int getValuePrivate() {
        return new Random().nextInt(20);
    }

    public int sumWithRandom(int a) {
        return a + getValue();//0
    }

    public int sumWithPrivateWithArgs(int a) {
        return a + getValuePrivateWithArgs(8);//0
    }

    private int getValuePrivateWithArgs(int value) {
        return new Random().nextInt(value);
    }

    public int subtractFrom(int a) {
        return a - getValue();

    }

    public int multiply(int a) {
        return a * getValue();
    }

    public int divide(int a) {
        return a / getValue();
    }

    public int divideWithRemainder(int a) {
        return a % getValue();
    }

    public static int getRandomNumber() {
        return new Random().nextInt(20);//0-19, 5-17
    }

    public static int getRandomNumberInRange() {
//Для получения генерации случайных чисел на определенном промежутке
// используем формулу (max - min + 1) + min)
        return new Random().nextInt(13) + 5;//5-17
    }
}

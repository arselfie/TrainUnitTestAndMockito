package Arrays;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Random;

public class ArraysMethods {

    private int[] array;

    public ArraysMethods() {
        this.array = new int[10];//0
    }

    //TODO only for test puprose
    public int[] getArray() {
        return array;
    }

    //TODO only for test puprose
    public void setArray(int[] array) {
        this.array = array;
    }

    public void addElement(int element) {

        resize();

        String log = LocalDate.now() + "\taddElement\tparams -> " + element;//  + enum
        
        addLog(log);
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = element;
                break;
            }
        }
    }

    private void addLog(String log) {
        //how to write text to file(.txt) using Java 7 and upper
    }

    private void resize() {
        if (array[array.length - 1] != 0) {
            int[] tempArray = new int[array.length * 2];//0

            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
        }
    }

    public void changeElementByIndex(int index, int newValue) {
        if (index < 0) {
            System.out.println("Incorrect index");
            return;
        }

        array[index] = newValue;

    }

    /*
    1 2 3 4 5 6 0 0 -> 1 2 3 5 6 0 0
    
    1) new array array.length - 1
    2) copy elements before index and after index
    3) 
     */
    public void deleteElementByIndex(int index) {//test
        int[] tempArray = new int[array.length - 1];

        for (int i = 0; i < index; i++) {

            tempArray[i] = array[i];

        }

        for (int i = index; i < array.length - 1; i++) {

            tempArray[i] = array[i + 1];

        }

        array = tempArray;

    }

    //уменьшение листа до заданного количество элементов.
    public void decreasingToAmountOfElements(int amountOfElements) {
        if (amountOfElements < 0) {
            System.out.println("Incorrect amounts of elements");
            return;
        }

        int[] tempArray = new int[amountOfElements];

        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = array[i];
        }

        array = tempArray;
    }

    //уменьшение листа до заданного количество элементов.
    public void increaseToAmountOfElements(int amountOfElements) {
        if (amountOfElements < 0) {
            System.out.println("Incorrect amounts of elements");
            return;
        }
        int[] tempArray = new int[array.length + amountOfElements];

        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }

        array = tempArray;
    }

    //ClassName name_of_reference = new ClassName(outcoming params or absent);
    //вывод элементов в консоль в прямом и обратном порядке.
    public void displayElementsInRightOrder() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");//\n\r
        }
    }

    // сортировка листа методом пузырька
    public void sortingByBubbleMethod() {//should use bubble sort
        for (int i = 0; i < array.length; i++) {
            int minElement = array[i];
            int minIElement = i;

            for (int j = i + 1; j < array.length; j++) {
                //Если находим, запоминаем его индекс
                if (array[j] < minElement) {
                    minElement = array[j];
                    minIElement = j;
                }
            }
            if (i != minIElement) {
                int tmp = array[i];
                array[i] = array[minIElement];
                array[minIElement] = tmp;
            }
        }
    }

    //добавление массива в массив.1 2 3 0 0 0 0 0 + 7 8 9 2 -> 1 2 3 7 8 9 2 0
    public void addingArrayToArray(int[] newArray) {
        int countZeros = 0;

        for (int element : array) {
            if (element == 0) {
                countZeros++;
            }
        }

        int positionFirstZero = array.length - countZeros;

        if (countZeros < newArray.length) {
            increaseToAmountOfElements(newArray.length - countZeros + 1);
        }

        for (int i = positionFirstZero, j = 0; j < newArray.length; ++i, ++j) {
            array[i] = newArray[j];
        }
    }

    /*
    1) Count zeros
    2) if(countZeros < newArray.length) -> increase array on newArray.length - countZeros + 1
    3) move elements from old array to new
     */
    //Поиск элемента методом линейного поиска(первое вхождение).
    public void searchForElement(int element) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {//
            if (element == array[i]) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }

    public void removeDoubles() {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && array[i] != 0) {
                    deleteElementByIndex(i);
                    j--;
                }
            }
        }
    }
// 1 2 6 4 5 6

    public void shuffleArray() {

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[i] = array[random.nextInt(array.length)];//0 - 9
            }
        }

    }

}

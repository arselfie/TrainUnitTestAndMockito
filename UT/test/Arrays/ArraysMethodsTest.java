package Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArraysMethodsTest {

    private ArraysMethods arrayMethods = new ArraysMethods();

    public ArraysMethodsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void cleanArray() {
        // Создаем новый массив перед каждым новым тестом
        arrayMethods.setArray(new int[2]);
    }

    @Test
    public void shouldAddElement() {
        arrayMethods.addElement(1);
        arrayMethods.addElement(5);
        arrayMethods.addElement(5);
        arrayMethods.addElement(7);

        //сравниваем ожидаемый вариант массива с тем, что получаем геттером
        Assert.assertArrayEquals(new int[]{1, 5, 5, 7}, arrayMethods.getArray());

    }

    @Test
    public void shouldChangeElementByIndex() {
        arrayMethods.addElement(1);
        arrayMethods.addElement(5);
        arrayMethods.addElement(7);
        arrayMethods.addElement(9);

        arrayMethods.changeElementByIndex(2, 5);

        Assert.assertArrayEquals(new int[]{1, 5, 5, 9}, arrayMethods.getArray());
    }

    @Test
    public void shouldDeleteElementByIndex() {
        arrayMethods.addElement(1);
        arrayMethods.addElement(5);
        arrayMethods.addElement(7);
        arrayMethods.addElement(9);

        arrayMethods.deleteElementByIndex(0);

        Assert.assertArrayEquals(new int[]{5, 7, 9}, arrayMethods.getArray());
    }

    @Test
    public void shouldDecreasingToAmountOfElements() {
        arrayMethods.addElement(1);
        arrayMethods.addElement(5);
        arrayMethods.addElement(7);
        arrayMethods.addElement(9);

        arrayMethods.decreasingToAmountOfElements(2);

        Assert.assertArrayEquals(new int[]{1, 5}, arrayMethods.getArray());
    }

    @Test
    public void shouldIncreaseToAmountOfElements() {
        arrayMethods.addElement(1);
        arrayMethods.addElement(5);
        arrayMethods.addElement(7);
        arrayMethods.addElement(9);

        arrayMethods.increaseToAmountOfElements(2);

        Assert.assertArrayEquals(new int[]{1, 5, 7, 9, 0, 0}, arrayMethods.getArray());
    }

    @Test
    public void shouldDisplayElementsInRightOrder() {
        arrayMethods.addElement(1);
        arrayMethods.addElement(5);
        arrayMethods.addElement(10);
        arrayMethods.addElement(9);

        arrayMethods.displayElementsInRightOrder();

        Assert.assertArrayEquals(new int[]{1, 5, 10, 9}, arrayMethods.getArray());
    }

    @Test
    public void shouldSortingByBubbleMethod() {
        arrayMethods.addElement(1);
        arrayMethods.addElement(5);
        arrayMethods.addElement(10);
        arrayMethods.addElement(9);

        arrayMethods.sortingByBubbleMethod();

        Assert.assertArrayEquals(new int[]{1, 5, 9, 10}, arrayMethods.getArray());
    }

    @Test
    public void testAddingArrayToArray() {
        arrayMethods.addElement(1);
        arrayMethods.addElement(5);
        arrayMethods.addElement(10);
        arrayMethods.addElement(9);

        arrayMethods.addingArrayToArray(new int[]{1, 2});

        Assert.assertArrayEquals(new int[]{1, 5, 10, 9, 1, 2, 0}, arrayMethods.getArray());
    }

    @Test
    public void shouldRemoveDoubles() {
        arrayMethods.addElement(5);
        arrayMethods.addElement(5);
        arrayMethods.addElement(10);
        arrayMethods.addElement(9);

        arrayMethods.removeDoubles();

        Assert.assertArrayEquals(new int[]{5, 10, 9}, arrayMethods.getArray());
    }

}

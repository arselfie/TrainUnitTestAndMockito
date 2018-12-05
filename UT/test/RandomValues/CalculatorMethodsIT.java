package RandomValues;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import static org.mockito.ArgumentMatchers.anyInt;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

//Добавляем либы и добавляем аннотацию
@RunWith(MockitoJUnitRunner.class)
public class CalculatorMethodsIT {

    public CalculatorMethodsIT() {
    }

    @Before
    public void beforeEachTest() {
//        System.out.println("Before each test");
    }

    @After
    public void afterEachTest() {
//        System.out.println("After each test");
    }

    @BeforeClass
    public static void beforeAllTests() {
//        System.out.println("Before all tests");
    }

    @AfterClass
    public static void afterAllTests() {
//        System.out.println("After all tests");
    }

    // Создаём объекты Мок и Спай
    @Mock
    private CalculatorMethods mock;

    @Spy
    private CalculatorMethods calcSpy;

//    Для игнорирования какого-нибудь теста перед ним делаем заглушку
//    @Ignore
    @Test
    public void shouldReturnSumValues() {
        CalculatorMethods calculatorMethods = new CalculatorMethods();

        Assert.assertEquals(5, calculatorMethods.sum(2, 3));
    }

    //тестируем метод с возвращаемым случайным значением
    @Test
    public void shouldMockSumMethod() {

        Mockito.when(mock.getValue()).thenReturn(10);

        Mockito.when(mock.sumWithRandom(anyInt())).thenCallRealMethod();

        Assert.assertEquals(15, mock.sumWithRandom(5));

    }

    @Test
    public void shouldMockSubstractFrom() {

        Mockito.when(mock.getValue()).thenReturn(2);

        Mockito.when(mock.subtractFrom(anyInt())).thenCallRealMethod();

        Assert.assertEquals(5, mock.subtractFrom(7));
    }

    @Test
    public void shouldMockSubstractFromUsingSpy() {

        Mockito.when(calcSpy.getValue()).thenReturn(10);

        Assert.assertEquals(90, calcSpy.subtractFrom(100));
    }

    @Test
    public void shouldMockMultiply() {

        Mockito.when(mock.getValue()).thenReturn(5);

        Mockito.when(mock.multiply(anyInt())).thenCallRealMethod();

        Assert.assertEquals(50, mock.multiply(10));

    }

    @Test
    public void shouldMockMultiplyUsingSpy() {

        Mockito.when(calcSpy.getValue()).thenReturn(25);

        Assert.assertEquals(125, calcSpy.multiply(5));
    }

    @Test
    public void shouldMockDivide() {

        Mockito.when(mock.getValue()).thenReturn(10);

        Mockito.when(mock.divide(anyInt())).thenCallRealMethod();

        Assert.assertEquals(55, mock.divide(550));
    }

    @Test
    public void shouldMockDivideUsingSpy() {

        Mockito.when(calcSpy.getValue()).thenReturn(5);

        Assert.assertEquals(10, calcSpy.divide(50));
    }

    @Test
    public void shouldMockDivideWithRemainder() {

        Mockito.when(mock.getValue()).thenReturn(5);

        Mockito.when(mock.divideWithRemainder(17)).thenCallRealMethod();

        Assert.assertEquals(2, mock.divideWithRemainder(17));
    }

    @Test
    public void shouldMockDivideWithRemainderUsingSpy() {

        Mockito.when(calcSpy.getValue()).thenReturn(5);

        Assert.assertEquals(1, calcSpy.divideWithRemainder(21));
    }

}

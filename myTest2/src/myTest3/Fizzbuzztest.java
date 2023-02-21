package testFiles;

import oop.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    //Testa 1 och få resultatet 1 ifrån FizzBuzz
    @Test
    public void test1get1() {
        //Arrange
        FizzBuzz fb = new FizzBuzz();
        int testdata = 1;
        String expected = "1";

        //Act
        String actual = fb.getFizzBuzz(testdata);

        //Assert
        assertEquals(expected, actual);
    }

    //Testa 2 och få resultatet 2 ifrån FizzBuzz
    @Test
    public void test2get2() {
        //Arrange
        FizzBuzz fb = new FizzBuzz();
        int testdata = 2;
        String expected = "2";

        //Act
        String actual = fb.getFizzBuzz(testdata);

        //Assert
        assertEquals(expected, actual);
    }

    //Testa 3 och få resultatet Fizz ifrån FizzBuzz
    @Test
    public void test3getFizz() {
        //Arrange
        FizzBuzz fb = new FizzBuzz();
        int testdata = 3;
        String expected = "Fizz";

        //Act
        String actual = fb.getFizzBuzz(testdata);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void test4get4() {
        //Arrange
        FizzBuzz fb = new FizzBuzz();
        int testdata = 4;
        String expected = "4";

        //Act
        String actual = fb.getFizzBuzz(testdata);

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void test5getBuzz() {
        //Arrange
        FizzBuzz fb = new FizzBuzz();
        int testdata = 5;
        String expected = "Buzz";

        //Act
        String actual = fb.getFizzBuzz(testdata);

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void test6getFizz() {
        //Arrange
        FizzBuzz fb = new FizzBuzz();
        int testdata = 6;
        String expected = "Fizz";

        //Act
        String actual = fb.getFizzBuzz(testdata);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void test10getBuzz() {
        //Arrange
        FizzBuzz fb = new FizzBuzz();
        int testdata = 10;
        String expected = "Buzz";

        //Act
        String actual = fb.getFizzBuzz(testdata);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void test15getFizzBuzz() {
        //Arrange
        FizzBuzz fb = new FizzBuzz();
        int testdata = 15;
        String expected = "FizzBuzz";

        //Act
        String actual = fb.getFizzBuzz(testdata);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void test30getFizzBuzz() {
        //Arrange
        FizzBuzz fb = new FizzBuzz();
        int testdata = 30;
        String expected = "FizzBuzz";

        //Act
        String actual = fb.getFizzBuzz(testdata);

        //Assert
        assertEquals(expected, actual);
    }

}